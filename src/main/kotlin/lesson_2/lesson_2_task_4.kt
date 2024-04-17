package org.example.lesson_2

const val TOTAL_PERCENTAGE = 100

fun main() {
    /*
    В мобильной стратегии есть бафф (временное усиление какого-либо юнита или процесса),
    который дает +20% к добытым материалам. Было добыто 7 кристаллической и 11 железной руды без баффа –
     заранее известные данные, объявить и проинициализировать.

Напиши программу, которая будет учитывать действие баффа и выводить в консоль количество “бонусных”
(то есть тех материалов, которые даются “сверху” баффом). По одной строке на материал с его названием.

Если получается нецелое число, то дробная часть должна отбрасываться.
     */
    val amountCrystalNoBuff = 7
    val amountIronNoBuff = 11
    val buffMaterialsPercent = 20

    val amountBuffEffectCrystal = amountCrystalNoBuff * buffMaterialsPercent / TOTAL_PERCENTAGE
    val amountBuffEffectIron = amountIronNoBuff * buffMaterialsPercent / TOTAL_PERCENTAGE

    println("Количество “бонусной” кристаллической руды $amountBuffEffectCrystal шт.")
    println("Количество “бонусной” железной руды $amountBuffEffectIron шт.")
}