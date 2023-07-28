import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertDoesNotThrow

class EstoqueTest {

    @Test
    fun verificaSeQtdEstaSendoRemovidaSucesso(){
        val estoque = Estoque()
        val produto = Estoque.Produto("Pera", 0.60)
        estoque.produtos[produto]=3
        estoque.removeProduto(produto,2)
        Assertions.assertEquals(1,estoque.produtos[produto])
    }
    @Test
    fun verificaSeExcecaoEhLancadaComQtdInvalida(){
        val estoque = Estoque()
        val produto = Estoque.Produto("Pera", 0.60)
        estoque.produtos[produto]=3
        Assertions.assertThrows(IllegalArgumentException::class.java) {
            estoque.removeProduto(produto,4)
        }
    }
    @Test
    fun verificaSeProdutoExistenteNoEstoque(){
        val estoque = Estoque()
        val produto = Estoque.Produto("Pera", 0.60)
        estoque.produtos[produto]=3
        assertDoesNotThrow { estoque.produtoDisponivel(produto)}
    }
    @Test
    fun verificaSeProdutoInexistenteNoEstoque(){
        val estoque = Estoque()
        val produto = Estoque.Produto("Pera", 0.60)
        Assertions.assertThrows(IllegalArgumentException::class.java) {
            estoque.produtoDisponivel(produto)
        }
    }

}