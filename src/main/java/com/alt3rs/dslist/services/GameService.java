package com.alt3rs.dslist.services;

import com.alt3rs.dslist.dto.GameDto;
import com.alt3rs.dslist.dto.GameMinDto;
import com.alt3rs.dslist.entities.Game;
import com.alt3rs.dslist.projections.GameMinProjection;
import com.alt3rs.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDto findById(Long id){
        Game result = gameRepository.findById(id).get();
        GameDto dto = new GameDto(result);
        return dto;
    }

    @Transactional(readOnly = true)
    public List<GameMinDto> findAll(){
       List<Game> result = gameRepository.findAll();
       List<GameMinDto> dto = result.stream().map(x -> new GameMinDto(x)).toList();
       return dto;
    }

    @Transactional(readOnly = true)
    public List<GameMinDto> findByList(Long listId){
        List<GameMinProjection> result = gameRepository.searchByList(listId);
        List<GameMinDto> dto = result.stream().map(x -> new GameMinDto(x)).toList();
        return dto;
    }
}
