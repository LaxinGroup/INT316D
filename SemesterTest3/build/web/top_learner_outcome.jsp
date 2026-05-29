<%-- 
    Document   : top_learner_outcome
    Created on : 24 May 2026, 20:45:02
    Author     : student
--%>

<%@page import="za.ac.tut.model.entity.Learner"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Top Learner Page</title>
        <style>
            body{
                margin: 0;
                height: 100vh;
                justify-content: center;
                align-items: center;
                display: flex;
            }
        </style>
    </head>
    <body>
        <div>
            <h1>Top Learner Section</h1>
            <% Learner l=(Learner)request.getAttribute("l"); %>
            <table>
                <tr>
                    <td>ID:</td>
                    <td><%= l.getId() %></td>
                </tr>
                <tr>
                    <td>Name:</td>
                    <td><%= l.getName() %></td>
                </tr>
                <tr>
                    <td>Percentage:</td>
                    <td><%= l.getPercentage() %></td>
                </tr>
            </table>
                <p>Choose below:</p>
            <ul>
                <li><a href="menu.html">Menu Page</a></li>
                <li><a href="index.html">Main Page</a></li>
            </ul>
        </div>
    </body>
</html>
