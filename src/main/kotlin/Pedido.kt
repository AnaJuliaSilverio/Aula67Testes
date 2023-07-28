class Pedidos {
    data class Pedido(val id:Int,val nomeCliente:String,val carrinho: Carrinho,var status:String)
    val pedidos = arrayListOf<Pedido>()

    fun adicionarPedido(nomeCliente:String,carrinho: Carrinho){
        val status = "Em andamento"
        val pedido = Pedido(1,nomeCliente,carrinho,status)
        pedidos.add(pedido)
    }
    fun atualizarPedido(pedido: Pedido,status: String){
        pedido.status = status
    }
}