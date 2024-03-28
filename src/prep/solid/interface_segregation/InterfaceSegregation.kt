package prep.solid.interface_segregation

fun main() {

}

interface Workable {
    fun work()
}

interface Eatable {
    fun eat()
}

interface SuperWorker: Workable, Eatable

class DefaultSuperWorker : SuperWorker {
    override fun work() {
        // SuperWorker's work behavior
    }

    override fun eat() {
        // SuperWorker's eating behavior
    }
}

class SpecialSuperWorker: SuperWorker {
    override fun work() {
        // special super worker's working behaviour
    }

    override fun eat() {
        // special super worker's eating behavior
    }
}