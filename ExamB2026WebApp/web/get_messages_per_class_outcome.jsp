<%-- 
    Document   : get_messages_per_class_outcome
    Created on : 31 Jul 2026, 1:51:01 PM
    Author     : Student
--%>

<%@page import="java.util.List"%>
<%@page import="za.ac.tut.model.entity.Message"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Messages Per Class Outcome Page</title>
        <link rel="stylesheet" href="style.css"/>
        <style>table,tr,td{border-collapse: collapse;padding: 8px;border-color: black}</style>
    </head>
    <body>
        <div>
            <h1>View Messages Per Class Outcome Section</h1>
            <p>Messages below:</p>
            <table border="1">
                <th>No.</th>
                <th>ID</th>
                <th>Text</th>
                <th>Classification</th>
                <% 
                    List<Message> messages=(List<Message>)request.getAttribute("messages"); 
                    Integer count=0;
                    for(Message m:messages){
                        count++;
                    %>
                <tr>
                    <td><%=count%></td>
                    <td><%= m.getId() %></td>
                    <td><%= m.getText() %></td>
                    <td><%= m.getClassification() %></td>
                </tr>
                <%
                    }
                %>
            </table>
            <p>Choose below:</p>    
            <p><button onclick="location.href='manager.html'">Manager Page</button></p>
            <p><button onclick="location.href='menu.html'">Menu Page</button></p>
            <p><button onclick="location.href='index.html'">Main Page</button></p>
            <p><button onclick="location.href='LogoutServlet.do'">Logout</button></p>
        </div>
    </body>
</html>
