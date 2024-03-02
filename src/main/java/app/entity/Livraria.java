package app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Livraria {
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getSipnose() {
		return sipnose;
	}
	public void setSipnose(String sipnose) {
		this.sipnose = sipnose;
	}
	public String getIssn() {
		return issn;
	}
	public void setIssn(String issn) {
		this.issn = issn;
	}
	public long getAno() {
		return ano;
	}
	public void setAno(long ano) {
		this.ano = ano;
	}
	public long getPaginas() {
		return paginas;
	}
	public void setPaginas(long paginas) {
		this.paginas = paginas;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private long id;
	private String titulo;
	private String sipnose;
	private String issn;
	private long ano;
	private long paginas;
	
	
}
