data class Fecha(val dia: Int, val mes: Int, val año: Int)
fun main(args:Array<String>) {
    val feriados: Set<Fecha> = setOf(
        Fecha(1, 1, 2017),   // Año Nuevo
        Fecha(25, 12, 2017)   // Navidad
    )
    println("Ingrese una fecha")
    println("Ingrese el día: ")
    val dia = readLine()!!.toInt()
    print("Ingrese el mes: ")
    val mes = readLine()!!.toInt()
    print("Ingrese el año: ")
    val año = readLine()!!.toInt()
    if (Fecha(dia, mes, año)in feriados) {
        println("\n¡La fecha ingresada es feriado")
    } else {
        println("\nLa fecha La fecha ingresada no es feriado")
    }
}

//Dentro de la función main, se declara un conjunto (Set) de fechas feriadas llamado feriados,
// el cual incluye dos fechas predeterminadas: el 1 de enero de 2017 (Año Nuevo) y el 25 de diciembre de 2017 (Navidad).
// Luego, el programa solicita al usuario que ingrese una fecha proporcionándole el día, mes y año por separado.
//Después de capturar la fecha, el programa crea un objeto Fecha con los valores introducidos y verifica si esta fecha está
// dentro del conjunto feriados. Si es así, muestra el mensaje de que la fecha es feriado; en caso contrario, indica que no lo es.