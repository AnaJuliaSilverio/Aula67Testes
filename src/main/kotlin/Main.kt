fun main() {
    val estoque = Estoque()
    val carrinho = Carrinho(estoque)
    val cliente = Cliente("Ana","16147684639","123")
    val pedido = Pedido(cliente,carrinho)
    val ofertas = Ofertas(carrinho)
    val produto = Estoque.Produto("Maça", 0.60)
    carrinho.adicionarProduto(produto,3)
    ofertas.ofertaMaca()
    val desconto = ofertas.valorDesconto
    println(carrinho.calculaTotal())
    println(desconto)
    pedido.valorTotal = carrinho.calculaTotal()-desconto
    println(pedido.valorTotal)
    println(pedido.status)



}