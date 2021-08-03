package state.situacao

import state.Orcamento
import java.math.BigDecimal

class EmAnalise: SituacaoOrcamento() {

    public override fun calcularValorDescontoExtra(orcamento: Orcamento): BigDecimal {
        return orcamento.getValor().multiply(BigDecimal("0.05"))
    }

    public override fun aprovar(orcamento: Orcamento) {
        orcamento.SetSituacao(Aprovado())
    }

    public override fun reprovar(orcamento: Orcamento) {
        orcamento.SetSituacao(Reprovado())
    }
}