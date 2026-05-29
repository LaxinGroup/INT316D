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
import za.ac.tut.model.entity.Learner;

/**
 *
 * @author student
 */
public class PassedServlet extends HttpServlet {

    @EJB
    private LearnerFacadeLocal learnerFacade;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Learner> learners=learnerFacade.passed();
        request.setAttribute("learners", learners);
        request.getRequestDispatcher("passed_learners_outcome.jsp").forward(request, response);
    }

}
