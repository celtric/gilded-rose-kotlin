package katas.gildedrose.items

import katas.gildedrose.Item
import katas.gildedrose.increaseQuality
import katas.gildedrose.isPastSellDate

class AgedBrie(item: Item) : PerishableItem(item) {

    override fun timeHasPassed() {
        item.increaseQuality()

        if (item.isPastSellDate()) {
            item.increaseQuality()
        }
    }
}
