<%-- 
    Document   : field_agent_menu2
    Created on : 31 Jul 2026, 1:08:02 PM
    Author     : Student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Second Field Agent Menu Page</title>
        <link rel="stylesheet" href="style.css"/>
    </head>
    <body>
        <div>
            <h1>Field Agent Menu Section</h1>
            <p><b>${name}</b> Choose below:</p>
            <p><button onclick="location.href='enter_message.jsp'">Enter Message</button></p>
            <p><button onclick="location.href='search_message.jsp'">Search For A Message</button></p>
            <p><button onclick="location.href='GetTotCriticalServlet.do'">View Total Number Of Critical-Priority Messages</button></p>
        </div>
    </body>
</html>
