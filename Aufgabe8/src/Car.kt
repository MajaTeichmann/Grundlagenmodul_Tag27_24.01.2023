class Car {
    var ps: Int = 0
    var color: String
    var seats: Int = 0
    var freeSeats: Int = 0
    var belegteSeats = seats - freeSeats

    fun getIn() {
        if (freeSeats in 1..seats) {
            belegteSeats++ //freeSeats--
        }
        else { println("Fehler, wir haben ${freeSeats} freie Sitzplätze!")
        }
    }

    fun getOut() {
        if (belegteSeats != 0) {
            belegteSeats-- //freeSeats++
        } else {
            println("Alle Sitzplätze sind leer!")
        }
    }

    fun startEngine():String {
        if (belegteSeats != 0) {
            return drive()
        } else {
            return "Wir können NICHT los fahren.Es sitzt keiner im Fahrzeug! Dies ist kein Auto mit Autopilot"
        }
    }

    fun drive():String {
        return "wroom wroom"
    }

    constructor(ps: Int, color: String, seats: Int) {
        if (ps >= 0 && ps <= 1000) {
            this.ps = ps
        }
        if (seats >= 0) {
            this.seats = seats
            this.freeSeats = seats
        }

        this.color = color
    }
}