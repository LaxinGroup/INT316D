<%-- 
    Document   : search_message_outcome
    Created on : 31 Jul 2026, 1:26:55 PM
    Author     : Student
--%>

<%@page import="za.ac.tut.model.entity.Message"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search Message Outcome Page</title>
        <link rel="stylesheet" href="style.css"/>
        <style>table,tr,td{border-collapse: collapse;padding: 8px;border-color: black}</style>
    </head>
    <body>
        <div>
            <h1>Search Message Outcome Section</h1>
            <p><b>${name}</b> the message you are looking for below:</p>
            <table border="1">
                <th>ID</th>
                <th>Text</th>
                <th>Classification</th>
                <% Message m=(Message)request.getAttribute("m"); %>
                <tr>
                    <td><%= m.getId() %></td>
                    <td><%= m.getText() %></td>
                    <td><%= m.getClassification() %></td>
                </tr>
            </table>
            <p>Choose below:</p>    
            <p><button onclick="location.href='field_agent_menu2.jsp'">Field Agent Menu</button></p>
            <p><button onclick="location.href='menu.html'">Menu Page</button></p>
            <p><button onclick="location.href='index.html'">Main Page</button></p>
            <p><button onclick="location.href='LogoutServlet.do'">Logout</button></p>
        </div>
    </body>
</html>
