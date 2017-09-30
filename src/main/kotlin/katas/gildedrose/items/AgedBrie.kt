package katas.gildedrose.items

import katas.gildedrose.Item
import katas.gildedrose.PerishableItem
import katas.gildedrose.increaseQuality

class AgedBrie(item: Item) : PerishableItem(item) {

    override fun before() {
        item.increaseQuality()
    }

    override fun after() {
        if (item.sellIn < 0) {
            item.increaseQuality()
        }
    }
}
