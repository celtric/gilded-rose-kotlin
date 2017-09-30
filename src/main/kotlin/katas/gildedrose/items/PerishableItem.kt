package katas.gildedrose.items

import katas.gildedrose.Item
import katas.gildedrose.decreaseQuality
import katas.gildedrose.isPastSellDate

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
