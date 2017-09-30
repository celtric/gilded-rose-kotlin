package katas.gildedrose.items

import katas.gildedrose.Item
import katas.gildedrose.PerishableItem
import katas.gildedrose.increaseQuality

class BackstagePass(item: Item) : PerishableItem(item) {

    override fun update() {
        item.increaseQuality()

        if (item.sellIn < 11) {
            item.increaseQuality()
        }

        if (item.sellIn < 6) {
            item.increaseQuality()
        }

        item.sellIn--

        if (item.sellIn < 0) {
            item.quality = 0
        }
    }
}
