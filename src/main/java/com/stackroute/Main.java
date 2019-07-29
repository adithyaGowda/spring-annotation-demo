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

        Actor actorRef1 = context.getBean("actor1",Actor.class);
        System.out.println(actorRef1.toString());


        Movie movieRef1 = context.getBean("movie1",Movie.class);
        System.out.println(movieRef1.toString());




    }
}
