/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
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
 * @author student
 */
public class AnalyzeMessageServlet extends HttpServlet {

    @EJB
    private MessageFacadeLocal messageFacade;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String messageString=request.getParameter("message");
        Integer length=messageString.length(),
                totalVowels=messageFacade.totalVowels(messageString),
                totalConsonants=messageFacade.totalConsonants(messageString);
        List<Character> uniqueLetters=messageFacade.uniqueLetters(messageString);
        List<Character> nonUniqueLetters=messageFacade.nonUniqueLetters(messageString);
        
        Message message=createMessage(messageString,length,totalVowels,totalConsonants,uniqueLetters,nonUniqueLetters);
        messageFacade.create(message);
        
        request.setAttribute("message", message);
        
        request.getRequestDispatcher("analyze_report.jsp").forward(request, response);
        
    }

    private Message createMessage(String messageString, Integer length, Integer totalVowels, Integer totalConsonants, List<Character> uniqueLetters, List<Character> nonUniqueLetters) {
        Message message=new Message();
        message.setLength(length);
        message.setNonUniqueLetters(nonUniqueLetters);
        message.setOnCreation(new Date());
        message.setText(messageString);
        message.setTotalConsonants(totalConsonants);
        message.setTotalVowels(totalVowels);
        message.setUniqueLetters(uniqueLetters);
        return message;
    }

    

}
