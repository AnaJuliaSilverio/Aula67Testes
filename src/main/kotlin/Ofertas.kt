class Ofertas(val carrinho:Carrinho){
    var valorDesconto = 0.0
    fun ofertaMaca(){
        for (item in carrinho.carrinho.keys){
            if (item.nome=="Maça"&& carrinho.carrinho[item]!! >=2) {
                valorDesconto+=0.60
                return
            }
        }
    }
    fun ofertaLaranja(){
        for (item in  carrinho.carrinho.keys){
            if (item.nome=="Laranja"&&  carrinho.carrinho[item]!! >=3) {
                valorDesconto+=0.25
                return
            }
        }
    }
}