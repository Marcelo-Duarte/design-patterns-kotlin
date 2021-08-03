package state.situacao

import state.DomainException
import state.Orcamento
import java.math.BigDecimal

abstract class SituacaoOrcamento {

    public abstract fun calcularValorDescontoExtra(orcamento: Orcamento): BigDecimal

    public open fun aprovar(orcamento: Orcamento) {
        throw DomainException("Orcamento nao pode ser aprovado")
    }

    public open fun reprovar(orcamento: Orcamento) {
        throw DomainException("Orcamento nao pode ser reprovado")
    }

    public open fun finalizar(orcamento: Orcamento) {
        throw DomainException("Orcamento nao pode ser finalizado")
    }
}