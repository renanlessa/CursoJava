package br.com.flexxo.garagem.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity(name="b2c_carro")
@SequenceGenerator(name="SEQ_CARRO", sequenceName="SEQ_CARRO", initialValue = 1)
public class Carro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator="SEQ_CARRO")
	private int cdCarro;
	
	@Column(nullable=false)
	private String nome;
	private String fabricante;
	private int ano;
	private String cor;

	public int getCdCarro() {
		return cdCarro;
	}
	public void setCdCarro(int cdCarro) {
		this.cdCarro = cdCarro;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	@Override
	public String toString() {
		return "Carro [cdCarro=" + cdCarro + ", nome=" + nome + ", fabricante="
				+ fabricante + ", ano=" + ano + ", cor=" + cor + "]";
	}
}