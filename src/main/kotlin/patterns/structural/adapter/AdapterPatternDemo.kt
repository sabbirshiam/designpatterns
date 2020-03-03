package patterns.structural.adapter

fun main(args: Array<String>) {
    val iPhoneCharger = IphoneCharger()
    iPhoneCharger.charge()

    val androidCharger = AndroidCharger()
    androidCharger.charge()

    // Charge Android with Iphone cable
    val iPhoneToAndroidAdapter = IphoneToAndroidAdapter(androidCharger)
    iPhoneToAndroidAdapter.charge()

    // Charge Iphone with Android cable
    val androidToIphoneAdapter = AndroidToIphoneAdapter(iPhoneCharger)
    androidToIphoneAdapter.charge()
}