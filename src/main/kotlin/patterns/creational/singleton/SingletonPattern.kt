package patterns.creational.singleton

/* A Singleton is a software design pattern that guarantees
    * a class has one instance only and a global point of access
    * to it is provided by that class.
    * In Kotlin `object` keyword creates Singleton instance
    *
    * Rules of making Singleton pattern
    * 1. A private constructor.
    * 2. A static reference of its class.
    * 3. One static method.
    * 4. Globally accessible object reference.
    * 5. Consistency across multiple threads.
    */

class SingletonPattern private constructor() {

    init {
        println("I am Singleton and initializing...")
    }

    var instanceName = "initial instanceName inside Singleton"
//    private object HOLDER {
//        val INSTANCE = Singleton()
//    }
//    companion object: SingletonHolder<Singleton, String>(::Singleton)
    companion object {
        //val INSTANCE: Singleton by lazy { HOLDER.INSTANCE }

        private var INSTANCE: SingletonPattern? = null
        fun getInstance(): SingletonPattern {
            return INSTANCE ?: synchronized(this) {
                // without double check locking
//                Singleton().also {
//                    INSTANCE = it
//                }

                // Double check locking for thread safety.
                return INSTANCE as? SingletonPattern
                    ?: kotlin.run {
                        val created = SingletonPattern()
                        INSTANCE = created
                        created
                    }
            }
        }
    }
}

// in Kotlin way

//object Singleton {
//    init {
//        println("initializing...")
//    }
//    var instanceName = "testing value"
//}
