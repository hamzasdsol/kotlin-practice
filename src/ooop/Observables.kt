package ooop

fun main() {

}

interface Observables {
    fun subscribe()
    fun unSubscribe()
}

class Publisher: Observables {
    override fun subscribe() {
        println("Subscribe!")
    }

    override fun unSubscribe() {
        println("Unsubscribe!")
    }
}
