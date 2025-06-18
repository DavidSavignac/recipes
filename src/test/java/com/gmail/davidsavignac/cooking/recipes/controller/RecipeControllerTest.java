package com.gmail.davidsavignac.cooking.recipes.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
@AutoConfigureMockMvc
class RecipeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void findRecipesOfType() throws Exception {

        String jsonResponse = mockMvc.perform(get("/recipe/type/1"))
                .andExpect(status().isOk())
                .andReturn().getResponse().getContentAsString();

        assertThat(jsonResponse)
                .contains("[{\"id\":1,\"name\":\"Pasta alla saracena\",\"recipeType\":{\"id\":1,\"name\":\"Plat principal\"}}]");

    }

    @Test
    void findRecipes() throws Exception {

        String jsonResponse = mockMvc.perform(get("/recipe").param("recipeType", "1"))
                .andExpect(status().isOk())
                .andReturn().getResponse().getContentAsString();

        assertThat(jsonResponse)
                .contains("[{\"id\":1,\"name\":\"Pasta alla saracena\",\"recipeType\":{\"id\":1,\"name\":\"Plat principal\"}}]");

    }
}