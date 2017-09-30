package katas.gildedrose.items

import katas.gildedrose.*

class BackstagePass(item: Item) : PerishableItem(item) {

    override fun before() {
        item.increaseQuality(by = when {
            item.expiresWithin(0..5) -> 3
            item.expiresWithin(6..10) -> 2
            else -> 1
        })
    }

    override fun after() {
        if (item.isPastSellDate()) {
            item.lostValue()
        }
    }
}
