package com.a.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.a.dslist.dto.GameMinDTO;
import com.a.dslist.entities.Games;
import com.a.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository; // puxando o game repository para dentro do game service
	
	public List<GameMinDTO> findAll(){
		List<Games> resultado = gameRepository.findAll();
		List<GameMinDTO> dto = resultado.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}
}
