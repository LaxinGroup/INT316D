/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.model.bl.MessageFacadeLocal;
import za.ac.tut.model.entity.Agent;
import za.ac.tut.model.entity.Message;

/**
 *
 * @author Student
 */
public class AnalyzeMessageServlet extends HttpServlet {

    @EJB
    private MessageFacadeLocal messageFacade;
    
  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Long id=Long.valueOf(request.getParameter("id"));
        String text=request.getParameter("message"),
                classification=messageFacade.classification(text.toLowerCase());
        Agent agent=(Agent)request.getSession().getAttribute("agent");
        
        Message message=createMessage(id,text,classification,agent);
        messageFacade.create(message);
        
        response.sendRedirect("enter_message_outcome.jsp");
        
    }

    private Message createMessage(Long id, String text, String classification, Agent agent) {
        Message m=new Message();
        m.setAgent(agent);m.setClassification(classification);m.setCreationDate(new Date());m.setId(id);m.setText(text);
        return m;
    }

    

}
