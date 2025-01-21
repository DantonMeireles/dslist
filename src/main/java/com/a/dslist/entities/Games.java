package com.a.dslist.entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // essa notation 'entity' configura a classe games do java para que ela seja equivalente a uma tabela do banco relacional
@Table(name = "tb_games")
public class Games {
	// Criando os atributos da classe games
	@Id // incrementando id como chave primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto increment do id no banco
	private Long id;
	private String tittle;
	
	@Column(name = "games_year") // fazendo isso pq 'year' é palavra reservada no banco
	private Integer year;
	private String genre;
	private String plataform;
	private String imgUrl;
	private String shortDescription;
	private String longDescription;
	
	// Constructor
	public Games() {
		
	}
	
	public Games(Long id, String tittle, Integer year, String genre, String plataform,
			String imgUrl, String shortDescription, String longDescription) {
			
				this.id = id;
				this.tittle = tittle;
				this.year = year;
				this.genre = genre;
				this.plataform = plataform;
				this.imgUrl = imgUrl;
				this.shortDescription = shortDescription;
				this.longDescription = longDescription;
				
				// o this. referencia o dado do objeto, no caso os atributos da classe
				// o valor depois do " = " é o argumento do metodo que foi criado
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTittle() {
		return tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getPlataform() {
		return plataform;
	}

	public void setPlataform(String plataform) {
		this.plataform = plataform;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	 // esse hashcode e equals é para que seja possível comparar um games com o outro em uma lista por exemplo
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Games other = (Games) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
