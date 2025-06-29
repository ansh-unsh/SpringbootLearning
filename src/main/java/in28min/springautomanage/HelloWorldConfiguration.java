package in28min.springautomanage;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age){

}



//Configure the things that we want Spring to manag
@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name(){
        return "Ansh";
    }

    @Bean
    public int age(){
        return 25;
    }

    @Bean Person person(){
        var person = new Person("Ansh", 25);
        return person;
    }




}
