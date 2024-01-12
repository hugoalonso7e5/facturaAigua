import org.example.*


fun main() {
    var numFamiliars = 0

    println("$GREEN_BOLD_BRIGHT\nHola. A aquest programa serveix per calcular la teva factura de l'aigua.")

    println("Se't preguntaran algunes coses. Simplement has de respondre el tipus de valor que et demanin.$RESET\n")

    var menu = false

    do {
        println("Quants llitres d'aigua has gastat??")
        val litros: Int = readInt("Introdueix un valor Enter: ", "DATATYPE NO VALID")
        println("Tens una familia monoparental o nombrosa?")
        val familia: Boolean = funSiONo()

        if (familia){
            println("Quants sou?")
            numFamiliars = readIntMaxMin("Introdueix un valor Enter", "DATATYPE NO VALID","No es una respota valida, heu de ser minim 2",2)
        }
        println("Tens algun Bo Social?")
        val boSocial: Boolean = funSiONo()


        val preuFinal = roundToTwoDecimals(calcularPreuFinal(litros,familia,boSocial,numFamiliars))

        println("El preu a pagar surt a $BLUE_BOLD_BRIGHT $preuFinal$RESET")

        println("Vols calcular un altre factura??")

        var opcioMenu : Boolean = funSiONo()

        if (!opcioMenu) menu = true

    }while(!menu)






}