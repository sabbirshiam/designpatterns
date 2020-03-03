package patterns.structural.adapter

class IphoneCharger: Iphone {

    override fun charge() {
        println("Iphone is charging")
    }
}