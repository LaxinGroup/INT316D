/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author student
 */
public class GetNameServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session=request.getSession(true);
        String name=request.getParameter("name");
        session.setAttribute("name", name);
        startSession(session);
        request.getRequestDispatcher("enter_toss.jsp").forward(request, response);
    }
    
    public void startSession(HttpSession session){
        Integer numOfTosses=0,numWonByPlayer=0,numWonBySiri=0;
        String tossesByPlayer="",tossesBySiri="";
        session.setAttribute("numOfTosses", numOfTosses);
        session.setAttribute("numWonByPlayer", numWonByPlayer);
        session.setAttribute("numWonBySiri", numWonBySiri);
        session.setAttribute("tossesByPlayer", tossesByPlayer);
        session.setAttribute("tossesBySiri", tossesBySiri);
    }

}
