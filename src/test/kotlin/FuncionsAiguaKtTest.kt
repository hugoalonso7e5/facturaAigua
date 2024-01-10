import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class FuncionsAiguaKtTest {

    @Test
    fun calcPreuFinal() {
        assertEquals(6.0,calcularPreuFinal(litros = 2, familia = true, boSocial = false, numFamiliars = 0))
        assertEquals(13.5,calcularPreuFinal(litros = 100, familia = true, boSocial = false, numFamiliars = 8))
        assertEquals(6.0,calcularPreuFinal(litros = 100, familia = false, boSocial = true, numFamiliars = 0))
    }

    @Test
    fun calcDescuento() {
        assertEquals(80,calcDescuento(familia = true, boSocial = true, numFamiliars = 6))
        assertEquals(40,calcDescuento(familia = true, boSocial = false, numFamiliars = 4))
        assertEquals(50,calcDescuento(familia = true, boSocial = false, numFamiliars = 5))
        assertEquals(0,calcDescuento(familia = false, boSocial = false, numFamiliars = 5))
    }

    @Test
    fun calcVariable() {
        assertEquals(52.02, calcularVariable(289,40))
        assertEquals(47.88, calcularVariable(228,30))
    }
}