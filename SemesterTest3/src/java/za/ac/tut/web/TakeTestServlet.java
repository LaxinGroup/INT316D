/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.model.bl.LearnerFacadeLocal;
import za.ac.tut.model.bl.QuestionFacadeLocal;
import za.ac.tut.model.bl.ResultFacadeLocal;
import za.ac.tut.model.entity.Learner;
import za.ac.tut.model.entity.Question;
import za.ac.tut.model.entity.Result;

/**
 *
 * @author student
 */
public class TakeTestServlet extends HttpServlet {

    @EJB
    private ResultFacadeLocal resultFacade;

    @EJB
    private QuestionFacadeLocal questionFacade;

    @EJB
    private LearnerFacadeLocal learnerFacade;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action=request.getParameter("action");
        Integer position=(Integer)request.getSession().getAttribute("position");
        
        if(position==null)position=0;request.getSession().setAttribute("position", position);
        
        if("next".equals(action))position++;request.getSession().setAttribute("position", position);
        
        List<Question> questions=questionFacade.findAll();
        
        if(position<questions.size()){
            Question q=questions.get(position);
            request.setAttribute("q", q);
            request.setAttribute("num", position+1);
            request.getRequestDispatcher("questions.jsp").forward(request, response);
        }else{
            Learner l=(Learner)request.getSession().getAttribute("l");
            Integer counter=(Integer)request.getSession().getAttribute("counter");
            Double percentage=((double)counter/questions.size())*100;
            l.setPercentage(percentage);learnerFacade.edit(l);
            request.setAttribute("percentage", percentage);
            request.getRequestDispatcher("percentage.jsp").forward(request, response);
        }
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Integer postion=(Integer)request.getSession().getAttribute("position");
        Integer counter=(Integer)request.getSession().getAttribute("counter");
        
        String learnerAnswer=request.getParameter("answer"),result="";
        
        List<Question> questions=questionFacade.findAll();
        
        Question q=questions.get(postion);
        
        Learner l=(Learner)request.getSession().getAttribute("l");
        
        if(learnerAnswer.equalsIgnoreCase(q.getAnswer())){counter++;result="correct";}
        else result="wrong";
        
        Result r=createResult(l,q,learnerAnswer);
        resultFacade.create(r);
        
        request.getSession().setAttribute("counter", counter);
        
        request.setAttribute("learnerAnswer", learnerAnswer);
        request.setAttribute("result", result);
        request.setAttribute("correctAnswer", q.getAnswer());
        
        request.getRequestDispatcher("answer.jsp").forward(request, response);
        
    }

    private Result createResult(Learner l, Question q, String learnerAnswer) {
        Result r=new Result();
        r.setLearner(l);r.setLearnerAnswer(learnerAnswer);r.setQuestion(q);
        return r;
    }


}
