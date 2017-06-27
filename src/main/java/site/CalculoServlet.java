package site;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/CalculoServlet")
public class CalculoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html;charset=UTF-8");

		PrintWriter out = response.getWriter();

		double numero1 = Double.parseDouble(request.getParameter("numero1"));

		double numero2 = Double.parseDouble(request.getParameter("numero2"));

		Somar soma = new Somar();

		String msg = "<br>Soma: " + numero1 + " + " + numero2 + " = "
				+ soma.somar(numero1, numero2);

		out.println("<html>");

		out.println("<head>");

		out.println("<title>Soma</title>");

		out.println("</head>");

		out.println("<body><center>");

		out.println("<h1>O resultado da soma obtido</h1><br><br><hr>");

		out.println(msg);

		out.println("<br><hr><br>");

		out.println("<a href='index.jsp'>Voltar</a>");

		out.println("</center></body>");

		out.println("</html>");

		out.close();

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

	}

}
