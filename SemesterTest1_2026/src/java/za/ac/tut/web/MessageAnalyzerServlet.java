/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.tut.model.bl.MessageAnalyzerSBLocal;

/**
 *
 * @author razku
 */
public class MessageAnalyzerServlet extends HttpServlet {
    @EJB MessageAnalyzerSBLocal ma;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session=request.getSession(true);
        
        String message=request.getParameter("message");
        
        Integer length=ma.Length(message),
                numCommas=ma.NumberofCommas(message),
                numFullstops=ma.NumberOfFullstops(message);
        List<String> uniqueWords=ma.ListOfUniqueWords(message),
                nonUniqueWords=ma.ListOfNonUniqueWords(message);
        HashMap<String,Integer> frequency=ma.FrequencyOfOccurrenceOfNonUniqueWords(message);
        
        session.setAttribute("length", length);
        session.setAttribute("numCommas", numCommas);
        session.setAttribute("numFullstops", numFullstops);
        session.setAttribute("uniqueWords", uniqueWords);
        session.setAttribute("nonUniqueWords", nonUniqueWords);
        session.setAttribute("frequency", frequency);
        
        updateSession(session, message);
        
        request.getRequestDispatcher("display_message_details.jsp").forward(request, response);
        
    }
    
    void updateSession(HttpSession session,String message){
        Integer numberOfShortMessages=(Integer)session.getAttribute("numberOfShortMessages");
        List<String> listOfShortMessages=(List<String>)session.getAttribute("listOfShortMessages");
        
        numberOfShortMessages++;
        listOfShortMessages.add(message);
        
        session.setAttribute("numberOfShortMessages", numberOfShortMessages);
        session.setAttribute("listOfShortMessages", listOfShortMessages);
    }

    

}
