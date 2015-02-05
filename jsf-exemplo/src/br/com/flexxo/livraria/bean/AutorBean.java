package br.com.flexxo.livraria.bean;

import java.util.List;

import javax.faces.bean.ManagedBean;

import br.com.flexxo.livraria.dao.DAO;
import br.com.flexxo.livraria.modelo.Autor;

@ManagedBean
public class AutorBean {

	private Autor autor = new Autor();
	private int id;
	
	
	public void deleta() {
		
		DAO<Autor> dao = new DAO<Autor>(Autor.class);
		Autor autor = dao.buscaPorId(this.id);
		
		dao.remove(autor);
	}
	
	public Autor getAutor() {
		return autor;
	}
	
	public List<Autor> getAutores() {
		return new DAO<Autor>(Autor.class).listaTodos();
	}

	public void gravar() {
		System.out.println("Gravando autor " + this.autor.getNome());

		new DAO<Autor>(Autor.class).adiciona(this.autor);
		
		this.autor = new Autor();
		
		//return "livro?faces-redirect=true";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
