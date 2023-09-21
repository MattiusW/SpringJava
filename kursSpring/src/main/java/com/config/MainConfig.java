package com.config;

import org.springframework.context.annotation.Configuration;

@Configuration
//@PropertySource("classpath:castle.properties")
public class MainConfig
{
    /*
    @Bean //Konfiguracja beanow
    public Quest createQuest()
    {
        return new Quest();
    }
    @Bean
    @Scope("prototype")
    public Knight knight()
    {
        Knight knight = new Knight("Lancelot", 29);
        knight.setQuest(createQuest()); //Wstrzyknij beana o klasie quest
        return knight;
    }
    @Bean(name="zamek", initMethod="build", destroyMethod="teraDown") //Mozna ustawic metody ktore zostana wywolane gdy bean zosatnie utworzony
    @Value("${my.castle.name:East Watch}")
    public Castle castle(String name)
    {
        Castle castle = new Castle(knight());
        castle.setName(name);

        return castle;
    }
     */

}
