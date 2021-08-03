package strategy

import java.math.BigDecimal

class Orcamento(
    private val valor: BigDecimal
) {

    fun getValor(): BigDecimal {
        return valor
    }
}