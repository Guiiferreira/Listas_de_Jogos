package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.repositories.GameRepository;

@Service//registro de componete do sistema //injetando 
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public  List<GameMinDTO> findAll(){
		var result = gameRepository.findAll();//List<Game>
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();//stream sequência de dados //map transforma
		return dto;
		//return result.stream().map(x -> new GameMinDTO(x)).toList();
	}
	
	
	

}
