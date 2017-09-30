package katas.gildedrose

import katas.gildedrose.items.AgedBrie
import katas.gildedrose.items.BackstagePass

class GildedRose(internal var items: Array<Item>) {

    fun updateQuality() {
        items.forEach { perishableItem(it)?.update() }
    }

    private fun perishableItem(item: Item) = when {
        item.name.equals("Aged Brie") -> AgedBrie(item)
        item.name.equals("Backstage passes to a TAFKAL80ETC concert") -> BackstagePass(item)
        item.name.equals("Sulfuras, Hand of Ragnaros") -> null
        else -> PerishableItem(item)
    }
}
