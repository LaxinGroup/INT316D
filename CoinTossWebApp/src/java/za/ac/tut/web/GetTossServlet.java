/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package za.ac.tut.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import za.ac.tut.model.bl.GameFacadeLocal;

/**
 *
 * @author student
 */
public class GetTossServlet extends HttpServlet {

    @EJB
    private GameFacadeLocal gameFacade;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session=request.getSession();
        String playerToss=request.getParameter("toss"),
                siriToss=gameFacade.siriToss(),
                result=gameFacade.result(playerToss, siriToss);
        
        getSession(session, playerToss, siriToss);
        session.setAttribute("playerToss", playerToss);
        session.setAttribute("siriToss", siriToss);
        session.setAttribute("result", result);
        
        request.getRequestDispatcher("get_game_result.jsp").forward(request, response);
        
    }
    
    private void getSession(HttpSession session,String playerToss,String siriToss){
        Integer numOfTosses=(Integer)session.getAttribute("numOfTosses"),
                numWonByPlayer=(Integer)session.getAttribute("numWonByPlayer"),
                numWonBySiri=(Integer)session.getAttribute("numWonBySiri");
        String tossesByPlayer=(String)session.getAttribute("tossesByPlayer"),
                tossesBySiri=(String)session.getAttribute("tossesBySiri");
        
        numOfTosses++;
        
        if(playerToss.equalsIgnoreCase(siriToss))numWonByPlayer++;
        else numWonBySiri++; 
        
        tossesByPlayer+=playerToss+",";
        tossesBySiri+=siriToss+",";
        
        session.setAttribute("numOfTosses", numOfTosses);
        session.setAttribute("numWonByPlayer", numWonByPlayer);
        session.setAttribute("numWonBySiri", numWonBySiri);
        session.setAttribute("tossesByPlayer", tossesByPlayer);
        session.setAttribute("tossesBySiri", tossesBySiri);
        
    }

}
