data class Producto(val nombre: String, val precio: Float, val cantidad: Int)
fun cargar(productos: MutableMap<Int, Producto>) {
    productos[1] = Producto("Repas", 13.15f, 200)
    productos[13] = Producto("Naranjas", 20f, 0)  // Corregido nombre
    productos[20] = Producto("Peras", 3.58f, 0)   // Corregido nombre
}
fun listadoCompleto(productos: Map<Int, Producto>) {
    println("\n--- Listado completo de productos ---")
    for((codigo, producto) in productos) {
        println("Código: $codigo | Descripción: ${producto.nombre} | Precio: ${producto.precio} | Stock: ${producto.cantidad}")
    }
    println()
}
fun consultarProducto(productos: Map<Int, Producto>) {
    print("\nIngrese el código de un producto: ")
    val codigo = readLine()!!.toInt()
    if (codigo in productos) {
        val p = productos[codigo]!!
        println("Nombre: ${p.nombre} | Precio: ${p.precio} | Stock: ${p.cantidad}")
    } else {
        println("No existe un producto con dicho código")
    }
}
fun sinStock(productos: Map<Int, Producto>) {
    val cant = productos.count { it.value.cantidad == 0 }
    println("\nCantidad de artículos sin stock: $cant")
}
fun main(args: Array<String>) {
    val productos = mutableMapOf<Int, Producto>()
    cargar(productos)
    listadoCompleto(productos)
    consultarProducto(productos)
    sinStock(productos)
}
//Este código en Kotlin implementa un sistema básico de gestión de inventario de productos. Utiliza una data class
// llamada Producto para almacenar información como nombre, precio y cantidad en stock. Los productos se guardan en
// un MutableMap<Int, Producto>, donde la clave es un código numérico y el valor es el objeto Producto.