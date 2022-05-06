package com.example.demo.services;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.web.client.RestTemplate;
import org.springframework.stereotype.Service;

@Service
public class PokeService 
{
	private String urlPoke = "https://pokeapi.co/api/v2/pokemon";
	String Habilidad;
	String Experiencia;
	String Held_Item;
	String Poke_Id;
	String Poke_name;
	String AreaEnconters;
	public String PokeHabilidades (String PokeNombre)
	{
		try
		{
			RestTemplate restTemplate = new RestTemplate();
			Habilidad =restTemplate.getForObject(urlPoke +"/"+PokeNombre,String.class);
			JSONObject obtenerObj = new JSONObject(Habilidad);
			Habilidad = obtenerObj.optString("abilities");
		}
		catch(JSONException e)
		{
			e.printStackTrace();
		}
		return Habilidad;
	}
	
	public String BasExperiencia (String PokeNombre)
	{
		try
		{
			RestTemplate restTemplate = new RestTemplate();
			Experiencia= restTemplate.getForObject(urlPoke+"/"+PokeNombre,String.class);
			JSONObject ObtenerObj = new JSONObject(Experiencia);
			Experiencia = ObtenerObj.optString("base-experiencia");
		}
		catch(JSONException e)
		{
			e.printStackTrace();
		}
		return Experiencia;
	}
	public String Held (String PokeNombre)
	{
		try
		{
			RestTemplate restTemplate = new RestTemplate();
			Held_Item= restTemplate.getForObject(urlPoke+"/"+PokeNombre,String.class);
			JSONObject obtenerObj = new JSONObject(Held_Item);
			Held_Item=obtenerObj.optString("Held-items");
		}
		catch(JSONException e)
		{
			e.printStackTrace();
		}
		return Held_Item;
	}
	public String Id_Pokemon (String PokeNombre)
	{
		try
		{
			RestTemplate restTemplate = new RestTemplate();
			Poke_Id= restTemplate.getForObject(urlPoke+"/"+PokeNombre,String.class);
			JSONObject obtenerOjc = new JSONObject(Poke_Id);
			Poke_Id = obtenerOjc.optString("id");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return Poke_Id;
	}
	public String Name (String PokeNombre)
	{
		try
		{
			RestTemplate restTemplate = new RestTemplate();
			Poke_name=restTemplate.getForObject(urlPoke+"/"+PokeNombre, String.class);
			JSONObject obtenerObj = new JSONObject(Poke_name);
			Poke_name = obtenerObj.optString("name").toString();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return Poke_name;
	}
	public String LocationArea (String PokeNombre)
	{
		try
		{
			RestTemplate restTemplate = new RestTemplate();
			AreaEnconters = restTemplate.getForObject(urlPoke+"/"+PokeNombre,String.class);
			JSONObject obtenerObj = new JSONObject(AreaEnconters);
			AreaEnconters = obtenerObj.optString("location-area-encouters").toString();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return AreaEnconters;
	}
	public String PokemonNames(String PokeNombre) 
	{
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.getForObject(urlPoke+"/"+PokeNombre,String.class);		
	}
}
