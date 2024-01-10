import java.util.*
/**
 * Es un scanner.
 * */
val scan = Scanner(System.`in`)

/**
 * Esta funcion, como su propio nombre indica, lee valores int
 * y, hasta que no has introducido un valor int, no devuelve
 * ningun valor.
 * @author Hugo Alonso
 * @return retorna el numero int.
 */
fun llegirInt(): Int {
    var bool = false
    var result=0
    do {
        if (scan.hasNextInt()){
            bool=true
            result=scan.nextInt()
        }
    }while(!bool)
    return result
}
/**
 * Esta funcion, como su propio nombre indica, lee valores Double
 * y, hasta que no has introducido un valor Double, no devuelve
 * ningun valor.
 * @author Hugo Alonso
 * @return retorna el numero Double.
 */
fun llegirDouble(): Double {
    var bool = false
    var result=0.0
    do {
        if (scan.hasNextDouble()){
            bool=true
            result=scan.nextDouble()
        }
    }while(!bool)
    return result
}
/**
 * Esta funcion, como su propio nombre indica, lee valores Long
 * y, hasta que no has introducido un valor Long, no devuelve
 * ningun valor.
 * @author Hugo Alonso
 * @return retorna el numero Long.
 */
fun llegirLong(): Long {
    var bool:Boolean = false
    var result:Long=0
    do {
        if (scan.hasNextLong()){
            bool=true
            result=scan.nextLong()
        }
    }while(!bool)
    return result
}