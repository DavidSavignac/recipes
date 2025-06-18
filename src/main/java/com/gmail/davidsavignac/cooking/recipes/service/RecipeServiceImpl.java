package com.gmail.davidsavignac.cooking.recipes.service;

import com.gmail.davidsavignac.cooking.recipes.dto.RecipeDto;
import com.gmail.davidsavignac.cooking.recipes.entity.Recipe;
import com.gmail.davidsavignac.cooking.recipes.mapper.RecipeMapper;
import com.gmail.davidsavignac.cooking.recipes.repository.RecipeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class RecipeServiceImpl implements RecipeService {

    private final RecipeRepository recipeRepository;

    @Override
    public List<RecipeDto> findAllRecipesOfType(long recipeTypeId) {
        List<Recipe> recipes = recipeRepository.findByRecipeTypeId(recipeTypeId);

        log.info("Recipes: {}", recipes);
        return recipes.stream().map(RecipeMapper.MAPPER::mapToRecipeDto).toList();
    }
}
