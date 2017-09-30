package katas.gildedrose.items

import katas.gildedrose.*

class BackstagePass(item: Item) : PerishableItem(item) {

    override fun before() {
        when {
            item.sellIn < 6 -> item.increaseQuality(3)
            item.sellIn < 11 -> item.increaseQuality(2)
            else -> item.increaseQuality()
        }
    }

    override fun after() {
        if (item.isPastSellDate()) {
            item.lostValue()
        }
    }
}
