package com.gmail.davidsavignac.cooking.recipes.mapper;

import com.gmail.davidsavignac.cooking.recipes.dto.RecipeTypeDto;
import com.gmail.davidsavignac.cooking.recipes.entity.RecipeType;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RecipeTypeMapper {

    RecipeTypeMapper MAPPER = Mappers.getMapper(RecipeTypeMapper.class);

    RecipeTypeDto mapToRecipeTypeDto(RecipeType rec);

    RecipeType mapToRecipeType(RecipeTypeDto recipeTypeDto);
}
