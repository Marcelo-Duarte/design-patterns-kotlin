package state.situacao

import state.Orcamento
import java.math.BigDecimal

class Aprovado {
    public fun calcularValorDescontoExtra(orcamento: Orcamento): BigDecimal {
        return orcamento.getValor().multiply(BigDecimal("0.05"))
    }

}