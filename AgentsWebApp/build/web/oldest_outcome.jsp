<%-- 
    Document   : oldest_outcome
    Created on : 06 May 2026, 9:45:29 AM
    Author     : student
--%>

<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="za.ac.tut.model.entity.Agent"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Oldest Outcome Page</title>
        <style>
            table,tr,td{
                padding: 8px;
                border-collapse: collapse;
            }
        </style>
    </head>
    <body>
        <div>
            <h1>Oldest Outcome</h1>
            <table border="1">
                <th>ID</th>
                <th>Name</th>
                <th>Age</th>
                <th>Gender</th>
                <th>Date of Birth</th>
                <th>Marital Status</th>
                <%
                    SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
                        Agent agent=(Agent)request.getAttribute("agent");
                        Date dob=agent.getDateOfBirth();
                        String birth=dateFormat.format(dob);
                            %>
                            <tr> 
                                <td><%= agent.getId() %></td> 
                                <td><%= agent.getName() %></td> 
                                <td><%= agent.getAge() %></td> 
                                <td><%= agent.getGender() %></td> 
                                <td><%= birth %></td> 
                                <td><%= agent.getMaritalStatus() %></td> 
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
