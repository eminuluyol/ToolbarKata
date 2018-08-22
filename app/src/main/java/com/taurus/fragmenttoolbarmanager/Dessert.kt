package com.taurus.fragmenttoolbarmanager

class Dessert(val name: String, val description: String) {
    var firstLetter: String = name[0].toString()

    companion object {

        fun prepareDesserts(names: Array<String>, descriptions: Array<String>): List<Dessert> {
            val desserts = mutableListOf<Dessert>()

            for (i in names.indices) {
                val dessert = Dessert(names[i], descriptions[i])
                desserts.add(dessert)
            }

            return desserts
        }
    }
}
