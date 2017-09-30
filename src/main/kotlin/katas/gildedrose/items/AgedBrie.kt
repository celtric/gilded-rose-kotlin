package katas.gildedrose.items

import katas.gildedrose.Item
import katas.gildedrose.increaseQuality
import katas.gildedrose.isPastSellDate

class AgedBrie(item: Item) : PerishableItem(item) {

    override fun timeHasPassed() {
        if (item.isPastSellDate()) {
            item.increaseQuality(2)
        } else {
            item.increaseQuality()
        }
    }
}
