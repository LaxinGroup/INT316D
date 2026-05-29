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
import za.ac.tut.model.bl.AgentFacadeLocal;
import za.ac.tut.model.entity.Agent;

/**
 *
 * @author student
 */
public class GetAgentsPerAgeRangeServlet extends HttpServlet {

    @EJB
    private AgentFacadeLocal agentFacade;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Integer min=Integer.valueOf(request.getParameter("minAge")),
                max=Integer.valueOf(request.getParameter("maxAge"));
        Character gender=request.getParameter("gender").charAt(0);
        
        Long total=agentFacade.totalNumberOfAgentsPerAgeRange(gender, min, max);
        List<Agent> agents=agentFacade.agentsPerAgeRange(gender,min,max);
        
        request.setAttribute("total", total);
        request.setAttribute("agents", agents); 
        
        request.getRequestDispatcher("get_agents_per_age_range_outcome.jsp").forward(request, response);
        
    }

   

}
