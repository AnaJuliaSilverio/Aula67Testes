import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class CarrinhoTest {
    val estoque =Estoque()
    val carrinho = Carrinho(estoque)
    val listaCarrinho = carrinho.carrinho
    @Test
    fun verificaSeProdutoEstaSendoAdicionadoAoCarrinho(){
        val produto = Estoque.Produto("Maça", 0.60)
        carrinho.adicionarProduto(produto,3)
        Assertions.assertTrue(listaCarrinho.containsKey(produto))
    }
    @Test
    fun verificaSeValorTotalDoCarrinhoEstaCorreto(){
        val produto = Estoque.Produto("Maça", 0.60)
        carrinho.adicionarProduto(produto,3)
        val produto2 = Estoque.Produto("Laranja", 0.25)
        carrinho.adicionarProduto(produto2,1)
        Assertions.assertEquals(2.05,carrinho.calculaTotal())
    }
}