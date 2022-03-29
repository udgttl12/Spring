package com.framework.spring;

import com.framework.spring.game.GameRunner;
import com.framework.spring.game.MarioGame;
import com.framework.spring.game.SuperContraGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

        GameRunner runner = context.getBean(GameRunner.class);

        //MarioGame game = new MarioGame();

        //SuperContraGame game = new SuperContraGame();
        //GameRunner runner = new GameRunner(game);

        runner.runGame();
    }

}
