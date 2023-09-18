package com.example.kursSpring;

import com.clockworkjava.component.TestComponent;
import com.example.kursSpring.domain.Castle;
import com.example.kursSpring.domain.Quest;
import com.example.kursSpring.domain.Knight;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = {Starter.class, Castle.class, Quest.class, Knight.class, TestComponent.class})
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
