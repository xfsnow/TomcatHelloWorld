package mypackage;

import java.io.IOException;
import java.io.PrintWriter;

import java.text.SimpleDateFormat;
import java.util.Date;

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
      String dateTimeStr = sdf.format(date);
      String clientIp = IpUtil.getIpAddress(request);
      response.setContentType("text/html");
      PrintWriter writer = response.getWriter();
      StringBuilder sb = new StringBuilder();
      sb.append("<html><head>");
      sb.append("<title>Sample Application Servlet</title>");
      sb.append("</head>");
      sb.append("<body bgcolor=\"white\">");
      sb.append("<h1>Sample Application Servlet</h1>");
      sb.append("<P>You're visiting from IP ").append(clientIp).append(". Current time is ");
      sb.append(dateTimeStr);
      sb.append("<p>Please notice this time is updated after refreshing the page.</p>");
      sb.append("<p>This is the output of a servlet that is part of the Hello World application.</p>");
      sb.append("<h3><a href=\"/\">Back to homepage.</a></h3></body>");
      sb.append("</html>");
      writer.println(sb);
   }
}
