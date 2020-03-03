package patterns.structural.adapter

class IPhone: IphoneCharger {

    override fun charge() {
        print("Iphone is charging")
    }
}