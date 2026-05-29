<%-- 
    Document   : unauthorized_access
    Created on : 24 May 2026, 20:49:01
    Author     : student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Unauthorized Access Page</title>
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
            <h1>Unauthorized Access</h1>
            <h3 style="color: red;">You are not authorized to be here</h3>
            <p>Choose below:</p>
            <ul>
                <li><a href="menu.html">Menu Page</a></li>
                <li><a href="index.html">Main Page</a></li>
                <li><a href="LogoutServlet.do">Logout</a></li>
            </ul>
        </div>
    </body>
</html>
