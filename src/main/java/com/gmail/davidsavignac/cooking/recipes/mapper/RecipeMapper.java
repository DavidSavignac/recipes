package com.gmail.davidsavignac.cooking.recipes.mapper;

import com.gmail.davidsavignac.cooking.recipes.dto.RecipeDto;
import com.gmail.davidsavignac.cooking.recipes.entity.Recipe;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RecipeMapper {

    RecipeMapper MAPPER = Mappers.getMapper(RecipeMapper.class);

    RecipeDto mapToRecipeDto(Recipe rec);

    Recipe mapToRecipe(RecipeDto recipeDto);

}
