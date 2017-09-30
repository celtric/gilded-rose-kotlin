package katas.gildedrose.items

import katas.gildedrose.Item
import katas.gildedrose.PerishableItem
import katas.gildedrose.increaseQuality
import katas.gildedrose.isPastSellDate

class AgedBrie(item: Item) : PerishableItem(item) {

    override fun before() {
        item.increaseQuality()
    }

    override fun after() {
        if (item.isPastSellDate()) {
            item.increaseQuality()
        }
    }
}
