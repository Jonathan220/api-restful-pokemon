package br.com.jonathan.apiresfulpokemon.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jonathan.apiresfulpokemon.model.Pokemon;

public interface PokemonRepository extends JpaRepository<Pokemon, Long>{

}
