package org.example.lesson_11

class CategoryRecipes(
    val name: String,
    val image: String,
    val description: String,
)

class Ingredients(
    val name: String,
    val amount: String
)

class Recipes(
    val name: String,
    private var countPortion: Int,
    private var favorites: Boolean = false,
)


/*
Для представленных экранов спроектируй следующие сущности для хранения данных:

- Категория рецепта
- Рецепт
- Ингредиент
 */