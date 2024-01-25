package com.example.player.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.*;

import com.example.player.service.PlayerH2Service;
import com.example.player.model.Player;

@RestController

public class PlayerController {
    @Autowired

    public PlayerH2Service playerService;

    @GetMapping("/players")

    public ArrayList<Player> getPlayers() {
        return playerService.getPlayers();
    }

    @GetMapping("/players/{playerId}")

    public Player getplayerbyId(@PathVariable("/playerId") int playerId) {
        return playerService.getPlayerById(playerId);

    }

    @PostMapping("/Players")

    public Player addPlayer(@RequestBody Player player) {

        return playerService.addPlayer(player);
    }

    @PutMapping("/players/{playerId}")

    public Player updatePlayer(@PathVariable("playerId") int playerId, @RequestBody Player player) {
        return updatePlayer(playerId, player);
    }

    @DeleteMapping("/players/{playerId}")

    public void deletePlayer(@PathVariable("playerId") int playerId) {

        playerService.deletePlayer(playerId);
    }

}
