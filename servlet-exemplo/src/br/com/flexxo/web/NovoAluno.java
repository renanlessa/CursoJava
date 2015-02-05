package br.com.flexxo.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.flexxo.dao.AlunoDAO;
import br.com.flexxo.modelo.Aluno;


public class NovoAluno implements Tarefa {
	
	@Override
	public String executa(HttpServletRequest req, HttpServletResponse resp) {
		AlunoDAO dao = new AlunoDAO();
		
		Aluno novo = new Aluno();		
		novo.setNome(req.getParameter("nome"));
		dao.insere(novo);
		
		List<Aluno> alunos = dao.findAll();		
		req.setAttribute("alunos", alunos);
		
		req.setAttribute("novoaluno", novo.getNome());
		
		return "/WEB-INF/jsp/listaAlunos.jsp";
	}	
}