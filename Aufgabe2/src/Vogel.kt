//Todo: a)
// - Schreibe eine Klasse mit dem Namen Vogel. Erstelle dazu selbstständig die Dateien, die du für die Aufgabe brauchst.
// - Die Klasse soll als Eigenschaften den Vogeltypen ("Amsel", "Drossel", ...) sowie den Futtertypen ("Ameisen",
// "Beeren", ...) und ein Alter haben. Außerdem soll die Klasse die Methode zwitschern haben, die "zwitscher" in der
// Konsole ausgibt.

// todo: b)
//  - Benutze einen Konstruktor, damit die Parameter, die beim Erstellen einer Vogel-Instanz mitgegeben werden, direkt
//  den Eigenschaften zugewiesen werden. Wenn du Hilfe brauchst, schau dir an wie Konstruktoren in den Beispielaufgaben
//  oder in den Vorlesungsfolien verwendet werden.

//todo: c) SIEHE main()


class Vogel(var vogelTyp: String, var futterTyp: String, var alter: Int) {
    fun zwitschern(): String{
        return "zwitscher" // um kotlin.unit zu umgehen
    }
}