package com.alt3rs.dslist.controllers;

import com.alt3rs.dslist.dto.GameListDto;
import com.alt3rs.dslist.dto.GameMinDto;
import com.alt3rs.dslist.dto.ReplacementDto;
import com.alt3rs.dslist.services.GameListService;
import com.alt3rs.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/list")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDto> findAll(){
        List<GameListDto> result = gameListService.findAll();
        return result;
    }

    @GetMapping(value = "{listId}/games")
    public List<GameMinDto> findByList(@PathVariable Long listId){
        List<GameMinDto> result = gameService.findByList(listId);
        return result;
    }

    @PostMapping(value = "{listId}/replacement")
    public void move(@PathVariable Long listId, @RequestBody ReplacementDto body){
        gameListService.move(listId, body.getSourceIndex(), body.getDestinationIndex());
    }

}
