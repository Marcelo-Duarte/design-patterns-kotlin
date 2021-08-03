package templateMethod

import java.math.BigDecimal

class DescontoValorMaisDeQuinhentos(
    proximoDesconto: Desconto
): Desconto(
    proximoDesconto = proximoDesconto
) {

    override fun efetuarCalculo(orcamento: Orcamento): BigDecimal {
        return orcamento.getValor().multiply(BigDecimal("0.05"))
    }

    override fun deveAplicar(orcamento: Orcamento): Boolean {
        return orcamento.getValor().compareTo(BigDecimal("500")) > 0
    }
}