<%-- 
    Document   : enter_message
    Created on : 31 Jul 2026, 1:04:07 PM
    Author     : Student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Enter Message Page</title>
        <link rel="stylesheet" href="style.css"/>
    </head>
    <body>
        <div>
            <h1>Enter Message Section</h1>
            <p><b>${name}</b> fill in below:</p>
            <form action="AnalyzeMessageServlet.do" method="post">
                <table>
                    <tr>
                        <td>ID:</td>
                        <td>
                            <input type="text" name="id"/>
                        </td>
                    </tr>
                    <tr>
                        <td>Enter Message:</td>
                        <td>
                            <textarea name="message" rows="5" cols="15"></textarea>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <button type="submit">SEND</button>
                        </td>
                    </tr>
                </table>
            </form>
            <table>
                <tr>
                    <td>
                        <button onclick="location.href='field_agent_menu2.jsp'">BACK</button>
                    </td>
                </tr>
            </table>
        </div>
    </body>
</html>
