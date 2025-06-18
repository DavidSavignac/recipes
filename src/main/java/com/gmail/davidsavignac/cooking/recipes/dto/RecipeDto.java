package com.gmail.davidsavignac.cooking.recipes.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public record RecipeDto(
        Long id,
        @NotEmpty(message = "Recipe name should not be null or empty")
        String name,
        @NotNull(message = "Recipe type info should not be null")
        RecipeTypeDto recipeType

) {
}
