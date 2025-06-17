package com.gmail.davidsavignac.cooking.recipes.repository;

import com.gmail.davidsavignac.cooking.recipes.entity.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {

    List<Recipe> findByRecipeTypeId(Long recipeTypeId);
}
