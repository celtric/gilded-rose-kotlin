package katas.gildedrose.items

import katas.gildedrose.Item
import katas.gildedrose.PerishableItem
import katas.gildedrose.increaseQuality
import katas.gildedrose.isPastSellDate

class BackstagePass(item: Item) : PerishableItem(item) {

    override fun before() {
        item.increaseQuality()

        if (item.sellIn < 11) {
            item.increaseQuality()
        }

        if (item.sellIn < 6) {
            item.increaseQuality()
        }
    }

    override fun after() {
        if (item.isPastSellDate()) {
            item.quality = 0
        }
    }
}
