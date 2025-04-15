class PersonaDatos {
    var nombre: String = ""
        set(valor) {
            field = valor.uppercase()
        }
        get() {
            return "(${field})"
        }

    var edad: Int = 0
        set(valor) {
            field = if (valor >= 0) valor else 0
        }
}

fun main(parametro: Array<String>) {
    val persona1 = PersonaDatos()
    persona1.nombre = "juan"
    persona1.edad = 23

    println(persona1.nombre)
    println(persona1.edad)

    persona1.edad = -50
    println(persona1.edad)
}

//Uso de propiedades con getters y setters personalizados en Kotlin.
//🔹 La clase PersonaDatos contiene nombre y edad.
//🔹 El set de nombre convierte el texto a mayúsculas automáticamente.
//🔹 El set de edad impide que se asignen valores negativos.
//🔹 En main(), se muestran dos asignaciones de edad: una válida y otra negativa.
//🔹 Ejemplo útil para validar y modificar datos al asignarlos a propiedades.