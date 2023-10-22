package com.example.kursspring;

import com.example.kursspring.controllers.QuestController;
import com.example.kursspring.domain.Knight;
import com.example.kursspring.domain.PlayerInformation;
import com.example.kursspring.domain.Quest;
import com.example.kursspring.domain.services.KnightService;
import com.example.kursspring.domain.services.QuestService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.when;


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

    private MockMvc mockMvc;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(questController).build();
    }

    public void testCheckQuest(){

        Quest quest = new Quest("Zadanie test");

        Knight percival = new Knight("Percival", 33);
        Knight lancelot = new Knight("Lancelot", 36);

        percival.setQuest(quest);

        List<Knight> knights = new ArrayList<>(2);

        knights.add(percival);
        knights.add(lancelot);

        when(knightService.getAllKnights()).thenReturn(knights);

    }

    @Test
    public void contextLoads(){
    }



}
