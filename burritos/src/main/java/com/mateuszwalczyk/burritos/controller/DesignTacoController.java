package com.mateuszwalczyk.burritos.controller;

import com.mateuszwalczyk.burritos.model.Ingredient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.asm.Type;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Slf4j
@Controller
@RequestMapping("/design")
public class DesignTacoController {

    @GetMapping
    public String showDesignForm(Model model){
        List<Ingredient> ingredients = Arrays.asList(
                new Ingredient("FLTO", "pszenna", Ingredient.Type.WRAP),
                new Ingredient("COTO", "kukurydziana", Ingredient.Type.WRAP),
                new Ingredient("GRBF", "mielona wolowina", Ingredient.Type.PROTEIN),
                new Ingredient("CARN", "kawalki miesa", Ingredient.Type.PROTEIN),
                new Ingredient("TMTO", "pomidory w kostke", Ingredient.Type.VEGGIES),
                new Ingredient("LETC", "salata", Ingredient.Type.VEGGIES),
                new Ingredient("CHED", "cheddar", Ingredient.Type.CHEESE),
                new Ingredient("JACK", "Monterey Jack", Ingredient.Type.CHEESE),
                new Ingredient("SLSA", "pikantny sos pomidorowy", Ingredient.Type.SAUCE),
                new Ingredient("SRCR", "smietana", Ingredient.Type.SAUCE)
        );
        Ingredient.Type[] types = Ingredient.Type.values();
        for(Ingredient.Type type : types){
            model.addAttribute(type.toString().toLowerCase(), Ingredient.filterByType(ingredients, type));
        }
        model.addAttribute("design", new Object());
        return "design";
    }

}
