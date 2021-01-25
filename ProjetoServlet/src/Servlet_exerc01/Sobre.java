package Servlet_exerc01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Sobre extends HttpServlet {
	
	// reencrever o método da classe pai 
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		PrintWriter estrutura = resp.getWriter();
		
		estrutura.println("<html>");
		estrutura.println("<head>");
		estrutura.println("<title>Sobre</title>");
		estrutura.println("</head>");
		estrutura.println("<body>");
		estrutura.println("<b> Bem-vindo, você está na página Sobre :) </b>");
		estrutura.println("<br>");
		estrutura.println("<br>");
		estrutura.println("Acesse um dos links abaixo");
		estrutura.println("<br>");
		estrutura.println("<br>");
		estrutura.println("<a href=\"http://localhost:8080/ProjetoServlet/inicio\">Início</a>");
		estrutura.println("<br>");
		estrutura.println("<br>");
		estrutura.println("<a href=\"http://localhost:8080/ProjetoServlet/sobre\">Sobre</a>");
		estrutura.println("<br>");
		estrutura.println("<br>");
		estrutura.println("<a href=\"http://localhost:8080/ProjetoServlet/contato\">Contato</a>");
		estrutura.println("</body>");
		estrutura.println("</html>");
	}

}
