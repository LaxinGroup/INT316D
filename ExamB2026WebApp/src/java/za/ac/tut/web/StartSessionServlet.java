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
import za.ac.tut.model.bl.AgentFacadeLocal;
import za.ac.tut.model.entity.Agent;
import za.ac.tut.model.exception.InvalidDataException;


/**
 *
 * @author Student
 */
public class StartSessionServlet extends HttpServlet {

    @EJB
    private AgentFacadeLocal agentFacade;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String idString=request.getParameter("id"),
                name=request.getParameter("name"),
                siri=getServletContext().getInitParameter("Comp");
        Long id=Long.valueOf(idString);
        
        exceptionHandling(idString);
        
        Agent agent=createAgent(id,name);
        agentFacade.create(agent);
        
        request.getSession().setAttribute("name", name);
        request.getSession().setAttribute("siri", siri);
        request.getSession().setAttribute("agent", agent);
        
        response.sendRedirect("field_agent_menu.jsp");
        
    }

    private void exceptionHandling(String idString) {
        if(idString.length()>3||idString.length()<3)throw new InvalidDataException("ID must be 3-digits long");
    }

    private Agent createAgent(Long id, String name) {
        Agent a=new Agent();
        a.setCreationDate(new Date());a.setId(id);a.setName(name);
        return a;
    }

    

  
}
