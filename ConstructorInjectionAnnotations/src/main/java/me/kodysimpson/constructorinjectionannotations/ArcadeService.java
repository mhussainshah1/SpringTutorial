package me.kodysimpson.constructorinjectionannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArcadeService {

    private final GameProviderService gameProviderService;

    @Autowired
    public ArcadeService(GameProviderService gameProviderService) {
        this.gameProviderService = gameProviderService;
    }

    public void startGame() {
        System.out.println(this.gameProviderService.getGameToPlay() +" is being started");
    }

    public void stopGame() {
        System.out.println(this.gameProviderService.getGameToPlay() + " is being stopped");
    }
}