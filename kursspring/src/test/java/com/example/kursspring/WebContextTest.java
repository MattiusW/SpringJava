package com.example.kursspring;

import com.example.kursspring.controllers.QuestController;
import com.example.kursspring.domain.PlayerInformation;
import com.example.kursspring.domain.services.KnightService;
import com.example.kursspring.domain.services.QuestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringRunner.class)
@WebAppConfiguration
public class WebContextTest {
    @Mock
    KnightService knightService;

    @Mock
    QuestService questService;

    @Mock
    PlayerInformation playerInformation;

    @InjectMocks
    QuestController questController;

    @Bean
    public void setUp(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void contextLoads(){
    }



}
