class Pedido(val cliente:Cliente, val carrinho: Carrinho){
    var valorTotal =0.0
    var status =""
    init {
        this.status = "Em andamento"
    }
    fun atualizarPedido(status: String){
        this.status = status
        notifyCliente()
    }
    private fun notifyCliente(){
        cliente.update(status)
    }
}