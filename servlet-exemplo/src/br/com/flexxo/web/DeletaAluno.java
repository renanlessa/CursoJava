package br.com.flexxo.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.flexxo.dao.AlunoDAO;
import br.com.flexxo.modelo.Aluno;


public class DeletaAluno implements Tarefa {

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse resp) {
		AlunoDAO dao = new AlunoDAO();
		
		int codigo = Integer.parseInt(req.getParameter("codigo"));
		
		dao.deleta(codigo);
		
		List<Aluno> alunos = dao.findAll();		
		req.setAttribute("alunos", alunos);	
		
		return "/WEB-INF/jsp/listaAlunos.jsp";
	}	
}