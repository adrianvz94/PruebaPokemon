package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.services.PokeService;

@RestController
@RequestMapping(path="/pokemon")
public class Controller 
{
	@Autowired
	PokeService service;
	
	@GetMapping("/{nombrePokemon}")
	public String AllEndPoint(@PathVariable("nombrePokemon") String pokemon) 
	{
		return service.PokemonNames(pokemon);
	}
	@GetMapping("/abilities")
	public String Habilidades (@PathVariable("nombrePokemon")String pokemon)
	{
		return service.PokeHabilidades(pokemon);
	}
	@GetMapping("/base-experience")
	public String Experiencia (@PathVariable("nombrePokemon")String pokemon)
	{
		return service.BasExperiencia(pokemon);
	}
	@GetMapping("/held-items")
	public String Held_Item(@PathVariable("nombrePokemon")String pokemon)
	{
		return service.Held(pokemon);
	}
	@GetMapping("/id")
	public String PokeId (@PathVariable("nombrePokemon")String pokemon)
	{
		return service.Id_Pokemon(pokemon);
	}
	@GetMapping("/name")
	public String NamePokemon (@PathVariable("nombrePokemon")String pokemon)
	{
		return service.Name(pokemon);
	}
	@GetMapping("/location-area-encounters")
	public String Area_Enc (@PathVariable("nombrePokemon")String pokemon)
	{
		return service.LocationArea(pokemon);
	}
}
