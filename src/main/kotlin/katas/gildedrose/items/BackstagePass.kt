package katas.gildedrose.items

import katas.gildedrose.Item
import katas.gildedrose.increaseQuality
import katas.gildedrose.lostValue

class BackstagePass(item: Item) : PerishableItem(item) {

    override fun timeHasPassed() {
        when (item.sellIn) {
            // TODO: how can I express "less than 0" in this case?
            in -99..-1 -> item.lostValue()
               in 0..4 -> item.increaseQuality(3)
               in 5..9 -> item.increaseQuality(2)
                  else -> item.increaseQuality()
        }

        // Alternative approach:
        // when  {
        //     item.isPastSellDate()    -> item.lostValue()
        //     item.expiresWithin(0..4) -> item.increaseQuality(3)
        //     item.expiresWithin(5..9) -> item.increaseQuality(2)
        //                         else -> item.increaseQuality()
        // }
    }
}
