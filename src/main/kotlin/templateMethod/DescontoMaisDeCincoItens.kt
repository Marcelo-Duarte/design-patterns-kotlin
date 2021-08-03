package templateMethod

import java.math.BigDecimal

class DescontoMaisDeCincoItens(
    proximoDesconto: Desconto
): Desconto(
    proximoDesconto = proximoDesconto
) {

    override fun efetuarCalculo(orcamento: Orcamento): BigDecimal {
        return orcamento.getValor().multiply(BigDecimal("0.1"))
    }

    override fun deveAplicar(orcamento: Orcamento): Boolean {
        return orcamento.getQuantidadeItens() > 5
    }
}