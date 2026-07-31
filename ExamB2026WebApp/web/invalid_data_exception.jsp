<%-- 
    Document   : invalid_data_exception
    Created on : 31 Jul 2026, 12:38:43 PM
    Author     : Student
--%>

<%@page isErrorPage="true" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Invalid Data Exception Page</title>
        <link rel="stylesheet" href="style.css"/>
    </head>
    <body>
        <div>
            <h1>Invalid Data Exception</h1>
            <% String message=exception.getMessage(); %>
            <h3>Error message --> <%=message%></h3>
            <button onclick="location.href='index.html'">Main Page</button>
        </div>
    </body>
</html>
