package com.gmail.davidsavignac.cooking.recipes.entity;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "RECIPE_TYPE")
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RecipeType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    Long id;

    @Column(name = "NAME", nullable = false)
    String name;

    @OneToMany(mappedBy = "recipeType", fetch = FetchType.LAZY)
    List<Recipe> recipes;

    @Override
    public String toString() {
        return "RecipeType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
