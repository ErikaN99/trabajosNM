interface Figura {
    fun calcularSuperficie(): Int
    fun calcularPerimetro(): Int
    fun tituloResultado() {
        println("Datos de la figura")
    }
}
class Cuadrado(val lado: Int): Figura {
    override fun calcularSuperficie(): Int {
        return lado * lado
    }
    override fun calcularPerimetro(): Int {
        return lado * 4
    }
}
class Rectangulo(val ladoMayor: Int, val ladoMenor: Int): Figura {
    override fun calcularSuperficie(): Int {
        return ladoMayor * ladoMenor
    }
    override fun calcularPerimetro(): Int {
        return (ladoMayor * 2) + (ladoMenor * 2)
    }
}
fun main(args: Array<String>) {
    val cuadrado1 = Cuadrado(10)
    cuadrado1.tituloResultado()
    println("Perímetro del cuadrado: ${cuadrado1.calcularPerimetro()}")
    println("Superficie del cuadrado: ${cuadrado1.calcularSuperficie()}")
    val rectangulo1 = Rectangulo(10, 5)
    rectangulo1.tituloResultado()
    println("Perímetro del rectángulo: ${rectangulo1.calcularPerimetro()}")
    println("Superficie del rectángulo: ${rectangulo1.calcularSuperficie()}")
}

//Interface Figura que es implementada por las clases Cuadrado y Rectangulo.
//🔹 Cada clase debe definir cómo calcula superficie y perímetro.
//🔹 El metodo tituloResultado() imprime un encabezado común.
//🔹 En main(), se crean objetos de ambas figuras, se invocan sus métodos y se imprime su información.
//🔹 Refuerza el uso de interfaces para manejar estructuras geométricas con diferentes comportamientos.