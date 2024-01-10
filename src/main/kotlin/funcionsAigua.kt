/**
 * Funcio que calcula el preu final. A partir de diferents parametres, demana a un altre funcio que calculi el descompte per, trucant
 * a un altre funció, calcular el preu total.
 * @author hugoalonso7e5
 * @param litros Variable dels llitres introduits
 * @param familia Variable amb el boolean que indica si es o no familia nombrosa/monoParental
 * @param boSocial Variable amb el boolean que indica si te o no un boSocial
 * @param numFamiliars Variable amb el numero de personas a la familia per, en cas de tenir beneficis
 * de familia mono/nombrosa, fer un descompte o un altre
 * @return Retorna el preu final ja calculat
 */
fun calcularPreuFinal(litros: Int, familia: Boolean, boSocial: Boolean, numFamiliars: Int): Double{
    var preu = 0.0

    var preuFixe:Int = 6
    if(boSocial)preuFixe = 3

    var descuento:Int = calcDescuento(familia,boSocial,numFamiliars)

    var preuVariable:Double = calcularVariable(litros, descuento)

    preu+=(preuFixe+preuVariable)

    return preu
}

/**
 * A aquesta funcio es calcula el descompte a partir de les diferents variables bool que ha respós a les preguntes formulades al Main.
 * @author hugoalonso7e5
 * @param familia Variable amb el boolean que indica si es o no familia nombrosa/monoParental
 * @param boSocial Variable amb el boolean que indica si te o no un boSocial
 * @param numFamiliars Variable amb el numero de personas a la familia per, en cas de tenir beneficis
 * @return es retorna el descompte més rentable aplicable.
 */
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

/**
 * A aquesta funcio es calcula el descompte a partir de les diferents variables bool que ha respós a les preguntes formulades al Main.
 * @author hugoalonso7e5
 * @param litros Litros es la variables del llitres que s'ha introduit a la variable des del Main.
 * @param descuento El descompte es la variable calculada del descompte a partir dels bools.
 * @return el que retorna es la variable on s'ha calculat el preu total dels llitres i s'ha aplicat el descompte si hi ha.
 */
fun calcularVariable(litros: Int, descuento: Int): Double {
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
