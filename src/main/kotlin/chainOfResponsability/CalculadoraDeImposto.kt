package chainOfResponsability

import java.math.BigDecimal

class CalculadoraDeImposto {

    fun calcular(orcamento: Orcamento, imposto: Imposto): BigDecimal {
        return imposto.calcular(orcamento)
    }
}