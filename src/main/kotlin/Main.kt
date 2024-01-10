package org.example
import BLUE_BOLD_BRIGHT
import calcularPreuFinal


fun main() {
    var litros = 0
    var familia = false
    var boSocial = false
    var numFamiliars = 0

    println("cuantos litros gastas mibro?")
    litros = readInt("introdueix un valor Enter", "DATATYPE NO VALID")
    println("familia monoparental o numerosa?")
    familia = readBoolean("introdueix un valor Boolean", "DATATYPE NO VALID")

    if (familia){
        println("quants sou?")
        numFamiliars = readIntMaxMin("introdueix un valor Enter", "DATATYPE NO VALID","No es una respota valida, heu de ser minim 2",2)
    }
    println("tens algun Bo Social?")
    boSocial = readBoolean("introdueix un valor Boolean", "DATATYPE NO VALID")


    var preuFinal = calcularPreuFinal(litros,familia,boSocial,numFamiliars)

    println("El preu a pagar es $BLUE_BOLD_BRIGHT $preuFinal")

}