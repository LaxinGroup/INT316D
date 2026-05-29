<%-- 
    Document   : game_statistic
    Created on : 08 May 2026, 05:14:42
    Author     : student
--%>

<%@page import="za.ac.tut.model.entity.Game"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Game Statistics Page</title>
    </head>
    <body>
        <div>
            <h1>Game Statistics</h1>
            <% Game game=(Game)request.getAttribute("game"); %>
            <table>
                <tr>
                    <td>Players Name:</td>
                    <td><%= game.getName() %></td>
                </tr>
                <tr>
                    <td>Player ID:</td>
                    <td><%= game.getId() %></td>
                </tr>
                <tr>
                    <td>Number of Games Played:</td>
                    <td><%= game.getGamesPlayed() %></td>
                </tr>
                <tr>
                    <td>Number Won By Siri:</td>
                    <td><%= game.getWonBySiri() %></td>
                </tr>
                <tr>
                    <td>Number Won By Player:</td>
                    <td><%= game.getWonByPlayer() %></td>
                </tr>
                <tr>
                    <td>Tosses by Siri:</td>
                    <td><%= game.getTossesBySiri() %></td>
                </tr>
                <tr>
                    <td>Tosses by Player:</td>
                    <td><%= game.getTossesByPlayer() %></td>
                </tr>
            </table>
                <p>Choose below:</p>
                <ul>
                    <li><a href="menu.html">Menu</a></li>
                    <li><a href="index.html">Main</a></li>
                </ul>
        </div>
    </body>
</html>
