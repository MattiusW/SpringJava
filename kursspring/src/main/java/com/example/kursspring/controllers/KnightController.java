package com.example.kursspring.controllers;

import com.example.kursspring.components.TimeComponent;
import com.example.kursspring.domain.Knight;
import com.example.kursspring.domain.services.KnightService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
public class KnightController {

    @Autowired
    TimeComponent timeComponent;
    @Autowired
    KnightService service;

    @RequestMapping("/knights")
    public String getKnights(Model model){
        List<Knight> allKnights = service.getAllKnights();
        model.addAttribute("knights", allKnights);
        model.addAttribute("timecomponent", timeComponent);
        return "knights";
    }

    @RequestMapping(value="/knights", method = RequestMethod.POST)
    public String saveKnights(Knight knight){
        service.saveKnight(knight);
        return "redirect:/knights";
    }

    @RequestMapping("/knight")
    public String getKnight(@RequestParam("id") Integer id, Model model){
        Knight knight = service.getKnight(id);
        model.addAttribute("knight", knight);
        model.addAttribute("timecomponent", timeComponent);
        return "knight";
    }

    @RequestMapping("/newknight")
    public String createKnight(Model model){
        model.addAttribute("knight", new Knight());
        model.addAttribute("timecomponent", timeComponent);
        return "knightform";
    }

    @RequestMapping(value="/knight/delete/{id}")
    public String deleteKnight(@PathVariable("id") Integer id){
        service.deleteKnight(id);
        return "redirect:/knights";
    }
}
