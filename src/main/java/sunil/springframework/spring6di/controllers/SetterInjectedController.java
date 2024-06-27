package sunil.springframework.spring6di.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import sunil.springframework.spring6di.services.GreetingService;

@Controller
public class SetterInjectedController {

    //@Autowired
    private GreetingService greetingService;

    @Autowired
    public void setGreetingService(GreetingService greetingService) {
        System.out.println( "SetterInjectedController.setGreetingService" );
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
