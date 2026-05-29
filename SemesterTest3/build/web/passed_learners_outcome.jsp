<%-- 
    Document   : passed_learners_outcome
    Created on : 24 May 2026, 20:37:07
    Author     : student
--%>

<%@page import="za.ac.tut.model.entity.Learner"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Learners Who Passed Page</title>
        <style>
            body{
                margin: 0;
                height: 100vh;
                justify-content: center;
                align-items: center;
                display: flex;
            }
            table,tr,td{
                border-collapse: collapse;
                padding: 8px;
            }
        </style>
    </head>
    <body>
        <div>
            <h1>Learners Who Passed</h1>
            <table border="1">
                <th>No.</th>
                <th>ID</th>
                <th>Name</th>
                <th>Percentage</th>
                <%
                    List<Learner> learners=(List<Learner>)request.getAttribute("learners");
                    for (int i = 0; i < learners.size(); i++) {
                        Learner l=learners.get(i);
                            %>
                <tr>
                    <td><%= i+1 %></td>
                    <td><%= l.getId() %></td>
                    <td><%= l.getName() %></td>
                    <td><%= l.getPercentage() %></td>
                </tr>
                <%
                        }
                %>
            </table>
            <p>Choose below:</p>
            <ul>
                <li><a href="menu.html">Menu Page</a></li>
                <li><a href="index.html">Main Page</a></li>
            </ul>
        </div>
    </body>
</html>
