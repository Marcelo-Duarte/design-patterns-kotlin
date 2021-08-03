package chainOfResponsability

import java.math.BigDecimal

class DescontoMaisDeCincoItens(
    proximoDesconto: Desconto
): Desconto(
    proximoDesconto = proximoDesconto
) {

    override fun calcular(orcamento: Orcamento): BigDecimal {
        if(orcamento.getQuantidadeItens() > 5) {
            return orcamento.getValor().multiply(BigDecimal("0.1"))
        }
        return getProximoDesconto()!!.calcular(orcamento)
    }
}