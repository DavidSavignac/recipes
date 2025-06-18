package com.gmail.davidsavignac.cooking.recipes.dto;

import jakarta.validation.constraints.NotEmpty;

public record RecipeTypeDto(

        Long id,
        @NotEmpty(message = "Recipe type name should not be null or empty")
        String name

) {
}
