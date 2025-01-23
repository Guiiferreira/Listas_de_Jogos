package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dslist.dto.GameDTO;
import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repositories.GameRepository;

@Service // registro de componete do sistema //injetando
public class GameService {

	@Autowired
	private GameRepository gameRepository;

	@Transactional(readOnly = true) // garantir que a operação do bd aconteça
	public GameDTO findById(Long id) {
		Game result = gameRepository.findById(id).get();
		return new GameDTO(result);

	}

	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();// List<Game>
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();// stream sequência de dados //map
																					// transforma
		return dto;
		// return result.stream().map(x -> new GameMinDTO(x)).toList();
	}

}
