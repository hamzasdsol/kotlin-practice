package prep.solid.liskov_substitution_principle

fun main() {
    val vehicle: CorrectedCar = DefaultCar()
    vehicle.startEngine("Honda")
    vehicle.openTrunk()
}

interface CorrectedVehicle {
    fun startEngine(name: String)
}

interface CorrectedCar : CorrectedVehicle {
    fun openTrunk()
}

interface CorrectedMotorcycle : CorrectedVehicle {
    fun oneWheelRide()
}

class DefaultCar : CorrectedCar {
    override fun openTrunk() {
        println("Trunk opening")
    }

    override fun startEngine(name: String) {
        println("$name is starting ...")
    }
}

class DefaultMotorCycle : CorrectedMotorcycle {
    override fun oneWheelRide() {
        println("One wheel ride")
    }

    override fun startEngine(name: String) {
        println("$name is starting ...")
    }
}