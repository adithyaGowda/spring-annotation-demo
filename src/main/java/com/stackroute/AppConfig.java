package com.stackroute;


import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;



public class AppConfig {

    @Bean(name = "actor1")
    public Actor getActor1(){

        Actor actor1 = new Actor("John","male",40);
        return actor1;
    }

    @Bean(name = "actor2")
    public Actor getActor2(){

        Actor actor2 = new Actor("Tom","male",35);
        return actor2;
    }

    @Bean(name = "actor3")
    public Actor getActor3(){

        Actor actor3 = new Actor("Mary","female",25);
        return actor3;
    }


    @Bean(name = "movie1")
    public Movie getMovie1(){
        Movie movie1 = new Movie();

        return movie1;
    }

    @Bean(name = "movie1")
    public Movie getMovie2(){
        Movie movie2 = new Movie();

        return movie2;
    }

}
