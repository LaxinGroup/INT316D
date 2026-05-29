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
public class GetMarriedAgentsPerGenderServlet extends HttpServlet {

    @EJB
    private AgentFacadeLocal agentFacade;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Character gender=request.getParameter("gender").charAt(0);
        Long total=agentFacade.totalNumberOfMarriedPerGender(gender);
        List<Agent> agents=agentFacade.marriedAgentsPerGender(gender);
        
        request.setAttribute("total", total);
        request.setAttribute("agents", agents); 
        
        request.getRequestDispatcher("get_married_per_gender_outcome.jsp").forward(request, response);
    }


}
