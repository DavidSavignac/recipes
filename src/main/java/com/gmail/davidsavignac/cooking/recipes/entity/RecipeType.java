package com.gmail.davidsavignac.cooking.recipes.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "RECIPE_TYPE")
@Data
public class RecipeType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    Long id;

    @Column(name = "NAME", nullable = false)
    String name;

    @OneToMany(mappedBy = "recipeType", fetch = FetchType.LAZY)
    List<Recipe> recipes;

}
