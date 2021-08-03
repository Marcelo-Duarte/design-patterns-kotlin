package state

import java.math.BigDecimal

class CalculadoraDeDesconto {

    fun calcular(orcamento: Orcamento): BigDecimal {
        val desconto: Desconto = DescontoMaisDeCincoItens(DescontoValorMaisDeQuinhentos(SemDesconto()))

        return desconto.efetuarCalculo(orcamento)
    }

}