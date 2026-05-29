<%-- 
    Document   : get_married_per_gender_outcome
    Created on : 06 May 2026, 9:26:27 AM
    Author     : student
--%>

<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.List"%>
<%@page import="za.ac.tut.model.entity.Agent"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Get Married Per Gender Outcome Page</title>
        <style>
            table,tr,td{
                padding: 8px;
                border-collapse: collapse;
            }
        </style>
    </head>
    <body>
        <div>
            <h1>Get Married Per Gender Outcome</h1>
            <% Long total=(Long)request.getAttribute("total"); %>
            <p>The total agents: <b><%=total%></b></p>
            <table border="1">
                <th>No.</th>
                <th>ID</th>
                <th>Name</th>
                <th>Age</th>
                <th>Gender</th>
                <th>Date of Birth</th>
                <th>Marital Status</th>
                <%
                    List<Agent> agents=(List<Agent>)request.getAttribute("agents");
                    SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
                    for (int i = 0; i < agents.size(); i++) {
                        Agent agent=agents.get(i);
                        Date dob=agent.getDateOfBirth();
                        String birth=dateFormat.format(dob);
                            %>
                            <tr>
                                <td><%= i+1 %></td> 
                                <td><%= agent.getId() %></td> 
                                <td><%= agent.getName() %></td> 
                                <td><%= agent.getAge() %></td> 
                                <td><%= agent.getGender() %></td> 
                                <td><%= birth %></td> 
                                <td><%= agent.getMaritalStatus() %></td> 
                            </tr>
                            <%
                        }
                %>
            </table>
            <p>Choose below:</p>
            <ul>
                <li><a href="menu.html">Menu</a></li>
                <li><a href="index.html">Main</a></li>
            </ul>
        </div>
    </body>
</html>
