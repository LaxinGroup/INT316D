/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
import za.ac.tut.model.bl.MessageFacadeLocal;
import za.ac.tut.model.entity.Message;

/**
 *
 * @author Student
 */
public class GetMessagesPerClassServlet extends HttpServlet {

    @EJB
    private MessageFacadeLocal messageFacade;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String classification=request.getParameter("classification");
       List<Message> messages=messageFacade.messagesPerClass(classification);
       request.setAttribute("messages", messages);
       request.getRequestDispatcher("get_messages_per_class_outcome.jsp").forward(request, response);
    }

    

}
