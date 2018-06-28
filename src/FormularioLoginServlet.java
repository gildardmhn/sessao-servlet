

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FormularioLoginServlet
 */
@WebServlet("/efetuaLoginServlet")
public class FormularioLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public FormularioLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sessao = request.getSession();
		
		String nome = request.getParameter("nome");
		String senha = request.getParameter("senha");
		
		Usuario usu1 = new Usuario(nome,senha);
		
		sessao.setAttribute("pessoaFormulario", usu1);
		//sessao.removeAttribute("pessoaFormulario");
		
		Usuario usu2 = (Usuario)sessao.getAttribute("pessoaFormulario");
		
		String IdSessao = sessao.getId();
		
		PrintWriter writer = response.getWriter();
		
		writer.println("<html> <body>");
		
			writer.println("Nome: "+ usu1.getNome());
			writer.println("Senha: "+ usu1.getSenha());
			
			writer.println("<br>");
			
			writer.println("Nome: "+ usu2.getNome());
			writer.println("Senha: "+ usu2.getSenha());
			
			writer.println("<br>");
			
			writer.println("Id da sessão: "+ IdSessao);
			
		writer.println("</body> </html>");
	}

}
