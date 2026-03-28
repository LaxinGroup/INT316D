/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.tut.model.EmptyDataException;

/**
 *
 * @author razku
 */
public class StartSessionServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, EmptyDataException {
        HttpSession session=request.getSession(true);
        
        String name=request.getParameter("name");
        
        if(name==null||name.isEmpty()){
            throw new EmptyDataException("you did not enter a name");
        }
        
        initializeSession(session);
        
        request.getRequestDispatcher("eneter_message.jsp").forward(request, response);
        
    }
    
    void initializeSession(HttpSession session){
        Integer numberOfShortMessages=0;
        List<String> listOfShortMessages=new ArrayList<>();
        
        session.setAttribute("numberOfShortMessages", numberOfShortMessages);
        session.setAttribute("listOfShortMessages", listOfShortMessages);
        
    }

    

}
