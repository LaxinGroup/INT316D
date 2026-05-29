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
import za.ac.tut.model.bl.LearnerFacadeLocal;
import za.ac.tut.model.entity.Learner;

/**
 *
 * @author student
 */
public class AddLearnerServlet extends HttpServlet {

    @EJB
    private LearnerFacadeLocal learnerFacade;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name=request.getParameter("name");
        
        Learner l=createLearner(name,0.0);
        learnerFacade.create(l);
        
        request.getSession().setAttribute("l", l);
        request.getSession().setAttribute("counter", 0);
        request.getSession().setAttribute("position", 0);
        
        response.sendRedirect("TakeTestServlet.do");
        
    }

    private Learner createLearner(String name, double d) {
        Learner l=new Learner();
        l.setName(name);l.setPercentage(d);
        return l;
    }


}
