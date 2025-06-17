package com.gmail.davidsavignac.cooking.recipes.repository;


import com.gmail.davidsavignac.cooking.recipes.entity.RecipeType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeTypeRepository extends JpaRepository<RecipeType, Long> {

}
