package state

import java.math.BigDecimal

fun main(args: Array<String>) {

    val orcamentoUm: Orcamento = Orcamento(BigDecimal("400.0"), 10)
    val orcamentoDois: Orcamento = Orcamento(BigDecimal("600.0"), 3)
    val calculadoraDeDesconto: CalculadoraDeDesconto = CalculadoraDeDesconto()

    println("Testando desconto mais de 5 itens: ${calculadoraDeDesconto.calcular(orcamentoUm)}")
    println("Testando desconto valor maior que 500: ${calculadoraDeDesconto.calcular(orcamentoDois)}")
}

/*

*/