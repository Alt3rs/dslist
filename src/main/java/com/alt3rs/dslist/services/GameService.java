package com.alt3rs.dslist.services;

import com.alt3rs.dslist.dto.GameMinDto;
import com.alt3rs.dslist.entities.Game;
import com.alt3rs.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDto> findAll(){
       List<Game> result = gameRepository.findAll();
       List<GameMinDto> dto = result.stream().map(x -> new GameMinDto(x)).toList();
       return dto;
    }
}
