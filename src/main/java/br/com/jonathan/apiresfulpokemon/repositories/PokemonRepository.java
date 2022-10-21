package br.com.jonathan.apiresfulpokemon.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.jonathan.apiresfulpokemon.model.Pokemon;

@Repository
public interface PokemonRepository extends JpaRepository<Pokemon, Long>{
	public List<Pokemon> findByNome(String nome);
}
