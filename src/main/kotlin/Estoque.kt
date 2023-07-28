class Produtos {
    data class Produto(var nome:String,var preco:Double,var quantidadeEstoque:Int)

    val produtos = arrayListOf(
        Produto("Maça",0.60,5),
        Produto("Laranja",0.25,5),
    )


}