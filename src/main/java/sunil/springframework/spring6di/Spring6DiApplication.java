package sunil.springframework.spring6di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import sunil.springframework.spring6di.controllers.MyController;

@SpringBootApplication
public class Spring6DiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(Spring6DiApplication.class, args);
		MyController controller = ctx.getBean(MyController.class);

		System.out.println("In Main method...");
		System.out.println(controller.sayHello());
	}

}
