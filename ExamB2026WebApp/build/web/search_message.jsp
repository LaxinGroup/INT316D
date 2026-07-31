<%-- 
    Document   : search_message
    Created on : 31 Jul 2026, 1:21:26 PM
    Author     : Student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search Message Page</title>
        <link rel="stylesheet" href="style.css"/>
    </head>
    <body>
        <div>
            <h1>Search Message Section</h1>
            <p><b>${name}</b> fill in the id of the message you want to view, below:</p>
            <form action="SearchMessageServlet.do" method="post">
                <table>
                    <tr>
                        <td>ID:</td>
                        <td>
                            <input type="text" name="id"/>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <button type="submit">SEARCH</button>
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
