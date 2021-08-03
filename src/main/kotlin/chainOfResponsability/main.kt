package chainOfResponsability

import java.math.BigDecimal

fun main(args: Array<String>) {

    val orcamentoUm: Orcamento = Orcamento(BigDecimal("400.0"), 10)
    val orcamentoDois: Orcamento = Orcamento(BigDecimal("600.0"), 3)
    val calculadoraDeDesconto: CalculadoraDeDesconto = CalculadoraDeDesconto()

    println("Testando desconto mais de 5 itens: ${calculadoraDeDesconto.calcular(orcamentoUm)}")
    println("Testando desconto valor maior que 500: ${calculadoraDeDesconto.calcular(orcamentoDois)}")
}

    /*
    Consiste em evitar que a classe cresça indefinidamente, substituindo uma cadeia de "if's" que serviam para verificar
    as características de um atributo de uma classe criando uma classe que abstrai cada uma destas características relevantes
    à regra de negócio e fazendo com que cada classe, através de composições, invoque a próxima classe caso sua regra não seja cumprida.

    Exemplo: Classe A que representa uma determinada característica
             Classe B que representa uma determinada característica
             Classe C que representa uma determinada característica
             Classe D que representa nenhuma regra de negócio e servirá como fim da cadeia

             Método na classe A:
             regra da classe A foi cumprida? Se sim -> retorna o valor referente à regra
                                             Se não -> retorna o método da classe B

             Método na classe B:
             regra da classe B foi cumprida? Se sim -> retorna o valor referente à regra
                                             Se não -> retorna o método da classe C

             Método na classe C:
             regra da classe C foi cumprida? Se sim -> retorna o valor referente à regra
                                             Se não -> retorna o método de uma classe D (Fim da cadeia)
     */