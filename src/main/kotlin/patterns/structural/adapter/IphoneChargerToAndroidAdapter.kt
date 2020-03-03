package patterns.structural.adapter

class IphoneChargerToAndroidAdapter(private val androidPhone: Android) : IphoneCharger {
    override fun charge() {
        print("From IphoneChargerToAndroidAdapter:: ").also { androidPhone.charge() }
    }
}