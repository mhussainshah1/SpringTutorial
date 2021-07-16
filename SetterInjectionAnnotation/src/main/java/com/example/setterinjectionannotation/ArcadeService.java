package com.example.setterinjectionannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArcadeService {

    private GameProviderService gameProviderService;

    @Autowired
    public void setGameProviderService(GameProviderService gameProviderService) { //The name can be anything
        this.gameProviderService = gameProviderService;
    }

    public void startGame() {
        System.out.println(this.gameProviderService.getGameToPlay() +" is being started");
    }

    public void stopGame() {
        System.out.println(this.gameProviderService.getGameToPlay() + " is being stopped");
    }
}