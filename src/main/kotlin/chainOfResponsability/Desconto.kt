package chainOfResponsability

import java.math.BigDecimal

abstract class Desconto(
    private val proximoDesconto: Desconto?
) {

    protected fun getProximoDesconto(): Desconto? {
        return proximoDesconto
    }

    abstract fun calcular(orcamento: Orcamento): BigDecimal
}