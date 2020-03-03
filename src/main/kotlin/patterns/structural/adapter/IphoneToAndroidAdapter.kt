package patterns.structural.adapter

class IphoneToAndroidAdapter(private val androidPhoneCharger: AndroidCharger) : Iphone {
    override fun charge() {
        androidPhoneCharger.charge()
    }
}