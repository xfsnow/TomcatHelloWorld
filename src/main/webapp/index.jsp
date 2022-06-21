<%@ page language="java" pageEncoding="utf-8"%>
<%@ page import="java.text.*" %>
<%@ page import="java.util.*" %>
<%!
Date date = new Date();
String strDateFormat = "yyyy-MM-dd HH:mm:ss";
SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
String dateTimeStr = sdf.format(date);
String hello = "Current time is " + dateTimeStr;
%>
<html>
    <head>
        <title>Sample Application JSP Page</title>
    </head>
<body bgcolor="white">
<body>
<h2>Hello World!</h2>
<p><%= hello %></p>
<p>Please notice this time is set at the time of compilatin and not updated after refreshing the page.</p>
<p><a href="/hello/hello">hello from Servlet</a></p>
</body>
</html>