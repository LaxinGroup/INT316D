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
import za.ac.tut.model.entity.Agent;

/**
 *
 * @author Student
 */
public class GetAgentWithMostReportsPerClassServlet extends HttpServlet {

    @EJB
    private MessageFacadeLocal messageFacade;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String classification=request.getParameter("classification");
        Agent a=messageFacade.agentWithMostReportsPerClass(classification);
        request.setAttribute("a", a);
        request.getRequestDispatcher("get_agent_with_most_reports_per_class_outcome.jsp").forward(request, response);
    }

    

}
