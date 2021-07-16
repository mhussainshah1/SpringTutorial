package me.kodysimpson.constructorinjectionannotations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ConstructorInjectionAnnotationsApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(ConstructorInjectionAnnotationsApplication.class, args);

        ArcadeService arcadeService = applicationContext.getBean(ArcadeService.class);
        arcadeService.startGame();
        arcadeService.stopGame();
    }
}
