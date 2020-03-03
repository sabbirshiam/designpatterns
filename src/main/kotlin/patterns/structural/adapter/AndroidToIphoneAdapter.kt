package patterns.structural.adapter

class AndroidToIphoneAdapter(private val iphoneCharger: IphoneCharger) : Android {
    override fun charge() {
        iphoneCharger.charge()
    }
}