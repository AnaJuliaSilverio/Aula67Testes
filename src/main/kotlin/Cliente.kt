class Cliente(val nome:String,val cpf:String,val senha:String){
    fun update(status:String){
        println("Status do pedido foi atualizado.Novo status: $status")
    }

}