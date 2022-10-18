package br.com.jonathan.apiresfulpokemon.mapper.custom;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.jonathan.apiresfulpokemon.data.vo.v1.PokemonVO;
import br.com.jonathan.apiresfulpokemon.model.Pokemon;

@Service
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
	
	public List<PokemonVO> ConvertListEntityTOListVO(List<Pokemon> listaPokemon){
		List<PokemonVO> destination = new ArrayList<PokemonVO>();
		for(Pokemon entity: listaPokemon){
			destination.add(convetEntityToVO(entity));
		}
		return destination;
	}
	
	public List<Pokemon> ConvertListVOTOListEntity(List<PokemonVO> listaPokemon){
		List<Pokemon> destination = new ArrayList<Pokemon>();
		for(PokemonVO vo: listaPokemon){
			destination.add(convertVOToEntity(vo));
		}
		return destination;
	}
}
