package sunil.springframework.spring6di.services.assignment;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import sunil.springframework.spring6di.controllers.assignment.FauxController;

@ActiveProfiles({"DEV", "ES"})
@SpringBootTest
class FauxServiceDevTest {

    @Autowired
    private FauxController controller;

    @Test
    void getFaux() {
        System.out.println(controller.getFauxEnv());
    }
}