fun main(){
    var auto1 = Car(150,"rot",5)
    var auto2 = Car(590,"schwarz",2)
    var auto3 = Car(59,"silber", 4)
    var auto4 = Car(100,"schwarz",5)

    println("""
        Wir haben folgendes Auto: 
        Es hat ${auto1.ps} PS
        die Farbe ${auto1.color}
        und hat ${auto1.seats} Sitzplätze""".trimIndent())

    println("""
        Nun wollen wir mit dem Auto los fahren.
        
        Aktuell sind ${auto1.belegteSeats} Sitzplätze belegt.
        
        Es steigen 2 Personen in das Auto ein: """.trimIndent())
        auto1.getIn()
    println(auto1.belegteSeats)
        auto1.getIn()
    println(auto1.belegteSeats)

    println("Der Motor wird gestartet:")
    println(auto1.startEngine())

    println("\nWir haben unser Ziel erreicht!")

    println("\nNun steigen 2 Personen wieder aus:")
        auto1.getOut()
    println(auto1.belegteSeats)
        auto1.getOut()
    println(auto1.belegteSeats)

    println()
    // Was passiert, wenn eine Person in ein bereits volles Auto zusteigen will?
    auto3.getIn()
    auto3.getIn()
    auto3.getIn()
    auto3.getIn()
    auto3.getIn()
    println(auto3.belegteSeats)
    println(auto3.startEngine())

    // Was passiert, wenn der Motor gestartet wird, ohne das eine Person im Auto sitzt?
    println(auto4.belegteSeats)
    println(auto4.startEngine())
}