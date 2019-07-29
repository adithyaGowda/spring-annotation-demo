package com.stackroute;


import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Actor actorRef = context.getBean("actor",Actor.class);

        System.out.println(actorRef.toString());

        Movie movieRef = context.getBean("movie",Movie.class);

        System.out.println(movieRef.toString());


    }
}
