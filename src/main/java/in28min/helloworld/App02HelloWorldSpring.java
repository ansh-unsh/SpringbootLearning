package in28min.helloworld;
import in28min.helloworld.Person;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
        //1. Launch Spring Application /Context
        try(        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)){
            //2. Configure the things that we want Spring to manage -@Configuration

            //             In Another Class
            //        @Configuration(It marks a class as a source of bean definition)
            //        public class HelloWorldConfiguration {
            //            @Bean public String name(){return "Ansh";}  }



            //3. Retrieving Beans namaged by Spring
            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("age"));
            System.out.println(context.getBean("person"));
            System.out.println(context.getBean("address2"));
            //   System.out.println(context.getBean(Address.class));
            System.out.println(context.getBean(Person.class));


            System.out.println(context.getBean("person2MethodCall"));
            System.out.println(context.getBean("person3parameters"));
            System.out.println(context.getBean("person4parameters"));

            System.out.println("\n\n\n");
            //context.getBeanDefinitionNames();
            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);


        }
        }
    }


