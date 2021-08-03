package strategy

import java.math.BigDecimal

fun main(args: Array<String>) {

    val orcamento: Orcamento = Orcamento(BigDecimal("1000.0"))
    val icms: ICMS = ICMS()
    val iss: ISS = ISS()
    val calculadoraDeImposto: CalculadoraDeImposto = CalculadoraDeImposto()

    println("Testando ICMS: ${calculadoraDeImposto.calcular(orcamento, icms)}")
    println("Testando ISS: ${calculadoraDeImposto.calcular(orcamento, iss)}")
}

/*
Consiste em eliminar os "if's" alocando as opções em suas próprias classes e agrupando-as através de interfaces
Neste caso, cada opção de imposto seria uma opção a mais nos "if's" ou no "when"
Fazendo com que a classe crescesse sempre que um novo imposto fosse adicionado à regra de negócio da aplicação
Com o strategy, o método "calcular" recebe um imposto genérico através do polimorfismo e não um tipo de imposto específico
Então quando um novo imposto é adicionado, basta criar uma classe para ele e implementar a interface "Imposto"
*/