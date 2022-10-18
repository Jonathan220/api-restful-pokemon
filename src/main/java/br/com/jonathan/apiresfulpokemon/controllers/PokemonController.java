package br.com.jonathan.apiresfulpokemon.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.jonathan.apiresfulpokemon.data.vo.v1.PokemonVO;
import br.com.jonathan.apiresfulpokemon.services.PokemonService;

@RestController
@RequestMapping(value = "/pokemon/api/v1")
public class PokemonController {
	
	@Autowired
	PokemonService pokemonService;
	
	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public List<PokemonVO> findAll(){
		return pokemonService.findAll();
	}
	
	@GetMapping(value = "/{nome}", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<PokemonVO> findByNome(@PathVariable(value = "nome") String nome){
		return pokemonService.findByNome(nome);
	}
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public PokemonVO create(@RequestBody PokemonVO pokemon) {
		return pokemonService.create(pokemon);
	}
	
	
}
