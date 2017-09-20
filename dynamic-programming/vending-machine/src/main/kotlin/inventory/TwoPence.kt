package inventory

import inventory.Currency.GBX

class TwoPence : Coin(2, GBX) {

    override fun toString(): String {
        return "$denomination${currency.sign}"
    }
}