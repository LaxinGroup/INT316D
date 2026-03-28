<%-- 
    Document   : summary
    Created on : 24 Mar 2026, 17:21:38
    Author     : razku
--%>

<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Summary Page</title>
    </head>
    <body>
        <div>
            <h1>Summary</h1>
            <%
                Integer numberOfShortMessages=(Integer)session.getAttribute("numberOfShortMessages");
                List<String> listOfShortMessages=(List<String>)session.getAttribute("listOfShortMessages"); 
            %>
            <p>
                <b>Total Number of Short Messages</b>:<%=numberOfShortMessages%>
            </p>
            <table>
                <thead>List of Short Messages</thead>
                <th>No.</th>
                <th>Message</th>
                <%
                    for (int i = 0; i < listOfShortMessages.size(); i++) {
                            Integer num=i+1;
                            String message=listOfShortMessages.get(i);
                            %>
                <tr>
                    <td><%=num%></td>
                    <td><%=message%></td>
                </tr>
                            <%
                        }
                %>
            </table>
            <ul>
                <li>Click <a href="enter_message.jsp">here</a> to enter a New Message</li>
                <li>Click <a href="EndSessionServlet.do">here</a> to get a Summary</li>
            </ul>
        </div>
    </body>
</html>
