package com.gmail.davidsavignac.cooking.recipes.controller;


import com.gmail.davidsavignac.cooking.recipes.dto.RecipeDto;
import com.gmail.davidsavignac.cooking.recipes.service.RecipeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("recipe")
@RequiredArgsConstructor
public class RecipeController {

    private final RecipeService recipeService;

    @GetMapping("type/{id}")
    public ResponseEntity<List<RecipeDto>> findRecipesOfTypeWithPathVariable(@PathVariable long id) {

        List<RecipeDto> recipes = recipeService.findAllRecipesOfType(id);
        // service find recipes of type
        return ResponseEntity.ok(recipes);
    }

    @GetMapping
    public ResponseEntity<List<RecipeDto>> findRecipes(@RequestParam(name = "recipeType", required = true) long id) {

        List<RecipeDto> recipes = recipeService.findAllRecipesOfType(id);
        // service find recipes of type
        return ResponseEntity.ok(recipes);
    }
}
