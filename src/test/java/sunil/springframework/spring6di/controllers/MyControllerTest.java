package sunil.springframework.spring6di.controllers;

import org.junit.jupiter.api.Test;

class MyControllerTest {

    @Test
    void sayHello() {
        MyController controller = new MyController();
        controller.sayHello();
    }
}