package br.com.jonathan.apiresfulpokemon.services;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.jonathan.apiresfulpokemon.data.vo.v1.PokemonVO;
import br.com.jonathan.apiresfulpokemon.mapper.custom.PokemonMapper;
import br.com.jonathan.apiresfulpokemon.model.Pokemon;
import br.com.jonathan.apiresfulpokemon.repositories.PokemonRepository;

public class PokemonService {
	
	private static final Logger logger = LoggerFactory.getLogger(PokemonService.class);
	
	@Autowired
	PokemonRepository pokemonRepository;
	
	@Autowired
	PokemonMapper pokemonMapper;
	
	public List<PokemonVO> findAll(){
		logger.info("Listando todos os pokemon");
		return pokemonMapper.ConvertListEntityTOListVO(pokemonRepository.findAll());
	}
	
	public List<PokemonVO> findByNome(String nome) {
		logger.info("Encontrando pokemon");
		return pokemonMapper.ConvertListEntityTOListVO(pokemonRepository.findByNome(nome));
	}
	
	public PokemonVO create(PokemonVO pokemon) {
		logger.info("Criando um pokemon");
		
		Pokemon entity = pokemonMapper.convertVOToEntity(pokemon);
		PokemonVO vo = pokemonMapper.convetEntityToVO(pokemonRepository.save(entity));
		
		return vo;
	}
	
	public PokemonVO update(PokemonVO pokemon) {
		logger.info("Atualizando dados do pokemon");
		
		Pokemon entity = pokemonRepository.findById(pokemon.getId()).orElseThrow();
		
		entity.setId(pokemon.getId());
		entity.setNome(pokemon.getNome());
		entity.setNumero(pokemon.getNumero());
		entity.setValueEffort(pokemon.getValueEffort());
		
		return pokemonMapper.convetEntityToVO(pokemonRepository.save(entity));
	}
}
