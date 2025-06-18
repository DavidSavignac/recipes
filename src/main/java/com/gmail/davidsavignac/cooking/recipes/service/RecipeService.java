package com.gmail.davidsavignac.cooking.recipes.service;

import com.gmail.davidsavignac.cooking.recipes.dto.RecipeDto;

import java.util.List;


public interface RecipeService {

    List<RecipeDto> findAllRecipesOfType(long recipeTypeId);
}
