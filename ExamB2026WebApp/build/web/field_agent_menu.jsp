<%-- 
    Document   : field_agent_menu
    Created on : 31 Jul 2026, 12:57:32 PM
    Author     : Student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Field Agent Menu Page</title>
        <link rel="stylesheet" href="style.css"/>
    </head>
    <body>
        <div>
            <h1>Field Agent Menu Section</h1>
            <p><b>${name}</b><span> this is </span><b>${siri}</b><span> your web app companion</span><br>Choose below:</p>
            <p><button onclick="location.href='enter_message.jsp'">Enter Message</button></p>
            <p><button onclick="location.href='search_message.jsp'">Search For A Message</button></p>
            <p><button onclick="location.href='GetTotCriticalServlet.do'">View Total Number Of Critical-Priority Messages</button></p>
        </div>
    </body>
</html>
