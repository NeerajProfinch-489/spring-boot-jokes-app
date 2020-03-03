package neeraj.springframework.springbootjokesapp.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class ChuckNorrisConfiguration {
    private ChuckNorrisQuotes chuckNorrisQuotes;
   // @Bean
    public ChuckNorrisQuotes getChuckNorrisQuotes(){
        return new ChuckNorrisQuotes();
    }

}
