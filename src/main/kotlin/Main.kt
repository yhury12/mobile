fun main() {
    val eric = Vendedor()
        eric.nome = "eric"
        eric.idade = 35
        eric.cpf = "05358482008"


        val junior = Cliente()
    junior.nome = "junior"
    junior.idade = 27
    junior.cpf = "09035689009"



    val cleiton = Fornecedor()
    cleiton.nome = "cleiton"
    cleiton.cpf = "05445089008"


    val livros = Produto()
    livros.quantidade = "10"
    livros.preco = "75"
    livros.codigo = "1234567891011"

    val move = Transportadora()
    move.cnpj ="132121342134214"

}