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
import za.ac.tut.model.entity.Message;

/**
 *
 * @author Student
 */
public class SearchMessageServlet extends HttpServlet {

    @EJB
    private MessageFacadeLocal messageFacade;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Long id=Long.valueOf(request.getParameter("id"));
        Message m=messageFacade.find(id);
        request.setAttribute("m", m);
        request.getRequestDispatcher("search_message_outcome.jsp").forward(request, response);
    }

   
}
