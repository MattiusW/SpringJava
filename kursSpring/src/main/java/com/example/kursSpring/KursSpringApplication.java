package com.example.kursSpring;

import com.example.kursSpring.domain.Castle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class KursSpringApplication
{

	public static void main(String[] args)
	{
		ConfigurableApplicationContext ctx = SpringApplication.run(KursSpringApplication.class, args);
		Castle castle = (Castle)ctx.getBean("castle");
	}

}
