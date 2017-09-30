package katas.gildedrose

class Item(var name: String, var sellIn: Int, var quality: Int) {

    override fun toString(): String {
        return this.name + ", " + this.sellIn + ", " + this.quality
    }
}

const val MIN_QUALITY = 0
const val MAX_QUALITY = 50

fun Item.decreaseQuality() {
    quality = (quality - 1).coerceAtLeast(MIN_QUALITY)
}

fun Item.increaseQuality(by: Int = 1) {
    quality = (quality + by).coerceAtMost(MAX_QUALITY)
}

fun Item.isPastSellDate() = sellIn < 0

fun Item.lostValue() {
    quality = 0
}

fun Item.expiresWithin(days: IntRange) = sellIn in days
