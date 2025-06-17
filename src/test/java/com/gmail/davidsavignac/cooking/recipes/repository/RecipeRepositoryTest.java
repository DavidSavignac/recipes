package com.gmail.davidsavignac.cooking.recipes.repository;

import com.gmail.davidsavignac.cooking.recipes.entity.Recipe;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;

@DataJpaTest
class RecipeRepositoryTest {

    @Autowired
    RecipeRepository recipeRepository;

    @Test
    void findByRecipeTypeId() {


        List<Recipe> recipes = recipeRepository.findByRecipeTypeId(1L);
        assertFalse(recipes.isEmpty());

    }

    @Test
    void findByNameCustom() {

        List<Recipe> recipes = recipeRepository.findByNameCustom("Pasta alla saracena");
        assertFalse(recipes.isEmpty());
    }

    @Test
    void findByNameNative() {

        List<Recipe> recipes = recipeRepository.findByNameNative("Pasta alla saracena");
        assertFalse(recipes.isEmpty());
    }
}