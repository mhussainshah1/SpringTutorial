package me.kodysimpson.propertyinjectionannotation;

import org.springframework.stereotype.Service;

@Service
public class GameProviderService {
    public String getGameToPlay() {
        return "World of Warcraft";
    }
}
