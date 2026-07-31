<%-- 
    Document   : get_messages_per_class
    Created on : 31 Jul 2026, 1:43:11 PM
    Author     : Student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Messages Per Class Page</title>
        <link rel="stylesheet" href="style.css"/>
    </head>
    <body>
        <div>
            <h1>View Messages Per Class Section</h1>
            <p>Choose below:</p>
            <form action="GetMessagesPerClassServlet.do" method="post">
                <table>
                    <tr>
                        <td>Classification:</td>
                        <td>
                            <select name="classification">
                                <option value="Critical">Critical</option>
                                <option value="High">High</option>
                                <option value="Low">Low</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <button type="submit">VIEW</button>
                        </td>
                    </tr>
                </table>
            </form>
            <table>
                <tr>
                    <td>
                        <button onclick="location.href='manager.html'">BACK</button>
                    </td>
                </tr>
            </table>
        </div>
    </body>
</html>
