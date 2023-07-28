class Carrinho(val estoque: Estoque){

    val carrinho = mutableMapOf<Estoque.Produto,Int>()
    fun calculaTotal():Double{
        var total = 0.0
        for (item in carrinho.keys){
            total += (item.preco * carrinho[item]!!)
        }
        return total
    }
    fun adicionarProduto(produto: Estoque.Produto, quantidade:Int){
        estoque.produtoDisponivel(produto)
        estoque.removeProduto(produto,quantidade)
        if (carrinho.containsKey(produto)){
            val qtdAntiga = carrinho[produto]
            if (qtdAntiga != null) {
                carrinho[produto] = qtdAntiga+quantidade
            }
        }else carrinho.put(produto,quantidade)
    }
}