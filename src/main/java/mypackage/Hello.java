package mypackage;

import java.net.InetAddress;

import java.io.IOException;
import java.io.PrintWriter;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public final class Hello extends HttpServlet {

   /**
    *
    */
   private static final long serialVersionUID = 7590183391752570596L;

   public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
      Date date = new Date();
      String strDateFormat = "yyyy-MM-dd HH:mm:ss";
      SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
      // 设置时区为东 8 区
      sdf.setTimeZone(TimeZone.getTimeZone("GMT+8"));
      String dateTimeStr = sdf.format(date);
      String clientIp = IpUtil.getIpAddress(request);
      InetAddress inetadd = InetAddress.getLocalHost();
      response.setContentType("text/html");
      PrintWriter writer = response.getWriter();
      StringBuilder sb = new StringBuilder();
      sb.append("<html><head>")
            .append("<title>Sample Application Servlet</title>")
            .append("</head>")
            .append("<body bgcolor=\"white\">")
            .append("<h1>Sample Application Servlet from Java Spring in Tomcat</h1>")
            .append("<P>You're visiting from IP ").append(clientIp)
            .append(". Current time is ").append(dateTimeStr)
            .append("<p>This application is running on ").append(inetadd.getHostName()).append(" with IP ")
            .append(inetadd.getHostAddress()).append(".</p>")
            .append("<p>Please notice this time is updated after refreshing the page.</p>")
            .append(
                  "<h3><a href=\"/hello\">Back to web app root.</a></h3><h3><a href=\"/\">Back to homepage.</a></h3></body></html>");
      writer.println(sb);
   }
}
