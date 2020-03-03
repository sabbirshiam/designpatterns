package patterns.structural.adapter

class AndroidCharger: Android {
    override fun charge() {
        println("Android phone is charging")
    }
}