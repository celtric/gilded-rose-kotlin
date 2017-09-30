package katas.gildedrose

import katas.gildedrose.items.AgedBrie
import katas.gildedrose.items.BackstagePass
import katas.gildedrose.items.PerishableItem

class GildedRose(internal var items: Array<Item>) {

    fun updateQuality() {
        items.forEach { perishableItem(it)?.timePasses() }
    }

    private fun perishableItem(item: Item) = when {
        item.name.equals("Aged Brie") -> AgedBrie(item)
        item.name.startsWith("Backstage pass") -> BackstagePass(item)
        item.name.equals("Sulfuras, Hand of Ragnaros") -> null
        else -> PerishableItem(item)
    }
}
