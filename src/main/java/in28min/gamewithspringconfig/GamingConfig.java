package in28min.gamewithspringconfig;

import in28min.gamewithspringconfig.GamingConsole;
import in28min.gamewithspringconfig.GameRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfig {

    @Bean
    public GamingConsole game(){
        var game = new PacMan();
        return game;
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game){
        var Gamerunner = new GameRunner(game);
        return Gamerunner;
    }

}
