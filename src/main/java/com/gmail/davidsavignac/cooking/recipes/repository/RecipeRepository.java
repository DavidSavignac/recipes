package com.gmail.davidsavignac.cooking.recipes.repository;

import com.gmail.davidsavignac.cooking.recipes.entity.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {

    List<Recipe> findByRecipeTypeId(long recipeTypeId);

    @Query("SELECT rec FROM Recipe rec WHERE rec.name = ?1")
    List<Recipe> findByNameCustom(String name);

    @Query(value = "SELECT rec.* FROM Recipe rec WHERE rec.name = ?1", nativeQuery = true)
    List<Recipe> findByNameNative(String name);

}
