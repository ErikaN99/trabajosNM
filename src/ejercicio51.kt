data class Alumno(val documento: Int, val nombre: String)

class Curso {
    val alumnos = arrayOf(
        Alumno(123456, "Marcos"),
        Alumno(666666, "Ana"),
        Alumno(777777, "Luis")
    )

    operator fun contains(documento: Int): Boolean {
        return alumnos.any { it.documento == documento }
    }
}

fun main(args: Array<String>) {
    val curso1 = Curso()
    if (123456 in curso1) {
        println("El alumno Marcos está inscripto en el curso")
    } else {
        println("El alumno Marcos no está inscripto en el curso")
    }
}
//La clase de datos llamada Alumno con dos propiedades: documento (número entero) y nombre (cadena). La clase Curso
// contiene un arreglo de tres objetos Alumno.  La función contains permite usar la sintaxis in para verificar si un
// documento está en el curso. En main, se instancia un curso y se verifica si el documento 123456 (Marcos) está
// inscrito usando la sintaxis personalizada del operador in