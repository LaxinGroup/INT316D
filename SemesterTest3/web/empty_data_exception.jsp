<%-- 
    Document   : empty_data_exception
    Created on : 24 May 2026, 20:50:04
    Author     : student
--%>

<%@page isErrorPage="true" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Empty Data Exception Page</title>
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
            <h1>Empty Data Exception</h1>
            <% String message=exception.getMessage(); %>
            <h3 style="color: red;">Error message --> <%=message%></h3>
            <p><a href="index.html">Main page</a></p>
        </div>
    </body>
</html>
