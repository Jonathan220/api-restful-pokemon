package br.com.jonathan.apiresfulpokemon.model;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_pokemon")
public class Pokemon implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(nullable = false)
	private int numero;
	
	@Column(nullable = false, length = 50)
	private String nome;
	
	@Column
	private String valueEffort;
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getValueEffort() {
		return valueEffort;
	}

	public void setValueEffort(String valueEffort) {
		this.valueEffort = valueEffort;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nome, numero, valueEffort);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pokemon other = (Pokemon) obj;
		return id == other.id && Objects.equals(nome, other.nome) && numero == other.numero
				&& valueEffort == other.valueEffort;
	}
	
	
}
