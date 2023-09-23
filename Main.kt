const val px1: Float = 4.0f
const val py1: Float = 3.0f
const val px2: Float = -3.0f
const val py2: Float = -2.0f

fun calcularPendiente(): Float {
    val numerador = py2 - py1
    val denominador = px2 - px1

    return numerador / denominador
}
fun main(){
    val pendiente = calcularPendiente()
    println("La pendiente entre los puntos es: $pendiente")
}