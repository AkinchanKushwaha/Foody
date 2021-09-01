package com.example.foody.data

import com.example.foody.data.database.RecipeDao
import com.example.foody.data.database.RecipesEntity
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class LocalDataSource @Inject constructor(
    private val recipeDao: RecipeDao
) {

    fun readDatabase(): Flow<List<RecipesEntity>> {
        return recipeDao.readRecipes()
    }

    suspend fun insertRecipes(recipesEntity: RecipesEntity) {
        recipeDao.insetRecipes(recipesEntity)
    }
}