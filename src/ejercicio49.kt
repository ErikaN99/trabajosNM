class Dados() {
    val arreglo = IntArray(10)

    fun tirar() {
        for(i in arreglo.indices)
            arreglo[i] = ((Math.random() * 6) + 1).toInt()
    }

    operator fun invoke(nro: Int) = arreglo[nro]
}

fun main(args: Array<String>) {
    val dados = Dados()
    dados.tirar()
    println(dados(0))
    println(dados(1))
    for(i in 2..9)
        println(dados(i))
}
//La clase Dados genera 10 valores aleatorios (simulando tirar 10 dados). Se sobrecarga el operador invoke para que se
// puedan obtener los valores con dados(n). En main() se muestran los valores desde el índice 0 al 9.