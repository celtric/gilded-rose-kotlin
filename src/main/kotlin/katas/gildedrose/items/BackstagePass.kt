package katas.gildedrose.items

import katas.gildedrose.*

class BackstagePass(item: Item) : PerishableItem(item) {

    override fun timeHasPassed() {
        item.increaseQuality(by = when {
            item.expiresWithin(0..4) -> 3
            item.expiresWithin(5..9) -> 2
            else -> 1
        })

        if (item.isPastSellDate()) {
            item.lostValue()
        }
    }
}
