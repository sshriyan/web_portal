package com.shriyan.controller;
import java.util.logging.Logger;

import com.shriyan.domain.GreetingProperties;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ListingController {
    private static final Logger LOG = Logger.getLogger(ListingController.class.getName());


    //private GreetingProperties greetingProperties;

   // public ListingController(GreetingProperties greetingProperties) {
      //  this.greetingProperties = greetingProperties;
   // }

    public ListingController() {
    }

    /*@RequestMapping("/{languageCode}")
    public String getGreeting(@PathVariable String languageCode){
        //LOG.info("Language Code: " + languageCode);
       // LOG.info("Greeting: " + greetingProperties.getGreetings().get(languageCode.toUpperCase()));
       // return greetingProperties.getGreetings().getOrDefault(languageCode.toUpperCase(), greetingProperties.getGreeting());
        return "A";
    }*/

    /*@RequestMapping("/")
    public String getGreeting(){
        //LOG.info("Greeting: " + greetingProperties.getGreeting());
        //return greetingProperties.getGreeting();
        return "B";
    }*/

    @Value("${greeting:Hello default}")
    private String message;

    @RequestMapping("/")
    String getMessage() {
        return this.message;
    }
}
