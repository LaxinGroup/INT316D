/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
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
import javax.servlet.http.HttpSession;
import za.ac.tut.model.bl.GameFacadeLocal;
import za.ac.tut.model.entity.Game;

/**
 *
 * @author student
 */
public class EndSessionServlet extends HttpServlet {

    @EJB
    private GameFacadeLocal gameFacade;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        HttpSession session=request.getSession();
    
        Integer numOfTosses=(Integer)session.getAttribute("numOfTosses"),
                numWonByPlayer=(Integer)session.getAttribute("numWonByPlayer"),
                numWonBySiri=(Integer)session.getAttribute("numWonBySiri");
        String tossesByPlayer=(String)session.getAttribute("tossesByPlayer"),
                tossesBySiri=(String)session.getAttribute("tossesBySiri"),
                name=(String)session.getAttribute("name");
        
        Game game=createGame(name,numOfTosses,numWonByPlayer,numWonBySiri,tossesByPlayer,tossesBySiri);
        gameFacade.create(game);
        
        request.setAttribute("game", game);
        
        request.getRequestDispatcher("game_statistic.jsp").forward(request, response);
        
        session.invalidate();
    }

    private Game createGame(String name, Integer numOfTosses, Integer numWonByPlayer, Integer numWonBySiri, String tossesByPlayer, String tossesBySiri) {
        Game g=new Game();
        g.setCreationDate(new Date());
        g.setGamesPlayed(numOfTosses);
        g.setName(name);
        g.setTossesByPlayer(tossesByPlayer);
        g.setTossesBySiri(tossesBySiri);
        g.setWonByPlayer(numWonByPlayer);
        g.setWonBySiri(numWonBySiri);
        return g;
    }


}
