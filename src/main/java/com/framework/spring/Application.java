package com.framework.spring;

import com.framework.spring.game.GameRunner;
import com.framework.spring.game.MarioGame;
import com.framework.spring.game.SuperContraGame;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        //SpringApplication.run(Application.class, args);
        MarioGame game = new MarioGame();

        //SuperContraGame game = new SuperContraGame();
        GameRunner runner = new GameRunner(game);

        runner.runGame();
    }

}
