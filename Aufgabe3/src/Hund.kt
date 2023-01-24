//todo: a)
// - Schreibe eine Klasse mit dem Namen Hund. Erstelle dazu selbstständig die Dateien, die du für die Aufgabe brauchst.
// - Die Klasse soll als Eigenschaften einen Hundenamen, das Alter sowie die Rasse haben.
// - Die Klasse soll die Methoden bellen und altern haben. Bei der Methode bellen wird "woof!" in der Konsole ausgegeben.
//   Bei der Methode altern, wird das Alter des Hundes um 1 Jahr erhöht.

// todo: b)
//  - Benutze einen Konstruktor, damit die Parameter, die beim Erstellen einer Hunde-Instanz (Vogel-Instanz) mitgegeben werden, direkt
//  den Eigenschaften zugewiesen werden. Wenn du Hilfe brauchst, schau dir an wie Konstruktoren in den Beispielaufgaben
//  oder in den Vorlesungsfolien verwendet werden.

//todo: c)
// - Erstelle dann drei Hunde-Instanzen mit selbst ausgedachten Werten.
// - Lass mindestens eine Hunde-Instanz bellen.
// Bonus:
// - Sei kreativ und erweiter deine Hund-Klasse, sodass sie einen Hund aus dem echten Leben noch besser abbildet.

class Hund(var hundename: String, var alter: Int, var rasse: String) {

    fun bellen():String {
       return "woof!"
    }

    fun altern() {
        alter++
    }
}
