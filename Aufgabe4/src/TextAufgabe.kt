class GameCharacter { // Klasse GameCharacter wird erstellt
    var name: String // variable name vom Datentyp String wird erstellt
    var hasWeapon: Boolean // variable hasWeapon vom Datentyp Boolean wird erstellt
    var level: Int // variable level vom Datentyp Int wird erstellt

    constructor(name: String, hasWeapon: Boolean, level: Int) { // constructor mit den oben genannten variablen wird erstellt
        this.name = name // variable name ist gleich variable name in constructor
        this.hasWeapon = hasWeapon // variable hasWeapon ist gleich variable hasWeapon in constructor
        this.level = level // variable level ist gleich variable level in constructor
    }
}

//    var gameCharacter1: GameCharacter = GameCharacter("Legolas", false, 20)
// todo: variable gameCharacter1 der Klasse GameCharacter wird erstellt und bekommt Werte der Variablen name, hasWeapon und level übergeben
//
//    var gameCharacter2: GameCharacter = GameCharacter("Frodo", true, 3)
// todo: variable gameCharacter2 der Klasse GameCharacter wird erstellt und bekommt Werte der Variablen name, hasWeapon und level übergeben
//
//    println(gameCharacter1.name + " ist Level " + gameCharacter1.level +
//    ". Hat er eine Waffe? " + gameCharacter1.hasWeapon)
//    todo: es wird der Name von gameCharacter1, sein Level und ob er eine Waffe hat geprintet (Legolas, false, 20)
//
//    println(gameCharacter2.name + " ist Level " + gameCharacter2.level +
//    ". Hat er eine Waffe? " + gameCharacter2.hasWeapon)
//    todo: es wird der Name von gameCharacter2, sein Level und ob er eine Waffe hat geprintet (Frodo, true, 3)

//// Frodo findet ein magisches Amulett
//gameCharacter2.level = 5
//    todo: das level von gameCharacter2 wird auf den Wert 5 gesetzt

//// Legolas baut sich einen Bogen aus Zweigen
//gameCharacter1.hasWeapon = true
//    todo: die Variable hasWeapon wird bei gameCharacter1 auf true gesetzt (erhält waffe)

//// Legolas besiegt eine Armee Orks
//gameCharacter1.level = 50
//    todo: das level von gameCharacter1 wird auf den Wert 50 gesetzt

//// Legolas Bogen ist kaputtgegangen
//gameCharacter1.hasWeapon = false
//    todo: die Variable hasWeapon wird bei gameCharacter1 auf false gesetzt (verliert waffe)

//// Frodo kaempft in einer Hoelle
//gameCharacter2.level = 7
//    todo: das level von gameCharacter2 wird auf den Wert 7 gesetzt

//// Frodo muss fliehen und verliert sein Schwert
//gameCharacter2.hasWeapon = false
//    todo: die Variable hasWeapon wird bei gameCharacter2 auf false gesetzt (verliert waffe)
//
//println(gameCharacter1.name + " ist Level " + gameCharacter1.level +
//". Hat er eine Waffe? " + gameCharacter1.hasWeapon)
//    todo: es wird der Name von gameCharacter1, sein Level und ob er eine Waffe hat geprintet
//     (Legolas ist Level 50. Hat er eine Waffe? false)

//println(gameCharacter2.name + " ist Level " + gameCharacter2.level +
//". Hat er eine Waffe? " + gameCharacter2.hasWeapon)
//    todo: es wird der Name von gameCharacter1, sein Level und ob er eine Waffe hat geprintet
//     (Frodo ist Level 7. Hat er eine Waffe? false)