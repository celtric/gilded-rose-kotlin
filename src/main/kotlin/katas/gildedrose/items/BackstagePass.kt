package katas.gildedrose.items

import katas.gildedrose.Item
import katas.gildedrose.PerishableItem

class BackstagePass(item: Item) : PerishableItem(item) {

    override fun update() {
        if (item.quality < 50) {
            item.quality++

            if (item.sellIn < 11 && item.quality < 50) {
                item.quality++
            }

            if (item.sellIn < 6 && item.quality < 50) {
                item.quality++
            }
        }

        item.sellIn--

        if (item.sellIn < 0) {
            item.quality = 0
        }
    }
}