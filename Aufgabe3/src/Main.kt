fun main(){
    var hund1 = Hund("Bello",4, "Golden Retriever")
    println("${hund1.hundename} macht ${hund1.bellen()}")

    var hund2 = Hund("Rex",2, "Bulldogge")
    println("${hund2.hundename} ist ein(e) ${hund2.rasse}")

    var hund3 = Hund("Fang",7, "Husky")
    println("${hund3.hundename} ist ${hund3.alter} Jahre alt und ein(e) ${hund3.rasse}")
    hund3.altern()

    println("Heute hat ${hund3.hundename} Geburtstag und wird stolze ${hund3.alter} Jahre alt.")
}