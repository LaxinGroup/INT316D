<%-- 
    Document   : answer
    Created on : 24 May 2026, 20:26:09
    Author     : student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Answer Page</title>
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
            <h1>Answer</h1>
            <table>
                <tr>
                    <td>Learner Answer:</td>
                    <td>${learnerAnswer}</td>
                </tr>
                <tr>
                    <td>Correct Answer:</td>
                    <td>${correctAnswer}</td>
                </tr>
                <tr>
                    <td>Result:</td>
                    <td>${result}</td>
                </tr>
            </table>
            <a href="TakeTestServlet.do?action=next">Next</a>
        </div>
    </body>
</html>
