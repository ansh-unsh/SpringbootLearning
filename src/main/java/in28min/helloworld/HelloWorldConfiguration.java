package in28min.helloworld;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age,Address address){

}


record Address(String firsLine, String City, String Postal){

}



//Configure the things that we want Spring to manage
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

    @Bean
    @Primary
    Person person(){
        return new Person("Ansh", 25,new Address("228 Roywood", "North York", "M3A2E6"));
    }

    @Bean Person person2MethodCall(){
        return new Person(name(),age(), address() );
    }


    @Bean Person person3parameters(String name, int age, Address address3){
        return new Person(name,age,address3);
    }

    @Bean Person person4parameters(String name, int age, Address add){
        return new Person(name,age,add);
    }




    @Bean(name="address2")
    Address address(){
        return new Address("228 Roywood", "North York", "M3A2E6");
    }

    @Bean(name="address3")
    @Primary
    Address address3(){
        return new Address("Moti Nagar", "Ludhiana", "141010");
    }


}
