package sunil.springframework.spring6di.services.assignment;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import sunil.springframework.spring6di.controllers.assignment.FauxController;

@ActiveProfiles({"QA", "EN"})
@SpringBootTest
class FauxServiceQATest {

    @Autowired
    private FauxController fauxController;

    @Test
    void getFaux() {
        System.out.println(fauxController.getFauxEnv());
    }
}