<%-- 
    Document   : get_game_result
    Created on : 08 May 2026, 04:48:00
    Author     : student
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Get Game Result Page</title>
    </head>
    <body>
        <div>
            <h1>Get Game Result</h1>
            <%
                String player=(String)session.getAttribute("playerToss"),
                        siri=(String)session.getAttribute("siriToss"),
                        result=(String)session.getAttribute("result");
            %>
            <p>
                Player toss: <b><%=player%></b><br>
                Siri toss: <b><%=siri%></b><br>
                Result: <b><%=result%></b><br>
                Choose below:
            </p>
            <ul>
                <li><a href="enter_toss.jsp">Toss again</a></li>
                <li><a href="EndSessionServlet.do">End Game</a></li>
            </ul>
        </div>
    </body>
</html>
