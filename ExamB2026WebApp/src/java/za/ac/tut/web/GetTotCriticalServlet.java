/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.model.bl.MessageFacadeLocal;

/**
 *
 * @author Student
 */
public class GetTotCriticalServlet extends HttpServlet {

    @EJB
    private MessageFacadeLocal messageFacade;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Long num=messageFacade.numOfCriticalMessages();
        request.setAttribute("num", num);
        request.getRequestDispatcher("get_tot_critical_outcome.jsp").forward(request, response);
    }

   

}
