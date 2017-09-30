package katas.gildedrose

const val MIN_QUALITY = 0
const val MAX_QUALITY = 50

open class PerishableItem(val item: Item) {

    fun update() {
        before()
        timePasses()
        after()
    }

    open fun before() {
        item.decreaseQuality()
    }

    private fun timePasses() {
        item.sellIn--
    }

    open fun after() {
        if (item.isPastSellDate()) {
            item.decreaseQuality()
        }
    }
}
