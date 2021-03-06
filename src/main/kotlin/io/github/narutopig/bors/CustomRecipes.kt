package io.github.narutopig.bors

import org.bukkit.Material
import org.bukkit.NamespacedKey
import org.bukkit.inventory.ItemStack
import org.bukkit.inventory.ShapedRecipe


object CustomRecipes {
    private val bundle = bundleRecipe()
    private val saddle = saddleRecipe()
    private val trident = tridentRecipe()

    val recipes = listOf(
        bundle,
        saddle,
        trident
    )

    private fun bundleRecipe(): ShapedRecipe {
        val bundle = ItemStack(Material.BUNDLE)
        val key = NamespacedKey.minecraft("bundle")
        val recipe = ShapedRecipe(key, bundle)
        recipe.shape("SUS", "U U", "UUU") // sussus amogus
        recipe.setIngredient('S', Material.STRING)
        recipe.setIngredient('U', Material.LEATHER)
        return recipe
    }

    private fun tridentRecipe(): ShapedRecipe {
        val trident = ItemStack(Material.TRIDENT)
        val key = NamespacedKey.minecraft("trident")
        val recipe = ShapedRecipe(key, trident)
        recipe.shape("IDI", "IHI", "ISI")
        recipe.setIngredient('I', Material.IRON_BLOCK)
        recipe.setIngredient('D', Material.DIAMOND)
        recipe.setIngredient('H', Material.HEART_OF_THE_SEA)
        recipe.setIngredient('S', Material.STICK)
        return recipe
    }

    private fun saddleRecipe(): ShapedRecipe {
        val saddle = ItemStack(Material.SADDLE)
        val key = NamespacedKey.minecraft("saddle")
        val recipe = ShapedRecipe(key, saddle)
        recipe.shape("LLL", "SUS", "S S")
        // amogus doot doot doot doot doot doot doot dududoot BUM BUM
        recipe.setIngredient('L', Material.LEATHER)
        recipe.setIngredient('U', Material.IRON_INGOT)
        recipe.setIngredient('S', Material.STRING)
        return recipe
    }
}