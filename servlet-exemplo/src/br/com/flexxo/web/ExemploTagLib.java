package br.com.flexxo.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.flexxo.dao.AlunoDAO;
import br.com.flexxo.modelo.Aluno;

@WebServlet(urlPatterns="/exemplo")
public class ExemploTagLib extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		AlunoDAO dao = new AlunoDAO();
		
		List<Aluno> alunos = dao.findAll();
		
		req.setAttribute("alunos", alunos);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("exemplo.jsp");
		dispatcher.forward(req, resp);
		
	}

}
