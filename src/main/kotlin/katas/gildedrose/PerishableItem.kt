package katas.gildedrose

const val MIN_QUALITY = 0
const val MAX_QUALITY = 50

open class PerishableItem(val item: Item) {

    fun timePasses() {
        item.sellIn--

        timeHasPassed()
    }

    open fun timeHasPassed() {
        item.decreaseQuality()

        if (item.isPastSellDate()) {
            item.decreaseQuality()
        }
    }
}
