package mypackage;

import java.io.IOException;
import java.io.PrintWriter;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
      response.setContentType("text/html");
      PrintWriter writer = response.getWriter();
      StringBuilder sb = new StringBuilder();
      sb.append("<html><head>");
      sb.append("<title>Sample Application Servlet</title>");
      sb.append("</head>");
      sb.append("<body bgcolor=\"white\">");
      sb.append("<h1>Sample Application Servlet</h1>");
      sb.append("<table border=\"1\">");
      sb.append("<tr>");
      sb.append("<td>Current time is ");
      sb.append(dateTimeStr);
      sb.append(" <p>Please notice this time is updated after refreshing the page.</p></td></tr>");
      sb.append("<tr><td>");
      sb.append("This is the output of a servlet that is part of the Hello World application.");
      sb.append("</td>");
      sb.append("</tr>");
      sb.append("</table>");
      sb.append("<p><a href=\"./\">Back to index.</a></p>");
      sb.append("</body>");
      sb.append("</html>");
      writer.println(sb);
   }
}
