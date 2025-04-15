fun cargar(diccionario: MutableMap<String, String>) {
    do {
        print("Ingrese palabra en castellano: ")
        val palCastellano = readLine()!!
        print("Ingrese palabra en inglés: ")
        val palIngles = readLine()!!  // Corregido nombre de variable
        diccionario[palIngles] = palCastellano  // Corregida sintaxis de asignación
        print("¿Continúa cargando otra palabra? (si/no): ")
        val fin = readLine()!!
    } while (fin == "si")  // Corregido operador de comparación
}
fun listado(diccionario: Map<String, String>) {
    println("\n--- Listado completo del diccionario ---")
    for((ingles, castellano) in diccionario) {
        println("Inglés: '$ingles' -> Español: '$castellano'")  // Corregido texto y formato
    }
    println()
}
fun consultaIngles(diccionario: Map<String, String>) {
    print("\nIngrese una palabra en inglés para verificar su traducción: ")
    val ingles = readLine()!!
    println(
        if (ingles in diccionario)
            "La traducción al castellano es: '${diccionario[ingles]}'"
        else
            "'$ingles' no existe en el diccionario"
    )
}
fun main(args: Array<String>) {
    val diccionario = mutableMapOf<String, String>()
    cargar(diccionario)
    listado(diccionario)
    consultaIngles(diccionario)
}

//Es un mini traductor castellano-inglés usando Map.
//	Solicita al usuario ingresar pares castellano-inglés, y los almacena en el mapa.
//	Usa un bucle do-while para permitir ingresar varias veces.
//	Recorre el diccionario y muestra todas las palabras ingresadas.
//	Permite consultar una palabra en inglés e imprime su traducción si existe.
//	main: Crea un diccionario mutable y llama a las funciones anteriores.