<%-- 
    Document   : longest_message_outcome
    Created on : 28 Apr 2026, 13:02:30
    Author     : student
--%>

<%@page import="java.util.List"%>
<%@page import="za.ac.tut.model.entity.Message"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Longest Message Page</title>
    </head>
    <body>
        <div>
            <h1>Longest Message</h1>
            <%
                Message message=(Message)request.getAttribute("message");
                String text=message.getText();
                Integer length=message.getLength(),
                        totalVowels=message.getTotalVowels(),
                        totalConsonants=message.getTotalConsonants();
                List<Character> uniqueLetters=message.getUniqueLetters(),
                        nonUniqueLetters=message.getNonUniqueLetters();
            %>
            <table>
                <tr>
                    <td>Text Message:</td>
                    <td><%=text%></td>
                </tr>
                <tr>
                    <td>Length:</td>
                    <td><%=length%></td>
                </tr>
                <tr>
                    <td>Total Vowels:</td>
                    <td><%=totalVowels%></td>
                </tr>
                <tr>
                    <td>Total Consonants:</td>
                    <td><%=totalConsonants%></td>
                </tr>
                <tr>
                    <td>Unique Letters:</td>
                    <td><%=uniqueLetters%></td>
                </tr>
                <tr>
                    <td>Non-unique Letters:</td>
                    <td><%=nonUniqueLetters%></td>
                </tr>
            </table>
            <p>Choose below:</p>
            <ul>
                <li><a href="menu.html">Menu page</a></li>
                <li><a href="index.html">Main page</a></li>
            </ul>
        </div>
    </body>
</html>
