/* Uma classe do tipo data: insere os dados que irão compôr o sistema*/

data class Contato(val nome: String, val telefone: String)
/**
 *
 */
fun main() {
    // salvando a classe na função principal
    val contatos = mutableListOf<Contato>()

    while (true) {

        //Criando as opções
        println("################")
        println("1. Add contact")
        println("2. view contacts")
        println("3. search contact")
        println("4. exit")
        println("################")
        
        // Lendo a entrada do usuário e inserindo as condicionais
        when(readLine()?.toIntOrNull()) {
            1 -> {
                println("Digite o nome do contato: ")
                val nome = readLine()
                println("Digite o telefone do contato: ")
                val telefone = readLine()

                if (!nome.isNullOrBlank() && !telefone.isNullOrBlank()) {
                    contatos.add(Contato(nome, telefone))
                    println("Contato adicionado com sucesso!")
                } else {
                    println("Nome/Telefone inválidos.")
                }
            }
            2 -> {
                println("Contatos")
                contatos.forEach {
                    println("Nome: ${it.nome}, Telefone: ${it.telefone}.}")
                }
            }
            3 -> {
                println("Digite o nome do contato para pesquisar: ")
                val nomeBusca = readLine()
                val contatoEncontrado = contatos.find {
                    // ignorecase- armazena o nome, executa o .find, busca o nome == nome ignorando a tiporafia
                    it.nome.equals(nomeBusca, ignoreCase = true)
                }
                if (contatoEncontrado != null) {
                    println("Contato encontrado:" +
                            "nome : ${contatoEncontrado.nome}" +
                            "Telefone : ${contatoEncontrado.telefone}" )
                } else {
                    println("Contato não encontrado")
                }
            }
            4 -> {
                println("Saindo ... ")
                break
            }
            else -> println("Opção inválida.")
        }
    }
}