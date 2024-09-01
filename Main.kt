import kotlin.time.times
fun calcular_area_retangulo(base: Double, altura: Double) {
    return base * altura
}
fun calcular_colume_retangulo(base: Double, altura: Double, profundidade: Double) {
    return calcular_area_retangulo(base, altura) * profundidade
}
fun main (){
// nomenclatura clean code
    var age: Int = 25

    // Snakecase
    var first_name: String = "Marcos"

//    println(age)
//    print(first_name)
//
//    fun processar_dados() {
//        // 5 linhas = codigo legivel
//    }


    var valor1: Int = 5
    var valor2: Int = 5
    var valor3: Int = 5

    var condicao:

    if condicao{
        x = valor1
    }
    else{
        x =valor2
    }

    x = valor1 if condicao else valor2

    options = {
        'opção 1' = valor1,
        'opcao 2' = valor2,
        'opcao 3' = valor3
    }
}
