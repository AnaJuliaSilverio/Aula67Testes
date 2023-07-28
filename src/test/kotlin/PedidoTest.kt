
import org.junit.jupiter.api.Test
import org.mockito.Mockito.*

class PedidoTest {
    @Test
    fun atualizarPedidoDeveNotificarClienteCorretamente() {
        val clienteMock = mock(Cliente::class.java)
        val carrinhoMock = mock(Carrinho::class.java)
        val pedido = Pedido(clienteMock, carrinhoMock)
        pedido.atualizarPedido("Enviado")
        verify(clienteMock, times(1)).update("Enviado")
    }


}
