package org.example
import calcularPreuFinal


fun main() {
    var litros = 0
    var familia = false
    var boSocial = false
    var numFamiliars = 0



    println("cuantos litros gastas mibro?")
    litros = readInt("introdueix un valor Enter", "NO VALID")
    println("familia monoparental o numerosa?")
    familia = readBoolean("introdueix un valor Boolean", "NO VALID")

    if (familia){
        println("quants sou?")
        numFamiliars = readInt("introdueix un valor Enter", "NO VALID")
    }
    println("tens algun Bo Social?")
    boSocial = readBoolean("introdueix un valor Boolean", "NO VALID")


    var preuFinal = calcularPreuFinal(litros,familia,boSocial,numFamiliars)

    println("El preu a pagar es $preuFinal")

}