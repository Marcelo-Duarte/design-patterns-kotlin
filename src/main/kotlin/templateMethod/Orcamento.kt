package templateMethod

import java.math.BigDecimal

class Orcamento(
    private val valor: BigDecimal,
    private val quantidadeItens: Int
) {

    fun getValor(): BigDecimal {
        return valor
    }

    fun getQuantidadeItens(): Int {
        return quantidadeItens
    }
}