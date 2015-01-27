package br.com.flexxo.jdbc.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.flexxo.jdbc.modelo.Curso;

public class CursoDAO {
	private Connection con;
	
	public CursoDAO(Connection con) {
		this.con = con;
	}
	
	public void insere(Curso curso) {
		try {
			PreparedStatement ps = this.con.prepareStatement("insert into curso(cdcuso, nome) values (?, ?)");
			ps.setInt(1, curso.getCdCurso());
			ps.setString(2, curso.getNome());
			ps.execute();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void altera(Curso curso) throws SQLException {
		PreparedStatement ps = this.con.prepareStatement("update curso set nome = ? where cdcurso = ?");
		ps.setString(1, curso.getNome());
		ps.setInt(2, curso.getCdCurso());
		ps.execute();
		ps.close();
	}
	
	public void delete(Curso curso) throws SQLException {
		PreparedStatement ps = this.con.prepareStatement("delete from curso where cdcurso = ?");
		ps.setInt(1, curso.getCdCurso());
		ps.execute();
		ps.close();
	}
	
	public List<Curso> listaTodos() throws SQLException {
		List<Curso> cursos = new ArrayList<Curso>();
		String strSQL = "select * from curso";
		PreparedStatement ps = this.con.prepareStatement(strSQL);
		ResultSet rs = ps.executeQuery(strSQL);
		while(rs.next()) {
			Curso curso = new Curso();
			curso.setCdCurso(rs.getInt("cdcurso"));
			curso.setNome(rs.getString("nome"));
			cursos.add(curso);
		}
		return cursos;
	}
	
	public Curso procuraPorCodigo(int cdCurso) throws SQLException {
		Curso curso;
		String strSQL = "select * from curso where cdcurso = ?";
		PreparedStatement ps = this.con.prepareStatement(strSQL);
		ps.setInt(1, cdCurso);
		ResultSet rs = ps.executeQuery(strSQL);
		if(rs.next()) {
			curso = new Curso();
			curso.setCdCurso(rs.getInt("cdcurso"));
			curso.setNome(rs.getString("nome"));
			return curso;
		} else {
			return null;
		}
	}
}
