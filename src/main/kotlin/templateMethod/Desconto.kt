package templateMethod

import java.math.BigDecimal

abstract class Desconto(
    private val proximoDesconto: Desconto?
) {

    protected fun getProximoDesconto(): Desconto? {
        return proximoDesconto
    }

    fun calcular(orcamento: Orcamento): BigDecimal {
        if(deveAplicar(orcamento)) {
            return efetuarCalculo(orcamento)
        }

        return proximoDesconto!!.calcular(orcamento)
    }

    abstract fun efetuarCalculo(orcamento: Orcamento): BigDecimal
    abstract fun deveAplicar(orcamento: Orcamento): Boolean
}