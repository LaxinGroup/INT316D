<%-- 
    Document   : questions
    Created on : 24 May 2026, 20:18:51
    Author     : student
--%>

<%@page import="za.ac.tut.model.entity.Question"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Questions Page</title>
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
            <h1>Question ${num}</h1>
            <% Question q=(Question)request.getAttribute("q"); %>
            <form action="TakeTestServlet.do" method="POST">
                <table>
                    <tr>
                        <td><%= q.getQuestionText() %></td>
                        <td>
                            <select name="answer">
                                <option value="A"><%= q.getOptionA() %></option>
                                <option value="B"><%= q.getOptionB() %></option>
                                <option value="C"><%= q.getOptionC() %></option>
                                <option value="D"><%= q.getOptionD() %></option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td></td>
                        <td>
                            <input type="submit" value="SUBMIT"/>
                        </td>
                    </tr>
                </table>
            </form>
        </div>
    </body>
</html>
