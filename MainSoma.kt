fun soma(a: Int, b: Int): Int {
    return  a + b

}

fun main() {
    val nota = 98
    var nome = "Marcos"

    if (nota >= 90) {
        println("Você $nome foi aprovado !. Sua nota foi de $nota ")
    }

    else {
        println("Desculpa $nome, mais você foi reprovado")

    }

    println("O resultado da conta é ${ soma(4, 4) }")

}



