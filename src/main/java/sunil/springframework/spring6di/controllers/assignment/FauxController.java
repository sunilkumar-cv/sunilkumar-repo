package sunil.springframework.spring6di.controllers.assignment;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import sunil.springframework.spring6di.services.assignment.FauxService;

@Controller
public class FauxController {

    private final FauxService fauxService;

    public FauxController(@Qualifier("fauxService") FauxService fauxService) {
        this.fauxService = fauxService;
    }

    public String getFauxEnv() {
        return fauxService.getFaux();
    }
}
