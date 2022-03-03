package com.codewithshreya.springbootdemo;
import com.example.demo.Logger;
import org.codehaus.plexus.logging.console.ConsoleLogger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;


@SpringBootApplication
@RestController
public class DemoApplication {
}
	public DemoApplication(Logger logger) {

		for (int i = 0; i < 10; i++) {
			logger.log("the current number is " + i);

		}
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
