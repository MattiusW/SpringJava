package com.example.kursSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
//@ComponentScan(basePackageClasses = {Starter.class, Castle.class, Quest.class, Knight.class, TestComponent.class})
//@ImportResource("classpath:config/spring-config.xml") //Konfiguracja beanow za pomoca XML
@EnableScheduling
public class KursSpringApplication
{

	public static void main(String[] args)
	{
		SpringApplication.run(KursSpringApplication.class, args);


		/* Zly zapis, sa lepsze narzedzia
		ConfigurableApplicationContext ctx = SpringApplication.run(KursSpringApplication.class, args);
		Castle castle = (Castle)ctx.getBean("castle");
		System.out.println(castle);
		*/
	}

}
