package br.com.flexxo.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.flexxo.dao.AlunoDAO;
import br.com.flexxo.modelo.Aluno;


public class EditaAluno implements Tarefa {
	
	@Override
	public String executa(HttpServletRequest req, HttpServletResponse resp) {
		AlunoDAO dao = new AlunoDAO();
		
		Aluno edita = new Aluno();
		
		edita.setCdAluno(Integer.parseInt(req.getParameter("cdAluno")));
		edita.setNome(req.getParameter("nome"));
				
		dao.altera(edita);	
		
		List<Aluno> alunos = dao.findAll();		
		req.setAttribute("alunos", alunos);	
		
		return "/WEB-INF/jsp/listaAlunos.jsp";
	}	
}