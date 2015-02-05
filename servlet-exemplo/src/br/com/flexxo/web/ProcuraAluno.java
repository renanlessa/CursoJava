package br.com.flexxo.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.flexxo.dao.AlunoDAO;
import br.com.flexxo.modelo.Aluno;


public class ProcuraAluno implements Tarefa {
	
	@Override
	public String executa(HttpServletRequest req, HttpServletResponse resp) {
		AlunoDAO dao = new AlunoDAO();
		
		int codigo = Integer.parseInt(req.getParameter("codigo"));
		
		Aluno aluno = dao.procura(codigo);		

		req.setAttribute("aluno", aluno);	
		
		return "/WEB-INF/jsp/editaAluno.jsp";
	}	
}