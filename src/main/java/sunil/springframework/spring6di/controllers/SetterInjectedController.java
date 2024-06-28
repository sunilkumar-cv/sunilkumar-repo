package sunil.springframework.spring6di.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import sunil.springframework.spring6di.services.GreetingService;

@Controller
public class SetterInjectedController {

    //@Autowired
    //@Qualifier("setterGreetingBean")
    private GreetingService greetingService;

    @Autowired
    //@Qualifier("setterGreetingBean")
    public void setGreetingService(@Qualifier("setterGreetingBean") GreetingService greetingService) {
        System.out.println( "SetterInjectedController.setGreetingService" );
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
