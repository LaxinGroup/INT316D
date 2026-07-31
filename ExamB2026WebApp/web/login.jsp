<%-- 
    Document   : login
    Created on : 31 Jul 2026, 2:43:00 PM
    Author     : Student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
        <link rel="stylesheet" href="style.css"/>
    </head>
    <body>
        <div>
            <h1>Login</h1>
            <p>Fill in below:</p>
            <form action="j_security_check" method="post">
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
                        <td>
                            <button type="submit">LOGIN</button>
                        </td>
                    </tr>
                </table>
            </form>
            <table>
                <tr>
                    <td>
                        <button onclick="location.href='menu.html'">BACK</button>
                    </td>
                </tr>
            </table>
        </div>
    </body>
</html>
