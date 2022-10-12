package br.com.jonathan.apiresfulpokemon.mapper.custom;

import br.com.jonathan.apiresfulpokemon.data.vo.v1.PokemonVO;
import br.com.jonathan.apiresfulpokemon.model.Pokemon;

public class PokemonMapper {
	
	public PokemonVO convetEntityToVO(Pokemon pokemon) {
		PokemonVO pokemonVO = new PokemonVO();
		pokemonVO.setId(pokemon.getId());
		pokemonVO.setNumero(pokemon.getNumero());
		pokemonVO.setNome(pokemon.getNome());
		pokemonVO.setValueEffort(pokemon.getValueEffort());
		
		return pokemonVO;
	}
	
	public Pokemon convertVOToEntity(PokemonVO pokemonVO) {
		Pokemon pokemon = new Pokemon();
		pokemon.setId(pokemonVO.getId());
		pokemon.setNumero(pokemonVO.getNumero());
		pokemon.setNome(pokemonVO.getNome());
		pokemon.setValueEffort(pokemonVO.getValueEffort());
		
		return pokemon;
	}
}
