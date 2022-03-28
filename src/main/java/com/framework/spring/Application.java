package com.framework.spring;

import com.framework.spring.game.MarioGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        //SpringApplication.run(Application.class, args);
        MarioGame game = new MarioGame();
        GameRunner runner = new GameRnunner(game);

        runner.run();
    }

}
