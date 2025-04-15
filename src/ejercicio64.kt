data class Materia(val nombre: String, val nota: Int)
fun cargarAlumnos(alumnos: MutableMap<Int, MutableList<Materia>>) {
    print("¿Cuántos alumnos cargará?: ")
    val cantidad = readLine()!!.toInt()
    for(i in 1..cantidad) {
        print("\nIngrese DNI del alumno: ")
        val dni = readLine()!!.toInt()
        val listaMaterias = mutableListOf<Materia>()
        do {
            print("Ingrese nombre de la materia: ")
            val nombre = readLine()!!
            print("Ingrese nota (0-10): ")
            val nota = readLine()!!.toInt().coerceIn(0, 10)
            listaMaterias.add(Materia(nombre, nota))
            print("¿Desea agregar otra materia? (si/no): ")
            val opcion = readLine()!!
        } while (opcion.equals("si", ignoreCase = true))
        alumnos[dni] = listaMaterias
    }
}
fun imprimirAlumnos(alumnos: Map<Int, List<Materia>>) {
    println("\n=== LISTADO COMPLETO DE ALUMNOS ===")
    for((dni, materias) in alumnos) {
        println("\nDNI: $dni")
        if (materias.isEmpty()) {
            println("No tiene materias registradas")
        } else {
            println("Materias:")
            materias.forEach { materia ->
                println("  - ${materia.nombre}: ${materia.nota}")
            }
            val promedio = materias.map { it.nota }.average()
            println("Promedio: %.2f".format(promedio))
        }
    }
}
fun consultaPorDni(alumnos: Map<Int, List<Materia>>) {
    print("\nIngrese DNI del alumno a consultar: ")
    val dni = readLine()!!.toInt()
    if (dni in alumnos) {
        val materias = alumnos[dni]!!
        println("\n--- Alumno DNI: $dni ---")
        if (materias.isEmpty()) {
            println("No tiene materias registradas")
        } else {
            println("Materias cursadas:")
            materias.forEachIndexed { index, materia ->
                println("${index + 1}. ${materia.nombre} - Nota: ${materia.nota}")
            }
            val promedio = materias.map { it.nota }.average()
            println("\nPromedio general: %.2f".format(promedio))
        }
    } else {
        println("No se encontró alumno con DNI $dni")
    }
}
fun main() {
    val alumnos = mutableMapOf<Int, MutableList<Materia>>()
    cargarAlumnos(alumnos)
    imprimirAlumnos(alumnos)
    consultaPorDni(alumnos)
}
//El programa permite registrar alumnos y sus materias, usando su DNI como identificador. Por cada alumno se ingresan
// varias materias con notas del 0 al 10. Luego, se imprime un listado con las materias y el promedio de cada alumno.
// También se puede consultar individualmente a un alumno por su DNI para ver sus materias y promedio.