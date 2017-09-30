package katas.gildedrose.items

import katas.gildedrose.*

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
            item.lostValue()
        }
    }
}
