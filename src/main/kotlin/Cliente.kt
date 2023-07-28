class Clientes {
    data class Cliente(val nome:String,val cpf:String,val senha:String,val pedidos:ArrayList<Pedidos.Pedido>)

}