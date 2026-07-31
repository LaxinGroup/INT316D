<%-- 
    Document   : unauthorized_access
    Created on : 31 Jul 2026, 12:33:27 PM
    Author     : Student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Unauthorized Access Page</title>
        <link rel="stylesheet" href="style.css"/>
    </head>
    <body>
        <div>
            <h1>Unauthorized Access</h1>
            <h3>You are not authorized to view these resources</h3>
            <button onclick="location.href='menu.html'">Menu Page</button>
            <button onclick="location.href='index.html'">Main Page</button>
            <button onclick="location.href='LogoutServlet.do'">Logout</button>
        </div>
    </body>
</html>
