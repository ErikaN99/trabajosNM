fun main() {
    val conjunto: MutableSet<Int> = mutableSetOf(2, 7, 20, 150, 3)

    // 1. Mostrar conjunto inicial
    println("Conjunto inicial: ${conjunto.joinToString(" ")}")
    println("Cantidad de elementos: ${conjunto.size}\n")

    // 2. Operaciones de agregado
    conjunto.add(500).also {
        println("Se agregó 500: ${it}. Conjunto actual: ${conjunto.joinToString(" ")}")
    }

    conjunto.add(500).also {
        println("Intento de agregar 500 nuevamente: ${it}. Conjunto permanece igual: ${conjunto.joinToString(" ")}\n")
    }

    // 3. Verificación de existencia
    println("El 500 ${if (500 in conjunto) "SÍ" else "NO"} está en el conjunto")

    // 4. Eliminación y verificación
    conjunto.remove(500).also {
        println("\nSe eliminó 500: ${it}. El 500 ${if (500 in conjunto) "SÍ" else "NO"} está en el conjunto")
    }

    // 5. Conteo con condición
    val mayoresA10 = conjunto.count { it >= 10 }
    println("\nElementos >= 10: $mayoresA10 (${conjunto.filter { it >= 10 }.joinToString()})")
}
//Uso de MutableSet en Kotlin (conjunto de elementos únicos).
//	Se inicializa un conjunto con valores únicos.
//	Intenta agregar el número 500 dos veces (solo se guarda una vez por ser un set).
//	Elimina el elemento 500 y verifica si aún existe en el conjunto.
//	Cuenta cuántos elementos son mayores o iguales a 10 y los imprime.