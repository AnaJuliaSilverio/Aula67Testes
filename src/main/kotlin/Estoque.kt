import java.lang.IllegalArgumentException

class Estoque {
    data class Produto(var nome:String,var preco:Double)
    val produtos = mutableMapOf<Produto,Int>()
    init {
        produtos.put(Produto("Maça",0.60),3)
        produtos.put(Produto("Laranja",0.25),5)
    }

    fun removeProduto(produto: Produto,qtd:Int){
        val qtdAntiga = produtos[produto]!!
        if (qtdAntiga-qtd<0) throw IllegalArgumentException("Quantidade inválida!")
        produtos[produto]=qtdAntiga-qtd

    }
    fun produtoDisponivel(produto: Produto){
        if (!produtos.containsKey(produto))throw IllegalArgumentException("Produto Indisponivel!")
    }


}