package patterns.structural.adapter

class Android: AndroidCharger {
    override fun charge() {
        print("Android phone is charging")
    }
}