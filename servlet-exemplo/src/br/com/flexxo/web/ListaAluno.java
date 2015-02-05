package br.com.flexxo.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.flexxo.dao.AlunoDAO;
import br.com.flexxo.modelo.Aluno;


public class ListaAluno implements Tarefa {
	
	@Override
	public String executa(HttpServletRequest req, HttpServletResponse resp) {
		AlunoDAO dao = new AlunoDAO();
		
		List<Aluno> alunos = dao.findAll();
		
		req.setAttribute("alunos", alunos);
		
		return "/WEB-INF/jsp/listaAlunos.jsp";
	}	
}