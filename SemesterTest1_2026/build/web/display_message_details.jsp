<%-- 
    Document   : display_message_details
    Created on : 24 Mar 2026, 17:16:39
    Author     : razku
--%>

<%@page import="java.util.HashMap"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Display Message Details Page</title>
    </head>
    <body>
        <div>
            <%
                Integer length=(Integer)session.getAttribute("length"),
                        numCommas=(Integer)session.getAttribute("numCommas"),
                        numFullstops=(Integer)session.getAttribute("numFullstops");
                List<String> uniqueWords=(List<String>)session.getAttribute("uniqueWords"),
                        nonUniqueWords=(List<String>)session.getAttribute("nonUniqueWords");
                HashMap<String,Integer> frequncy=(HashMap<String,Integer>)session.getAttribute("frequncy");
            %>
            <table>
                <tr>
                    <td>
                        <b>Length of the Message</b>:
                    </td>
                    <td><%=length%></td>
                </tr>
                <tr>
                    <td>
                        <b>Total Number of Commas</b>:
                    </td>
                    <td><%=numCommas%></td>
                </tr>
                <tr>
                    <td>
                        <b>Total Number of Fullstops</b>:
                    </td>
                    <td><%=numFullstops%></td>
                </tr>
            </table><br>
            <table>
                <thead>List of Unique Words</thead>
                <th>No.</th>
                <th>Message</th>
                <%
                    for (int i = 0; i < uniqueWords.size(); i++) {
                            Integer num=i+1;
                            String message=uniqueWords.get(i);
                            %>
                <tr>
                    <td><%=num%></td>
                    <td><%=message%></td>
                </tr>
                <%
                        }
                %>
            </table><br>
            <table>
                <thead>List of Non Unique Words</thead>
                <th>No.</th>
                <th>Message</th>
                <%
                    for (int i = 0; i < nonUniqueWords.size(); i++) {
                            Integer num=i+1;
                            String message=nonUniqueWords.get(i);
                            %>
                <tr>
                    <td><%=num%></td>
                    <td><%=message%></td>
                </tr>
                <%
                        }
                %>
            </table><br>
            <table>
                <tr>
                    <td><b>Frequency of Occurrence of Non-Unique Words</b></td>
                </tr>
                <tr>
                    <td><%=frequncy%></td>
                </tr>
            </table>
                <ul>
                    <li>Click <a href="enter_message.jsp">here</a> to enter a New Message</li>
                    <li>Click <a href="summary.jsp">here</a> to get a Summary</li>
                </ul>
        </div>
    </body>
</html>
