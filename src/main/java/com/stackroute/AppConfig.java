package com.stackroute;


import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "actor")
    public Actor getActor(){

        Actor actor = new Actor();
        actor.setName("John");
        actor.setGender("male");
        actor.setAge(30);

        return actor;
    }

    @Bean(name = "movie")
    public Movie getMovie(){
        Movie movie = new Movie();

        return movie;
    }

}
