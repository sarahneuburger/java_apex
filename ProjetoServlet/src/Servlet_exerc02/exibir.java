package Servlet_exerc02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class exibir extends HttpServlet{
	


	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		PrintWriter estrutura = resp.getWriter();
		
		String nome = req.getParameter("nome");
		int idade = Integer.parseInt(req.getParameter("idade"));
		
		estrutura.println("<html>");
		estrutura.println("<head>");
		estrutura.println("<title>Dados</title>");
		estrutura.println("</head>");
		estrutura.println("<body>");
		estrutura.println("<b> Exibindo os dados informados :)</b>");
		estrutura.println("<br>");
		estrutura.println("<br>");
		estrutura.println("Os dados informados foram, nome " + nome + " e idade " + idade + ".");
		estrutura.println("</body>");
		estrutura.println("</html>");
	}

}
