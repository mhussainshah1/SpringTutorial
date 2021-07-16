package com.example.setterinjectionannotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SetterInjectionAnnotationApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(SetterInjectionAnnotationApplication.class, args);

        ArcadeService arcadeService = applicationContext.getBean(ArcadeService.class);
        arcadeService.startGame();
        arcadeService.stopGame();
    }

}
