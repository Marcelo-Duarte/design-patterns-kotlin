package state

import java.math.BigDecimal

class SemDesconto: Desconto(
    proximoDesconto = null
) {

    override fun efetuarCalculo(orcamento: Orcamento): BigDecimal {
        return BigDecimal.ZERO
    }

    override fun deveAplicar(orcamento: Orcamento): Boolean {
        return true
    }
}