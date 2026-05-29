<%-- 
    Document   : file_not_found
    Created on : 24 May 2026, 20:49:22
    Author     : student
--%>

<%@page isErrorPage="true" contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>File Not Found Page</title>
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
            <h1>File Not Found</h1>
            <h3 style="color: red;">The file you are looking for does not exist</h3>
            <p><a href="index.html">Main page</a></p>
        </div>
    </body>
</html>
