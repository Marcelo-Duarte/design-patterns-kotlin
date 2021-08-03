package chainOfResponsability

import java.math.BigDecimal

interface Imposto {
    fun calcular(orcamento: Orcamento): BigDecimal
}