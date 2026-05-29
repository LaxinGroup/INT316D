/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.model.bl.QuestionFacadeLocal;
import za.ac.tut.model.entity.Question;

/**
 *
 * @author student
 */
public class SetTestServlet extends HttpServlet {

    @EJB
    private QuestionFacadeLocal questionFacade;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Question q1=new Question(1L,"The sum of 1 and 1 is","A.1","B.2","C.3","D.4","B");
        Question q2=new Question(2L,"The sum of 1 and 0 is","A.1","B.2","C.3","D.4","A");
        Question q3=new Question(3L,"The product of 1 and 1 is","A.1","B.2","C.3","D.4","A");
        Question q4=new Question(4L,"The product of 10 and 3 is","A.10","B.20","C.30","D.40","C");
        Question q5=new Question(5L,"The sum of 4 and 6 is","A.1","B.2","C.3","D.10","D");
        
        questionFacade.createQuestion(q1);
        questionFacade.createQuestion(q2);
        questionFacade.createQuestion(q3);
        questionFacade.createQuestion(q4);
        questionFacade.createQuestion(q5);
        
        response.sendRedirect("set_test_outcome.html");
        
    }


}
