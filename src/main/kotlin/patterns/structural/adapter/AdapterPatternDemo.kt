package patterns.structural.adapter

/**
 *
 */
fun main(args: Array<String>) {
    val iPhoneCharger = IPhone()
    iPhoneCharger.charge()
    println()

    val androidCharger = Android()
    androidCharger.charge()
    println()

    // Charge Android with Iphone cable
    val iPhoneToAndroidAdapter = IphoneChargerToAndroidAdapter(androidCharger)
    iPhoneToAndroidAdapter.charge()

    println()
    // Charge Iphone with Android cable
    val androidToIphoneAdapter = AndroidToIphoneAdapter(iPhoneCharger)
    androidToIphoneAdapter.charge()
}