<%-- 
    Document   : login
    Created on : 24 May 2026, 20:48:28
    Author     : student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
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
            <h1>Login</h1>
            <form action="j_security_check" method="POST">
                <table>
                    <tr>
                        <td>Username:</td>
                        <td>
                            <input type="text" name="j_username"/>
                        </td>
                    </tr>
                    <tr>
                        <td>Password:</td>
                        <td>
                            <input type="password" name="j_password"/>
                        </td>
                    </tr>
                    <tr>
                        <td></td>
                        <td>
                            <input type="submit" value="LOGIN"/>
                        </td>
                    </tr>
                </table>
            </form>
        </div>
    </body>
</html>
