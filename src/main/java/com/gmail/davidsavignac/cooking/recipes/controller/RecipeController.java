package com.gmail.davidsavignac.cooking.recipes.controller;


import com.gmail.davidsavignac.cooking.recipes.dto.RecipeDto;
import com.gmail.davidsavignac.cooking.recipes.service.RecipeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("recipe")
@RequiredArgsConstructor
public class RecipeController {

    private final RecipeService recipeService;

    @GetMapping("type/{id}")
    public ResponseEntity<List<RecipeDto>> findRecipesOfType(@PathVariable Long id) {

        List<RecipeDto> recipes = recipeService.findAllRecipesOfType(id);
        // service find recipes of type
        return ResponseEntity.ok(recipes);
    }

}
