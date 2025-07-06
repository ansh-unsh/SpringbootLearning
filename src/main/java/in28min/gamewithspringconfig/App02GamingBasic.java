package in28min.gamewithspringconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02GamingBasic {
    public static void main(String[] args) {


        try(var context =
                    new AnnotationConfigApplicationContext
                            (GamingConfig.class))
        {
            context.getBean(GamingConsole.class).up();

            context.getBean(GameRunner.class).run();
        }

    }
}
