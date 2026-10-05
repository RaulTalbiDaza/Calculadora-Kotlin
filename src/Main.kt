fun main(args: Array<String>) {
    val menu = Menu()
    do {
        var opcion = menu.menu()
        var fin = menu.calculadora(opcion)
    }while (!fin)
}
