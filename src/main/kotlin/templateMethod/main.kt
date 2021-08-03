package templateMethod

import java.math.BigDecimal

fun main(args: Array<String>) {

    val orcamentoUm: Orcamento = Orcamento(BigDecimal("400.0"), 10)
    val orcamentoDois: Orcamento = Orcamento(BigDecimal("600.0"), 3)
    val calculadoraDeDesconto: CalculadoraDeDesconto = CalculadoraDeDesconto()

    println("Testando desconto mais de 5 itens: ${calculadoraDeDesconto.calcular(orcamentoUm)}")
    println("Testando desconto valor maior que 500: ${calculadoraDeDesconto.calcular(orcamentoDois)}")
}

/*
Consiste em tentar extrair parte da lógica das classes filhas para as classes mães,
fazendo com que parte do processo aconteça nas classes mães e parte aconteça nas
classes filhas.
*/