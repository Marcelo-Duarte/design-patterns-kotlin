package state

import state.situacao.SituacaoOrcamento
import java.math.BigDecimal

class Orcamento(
    private var valor: BigDecimal,
    private val quantidadeItens: Int,
    private var situacao: SituacaoOrcamento
) {

    fun aplicarDescontoExtra() {
        var valorDescontoExtra: BigDecimal = BigDecimal.ZERO

        if(situacao.equals("EM ANALISE")) {
            valorDescontoExtra = BigDecimal("0.05")
        } else if(situacao.equals("APROVADO")) {
            valorDescontoExtra = BigDecimal("0.02")
        }

        this.valor = this.valor.subtract(valorDescontoExtra)
    }

    protected fun setSituacao(situacao: SituacaoOrcamento) {

    }

    public fun getValor(): BigDecimal {
        return valor
    }

    fun getQuantidadeItens(): Int {
        return quantidadeItens
    }
}