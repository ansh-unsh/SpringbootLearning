package in28min.springautomanage;

import org.springframework.boot.autoconfigure.web.reactive.HttpHandlerAutoConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
        //1. Launch Spring Application /Context
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        //2. Configure the things that we want Spring to manage -@Configuration

        //             In Another Class
        //        @Configuration(It marks a class as a source of bean definition)
        //        public class HelloWorldConfiguration {
        //            @Bean public String name(){return "Ansh";}  }



        //3. Retrieving Beans namaged by Spring
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("person1"));





    }
}
