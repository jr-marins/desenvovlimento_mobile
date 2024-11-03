class Produto(val nome: String, val valor: Double, val quantidade: Int ){
    
    //metodo exibir detalhes
    fun detalhes(){
        println("Produto: $nome | Preço: $valor | Quantidade: $quantidade")
    }
    
    // metodo calcular valor total
    fun calcularValor(): Double {
        return valor * quantidade
    }
}

fun main() {
    val produtos = listOf(
    	Produto("Caneta", 2.50, 10),
        Produto("Caderno", 15.0, 5),
        Produto("Mochila", 120.0, 2)
    ) 
    
    //Exibir detalhes
    var valorTotalProdutos = 0.0
    produtos.forEach { produto -> produto
    produto.detalhes()
    val valorTotalProduto = produto.calcularValor()
    println("Valor total do produto: $valorTotalProduto\n")
    valorTotalProdutos += valorTotalProduto
    }
    println("Valor total dos produtos: $valorTotalProdutos")
}

