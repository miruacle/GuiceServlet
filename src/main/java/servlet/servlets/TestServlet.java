package servlet.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.inject.Singleton;

@Singleton
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 7528373021106530918L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		StringBuilder html= new StringBuilder("<TABLE border='1'>");
		 html.append("<TR>");

         html.append("<TD>");

         html.append("1__________________________");

         html.append("</TD>");

         html.append("<TD>");

         html.append("2__________________________");

         html.append("</TD>");

         html.append("<TR>");
         
         html.append("<TABLE>");
		resp.getWriter().write(html.toString());
	}
}
