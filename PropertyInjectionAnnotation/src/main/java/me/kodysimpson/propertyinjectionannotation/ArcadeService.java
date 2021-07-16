package me.kodysimpson.propertyinjectionannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArcadeService {

    @Autowired //It uses reflection to autowired the field / property
    private GameProviderService gameProviderService;

    public void startGame() {
        System.out.println(this.gameProviderService.getGameToPlay() +" is being started");
    }

    public void stopGame() {
        System.out.println(this.gameProviderService.getGameToPlay() + " is being stopped");
    }
}