package chainOfResponsability

import java.math.BigDecimal

class SemDesconto: Desconto(
    proximoDesconto = null
) {

    override fun calcular(orcamento: Orcamento): BigDecimal {
        return BigDecimal.ZERO
    }
}