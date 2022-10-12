package br.com.jonathan.apiresfulpokemon.data.vo.v1;

import java.io.Serializable;
import java.util.Objects;

public class PokemonVO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private long id;
	private int numero;
	private String nome;	
	private int valueEffort;
	
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
	
	public int getValueEffort() {
		return valueEffort;
	}
	
	public void setValueEffort(int valueEffort) {
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
		PokemonVO other = (PokemonVO) obj;
		return id == other.id && Objects.equals(nome, other.nome) && numero == other.numero
				&& valueEffort == other.valueEffort;
	}

}
