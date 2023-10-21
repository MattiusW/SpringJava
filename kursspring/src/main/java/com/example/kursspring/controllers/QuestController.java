package com.example.kursspring.controllers;


import org.springframework.ui.Model;
import com.example.kursspring.domain.Knight;
import com.example.kursspring.domain.Quest;
import com.example.kursspring.domain.services.KnightService;
import com.example.kursspring.domain.services.QuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public class QuestController {

    @Autowired
    KnightService knightService;

    @Autowired
    QuestService questService;

    @RequestMapping("/assignQuest")
    public String assignQuest(@RequestParam("knightId") Integer id, Model model){
        Knight knight = knightService.getKnight(id);
        List<Quest> notStartedQuest = questService.getAllNotStartedQuest();
        model.addAttribute("knight", knight);
        model.addAttribute("notStartedQuest", notStartedQuest);
        return "assignQuest";
    }
}
