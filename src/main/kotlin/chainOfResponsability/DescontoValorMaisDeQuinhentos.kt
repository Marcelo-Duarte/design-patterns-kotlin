package chainOfResponsability

import java.math.BigDecimal

class DescontoValorMaisDeQuinhentos(
    proximoDesconto: Desconto
): Desconto(
    proximoDesconto = proximoDesconto
) {

    override fun calcular(orcamento: Orcamento): BigDecimal {
        if(orcamento.getValor().compareTo(BigDecimal("500")) > 0) {
            return orcamento.getValor().multiply(BigDecimal("0.05"))
        }
        return getProximoDesconto()!!.calcular(orcamento)
    }
}