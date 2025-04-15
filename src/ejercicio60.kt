fun main(args: Array<String>) {
    val paises: Map<String, Int> = mapOf(
        "argentina" to 40_000_000,  // Usando 'to' en lugar de Pair y notación con _
        "españa" to 46_000_000,
        "uruguay" to 3_400_000
    )
    println("\nListado completo del Map:")
    println(paises)
    println("\nDesglose por país:")
    for ((pais, poblacion) in paises) {
        println("$pais tiene $poblacion habitantes")
    }
    println("\nInformación del mapa:")
    println("• Cantidad de países registrados: ${paises.size}")
    val poblacionArgentina = paises["argentina"] ?: 0
    println("• Población de Argentina: $poblacionArgentina")
    val poblacionBrasil = paises["brasil"]
    println("• Brasil ${poblacionBrasil?.let { "tiene $it habitantes" } ?: "no está registrado"}")
    // Cálculo del total de habitantes
    val totalHabitantes = paises.values.sum()
    println("\nTotal de habitantes en todos los países: $totalHabitantes")
}

//Trabaja con un mapa (Map<String, Int>) que representa países y sus poblaciones:
//•	Se muestra el mapa completo.
//•	Se recorre el mapa mostrando país y población.
//•	Se consulta la población de países específicos como Argentina y Brasil.
//•	Se calcula la población total sumando los valores del mapa.