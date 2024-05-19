package org.example.lesson_11

class CategoryRecipe(
    val name: String,
    val image: String,
    val description: String,
    val listRecipes: List<Recipes>,
)

class Ingredient(
    val name: String,
    val amount: String,
)

class Recipes(
    val name: String,
    val countPortion: Int,
    val favorites: Boolean = false,
    val listIngredients: List<Ingredient>
)


/*
Для представленных экранов спроектируй следующие сущности для хранения данных:

- Категория рецепта
- Рецепт
- Ингредиент
 */