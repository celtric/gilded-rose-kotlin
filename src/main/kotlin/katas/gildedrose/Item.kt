package katas.gildedrose

class Item(var name: String, var sellIn: Int, var quality: Int) {

    override fun toString(): String {
        return this.name + ", " + this.sellIn + ", " + this.quality
    }
}

fun Item.decreaseQuality() {
    quality = (quality - 1).coerceAtLeast(MIN_QUALITY)
}

fun Item.increaseQuality() {
    quality = (quality + 1).coerceAtMost(MAX_QUALITY)
}
