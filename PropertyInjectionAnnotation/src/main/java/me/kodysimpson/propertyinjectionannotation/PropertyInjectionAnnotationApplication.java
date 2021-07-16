package me.kodysimpson.propertyinjectionannotation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PropertyInjectionAnnotationApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(PropertyInjectionAnnotationApplication.class, args);

        ArcadeService arcadeService = applicationContext.getBean(ArcadeService.class);
        arcadeService.startGame();
        arcadeService.stopGame();
    }

}
