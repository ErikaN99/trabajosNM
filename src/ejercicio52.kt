fun imprimir(vararg nombres: String) {
    for(elemento in nombres)
        print("$elemento ")
    println()
}

fun main(args: Array<String>) {
    imprimir("Juan", "Ana", "Luis")
}
//La función imprimir recibe un número variable de argumentos tipo String y los imprime uno por uno. En main, se llama
// a la función imprimir con tres nombres, demostrando cómo usar vararg.