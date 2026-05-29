<%-- 
    Document   : login_error
    Created on : 24 May 2026, 20:48:11
    Author     : student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Error Page</title>
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
            <h1>Login Error</h1>
            <h3 style="color: red;">You have entered invalid credentials</h3>
            <p>Choose below:</p>
            <ul>
                <li><a href="menu.html">Menu Page</a></li>
                <li><a href="index.html">Main Page</a></li>
            </ul>
        </div>
    </body>
</html>
