package com.example.demo;
import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Secondpage {

	public static void main(String[] args) {
		
		ApplicationContext appcon=new AnnotationConfigApplicationContext(Secondpage.class);
		service serv= appcon.getBean(service.class);
		System.out.println("Printing the participant service : "+serv.getdata());
		SpringApplication.run(Secondpage.class,args);
		
	
	}
}
		
/*		
		
		SpringApplication.run(Secondpage.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {

			System.out.println("hello Spring Boot:");

			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for (String beanName : beanNames) {
				System.out.println(beanName);
			}

		};
	}

} */