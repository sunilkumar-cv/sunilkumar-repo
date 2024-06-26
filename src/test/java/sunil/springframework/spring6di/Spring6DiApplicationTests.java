package sunil.springframework.spring6di;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import sunil.springframework.spring6di.controllers.MyController;

@SpringBootTest
class Spring6DiApplicationTests {

	@Autowired
	ApplicationContext applicationContext;
	
	@Autowired
	MyController controller;

	@Test
	void testAutowireOfMyController() {
		System.out.println("In testAutowireOfMyController method");
		System.out.println(controller.sayHello());
	}

	@Test
	void testGetControllerFromContext() {
		System.out.println("In testGetControllerFromContext method..");
		MyController controller = applicationContext.getBean(MyController.class);
		System.out.println(controller.sayHello());
	}

	@Test
	void contextLoads() {
	}

}
