fun calcularPreuFinal(litros: Int, familia: Boolean, boSocial: Boolean, numFamiliars: Int): Double{
    var preu = 0.0

    var preuFixe:Int = 6
    if(boSocial)preuFixe = 3

    var descuento:Int = calcDescuento(familia,boSocial,numFamiliars)

    var preuVariable:Double = calcVariable(litros, descuento)

    preu+=(preuFixe+preuVariable)

    return preu
}

fun calcDescuento(familia: Boolean, boSocial: Boolean, numFamiliars: Int): Int {
    var descompteTotal = 0

    if (boSocial){
        descompteTotal=80
        return descompteTotal
    }else if (familia){
        descompteTotal=10*numFamiliars
        if (descompteTotal>50) descompteTotal = 50
        return descompteTotal
    }

    return descompteTotal
}

fun calcVariable(litros: Int, descuento: Int): Double {
    var preuRetorn = 0.0
    var preuLitre = 0.0
    var aDescomptar:Double
    if(litros in 50..200){
         preuLitre = 0.15
    }else if (litros>200){
        preuLitre=0.3
    }
    val litrosTotal = preuLitre * litros

    aDescomptar = (litrosTotal*descuento)/100

    preuRetorn= litrosTotal - aDescomptar
    return preuRetorn
}
