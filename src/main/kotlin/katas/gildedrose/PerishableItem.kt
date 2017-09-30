package katas.gildedrose

const val MIN_QUALITY = 0
const val MAX_QUALITY = 50

open class PerishableItem(val item: Item) {

    open fun update() {
        item.decreaseQuality()

        item.sellIn--

        if (item.sellIn < 0) {
            item.decreaseQuality()
        }
    }
}

fun Item.decreaseQuality() {
    quality = (quality - 1).coerceAtLeast(MIN_QUALITY)
}

fun Item.increaseQuality() {
    quality = (quality + 1).coerceAtMost(MAX_QUALITY)
}
