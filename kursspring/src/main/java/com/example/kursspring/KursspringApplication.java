package com.example.kursspring;

import com.clockworkjava.component.TestComponent;
import com.example.kursspring.domain.Castle;
import com.example.kursspring.domain.Knight;
import com.example.kursspring.domain.Quest;
import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = {Starter.class, Castle.class, Quest.class, Knight.class, TestComponent.class})
public class KursspringApplication {

	public static void main(String[] args) {
		SpringApplication.run(KursspringApplication.class, args);

	}

}
