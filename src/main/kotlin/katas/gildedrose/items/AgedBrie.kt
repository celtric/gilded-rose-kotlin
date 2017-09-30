package katas.gildedrose.items

import katas.gildedrose.Item
import katas.gildedrose.PerishableItem
import katas.gildedrose.increaseQuality

class AgedBrie(item: Item) : PerishableItem(item) {

    override fun update() {
        item.increaseQuality()

        item.sellIn--

        if (item.sellIn < 0) {
            item.increaseQuality()
        }
    }
}
