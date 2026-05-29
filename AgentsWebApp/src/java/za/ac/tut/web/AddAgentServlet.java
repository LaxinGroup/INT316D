/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.model.bl.AgentFacadeLocal;
import za.ac.tut.model.entity.Agent;
import za.ac.tut.model.exception.InvalidDateFormatException;

/**
 *
 * @author student
 */
public class AddAgentServlet extends HttpServlet {

    @EJB
    private AgentFacadeLocal agentFacade;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
            Long id=Long.valueOf(request.getParameter("id"));
            String name=request.getParameter("name");
            Integer age=Integer.valueOf(request.getParameter("age"));
            String status=request.getParameter("status");
            Character gender=request.getParameter("gender").charAt(0);
            String dobString=request.getParameter("dob");
            Date dob=dateFormat.parse(dobString);
            Integer count=agentFacade.count();
            
            Agent agent=createAgent(id,name,age,status,gender,dob);
            agentFacade.create(agent);
            
            
            response.sendRedirect("add_agent_outcome.html");
            
        } catch (ParseException e) {
            throw new InvalidDateFormatException(e.getMessage());
        }
        
        
    }

    private Agent createAgent(Long id, String name, Integer age, String status, Character gender, Date dob) {
        Agent a=new Agent();
        a.setAge(age);
        a.setCreationDate(new Date());
        a.setDateOfBirth(dob);
        a.setGender(gender);
        a.setId(id);
        a.setMaritalStatus(status);
        a.setName(name);
        return a;
    }


}
