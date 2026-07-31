<%-- 
    Document   : get_agent_with_most_reports_per_class_outcome
    Created on : 31 Jul 2026, 2:04:29 PM
    Author     : Student
--%>

<%@page import="za.ac.tut.model.entity.Agent"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Agent With Most Reports Per Class Outcome Page</title>
        <link rel="stylesheet" href="style.css"/>
        <style>table,tr,td{border-collapse: collapse;padding: 8px;border-color: black}</style>
    </head>
    <body>
        <div>
            <h1>View Agent With Most Reports Per Class Outcome Section</h1>
            <p>Agent below:</p>
            <table border="1">
                <th>ID</th>
                <th>Name</th>
                <% Agent a=(Agent)request.getAttribute("a"); %>
                <tr>
                    <td><%= a.getId() %></td>
                    <td><%= a.getName() %></td>
                </tr>
            </table>
            <p>Choose below:</p>    
            <p><button onclick="location.href='manager.html'">Manager Page</button></p>
            <p><button onclick="location.href='menu.html'">Menu Page</button></p>
            <p><button onclick="location.href='index.html'">Main Page</button></p>
            <p><button onclick="location.href='LogoutServlet.do'">Logout</button></p>
        </div>
    </body>
</html>
