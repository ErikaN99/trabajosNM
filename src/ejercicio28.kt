interface Punto {
    fun imprimir()
}

class PuntoPlano(val x: Int, val y: Int): Punto {
    override fun imprimir() {
        println("Punto en el plano: ($x,$y)")
    }
}

class PuntoEspacio(val x: Int, val y: Int, val z: Int): Punto {
    override fun imprimir() {
        println("Punto en el espacio: ($x,$y,$z)")
    }
}

fun main(args: Array<String>) {
    val puntoPlano1 = PuntoPlano(18, 4)
    puntoPlano1.imprimir()
    val puntoEspacio1 = PuntoEspacio(28, 58, 68)
    puntoEspacio1.imprimir()
}

//Uso de interfaces para definir estructuras comunes a diferentes clases.
//🔹 La interfaz Punto define el metodo imprimir().
//🔹 PuntoPlano representa un punto con coordenadas x e y.
//🔹 PuntoEspacio agrega la coordenada z para representar puntos en 3D.
//🔹 En main(), se crean ambos tipos de punto y se imprimen sus coordenadas.
//🔹 Muestra cómo las interfaces permiten diseñar sistemas flexibles y extensibles.