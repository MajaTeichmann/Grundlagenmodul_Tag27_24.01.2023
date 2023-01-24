//todo: c)
// - Erstelle dann drei Vogel-Instanzen mit selbst ausgedachten Werten.
// - Lass mindestens eine Vogel-Instanz zwitschern.
// Bonus:
// - Sei kreativ und erweiter deine Vogel-Klasse, sodass sie einen Vogel aus dem echten Leben noch besser abbildet.

fun main(){
    var vogel1: Vogel = Vogel("Amsel", "Beeren", 2)
    println("Der Vogel ${vogel1.vogelTyp} macht ${vogel1.zwitschern()}.")

    var vogel2: Vogel = Vogel("Drossel", "Beeren", 1)
    println("Der Vogel ${vogel2.vogelTyp} frisst ${vogel2.futterTyp}.")

    var vogel3: Vogel = Vogel("Fink", "Beeren",2)
    println("Der Vogel ${vogel3.vogelTyp} frisst ${vogel3.futterTyp} und macht ${vogel3.zwitschern()}.")

    var vogel4: Vogel = Vogel("Star","Beeren",2)
    println("Der Vogel ${vogel4.vogelTyp} frisst ${vogel4.futterTyp}, ist ${vogel4.alter} Jahre alt und macht ${vogel4.zwitschern()}.")
}