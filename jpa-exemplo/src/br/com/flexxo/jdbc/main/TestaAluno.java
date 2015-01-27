package br.com.flexxo.jdbc.main;

import java.sql.SQLException;

import javax.persistence.EntityManager;

import br.com.flexxo.jdbc.database.AlunoDAO;
import br.com.flexxo.jdbc.database.Conexao;
import br.com.flexxo.jdbc.database.MatriculaDAO;
import br.com.flexxo.jdbc.modelo.Aluno;
import br.com.flexxo.jdbc.modelo.Matricula;

public class TestaAluno {

	public static void main(String[] args) throws SQLException {
		EntityManager em = Conexao.getEntityManager();
		
		MatriculaDAO dao = new MatriculaDAO(em);
		
		// insere novo aluno
		AlunoDAO alunoDAO = new AlunoDAO(em);
		
		Aluno novo = new Aluno();
		novo.setNome("Ciclano");
		alunoDAO.insere(novo);
		
		// altera aluno
		Aluno altera = new Aluno();
		altera.setCdAluno(3);
		altera.setNome("Maria");
		alunoDAO.altera(altera);
		
		// deleta aluno
		alunoDAO.deleta(4);
		
		// Lista Todos
		for (Matricula temp : dao.findAll()) {
			System.out.print(temp.getCdMatricula() + " ");
			System.out.print(temp.getCurso().getNome() + " ");
			System.out.println(temp.getAluno().getNome());
		}
		
		// Lista por nome de aluno
		for (Matricula temp : dao.findByNomeAluno("Renan")) {
			System.out.print(temp.getCdMatricula() + " ");
			System.out.print(temp.getCurso().getNome() + " ");
			System.out.println(temp.getAluno().getNome());
		}
		
		
		System.exit(0);
		
	}
}