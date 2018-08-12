package org.arquillian.example.helloworld;

import javax.enterprise.context.RequestScoped;
import javax.ejb.EJB;
import javax.ejb.Singleton;
import javax.ejb.Startup;

@Singleton
@Startup
public class GreetingService {

    public String greet(String who) {
        return "Hello, " + who + "!";
    }
}
