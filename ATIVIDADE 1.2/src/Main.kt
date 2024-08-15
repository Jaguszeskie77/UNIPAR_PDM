//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val nome: String = "Emanoel"
    val idade: Int = 19
    val salario: Int = 2000
    val mesestrab: Int = 12
    val produtcompra: Int = 10
    val desconto: Int = 1200
    //-------------------------------------------
    var salarioanual: Int = salario * mesestrab
    var salarioliqui: Int = salarioanual - desconto

    var conca = "Ola $nome, seu salario anual liquido é de $salarioliqui"
    //--------------------------------------------

    println("Nome:$nome")
    println("Idade:$idade")
    println("Salario:$salario")
    println("Meses trabalhados:$mesestrab")
    println("Salario anual:$salarioanual")
    println("salario liquido:$salarioliqui")
    println("desconto anual:$desconto")
    println(conca)
}