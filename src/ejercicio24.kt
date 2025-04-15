fun main(parametro: Array<String>) {
    val dados = object {
        val arreglo = IntArray(5)

        fun generar() {
            for (i in arreglo.indices)
                arreglo[i] = ((Math.random() * 6) + 1).toInt()
        }

        fun imprimir() {
            for (elemento in arreglo)
                print("$elemento - ")
            println()
        }

        fun mayor(): Int {
            var may = arreglo[0]
            for (i in arreglo.indices)
                if (arreglo[i] > may)
                    may = arreglo[i]
            return may
        }
    }

    dados.generar()
    dados.imprimir()
    print("Mayor valor: ")
    println(dados.mayor())
}

//Este código crea un objeto anónimo dentro de main() para manipular un arreglo de enteros.
//🔹 El objeto dados contiene un arreglo de 5 enteros simulando lanzamientos de dado.
//🔹 generar() llena el arreglo con números aleatorios entre 1 y 6.
//🔹 imprimir() muestra los elementos.
//🔹 mayor() devuelve el valor más alto del arreglo.
//🔹 Ejemplo práctico del uso de objetos sin nombre y sus métodos internos.