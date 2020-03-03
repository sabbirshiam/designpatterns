package patterns.structural.adapter

class AndroidToIphoneAdapter(private val iphone: IPhone) : AndroidCharger {
    override fun charge() {
        print("From AndroidToIphoneAdapter:: ").also { iphone.charge() }
    }
}