import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.Mockito.mock
import org.mockito.Mockito.`when`
import org.mockito.junit.jupiter.MockitoSettings

@MockitoSettings
class OfertasTest {
    private lateinit var carrinhoMock: Carrinho
    private lateinit var ofertas: Ofertas
    @BeforeEach
    fun setUp() {
        carrinhoMock = mock(Carrinho::class.java)
        ofertas = Ofertas(carrinhoMock)
    }

    @Test
    fun testOfertaMacaComDuasMacas() {
        `when`(carrinhoMock.carrinho).thenReturn(
            mutableMapOf(
                Estoque.Produto("Maça", 0.25) to 2,
                Estoque.Produto("Laranja", 0.60) to 1
            )
        )
        ofertas.ofertaMaca()
        assertEquals(0.60, ofertas.valorDesconto)
    }

    @Test
    fun testOfertaMacaSemDuasMacas() {
        `when`(carrinhoMock.carrinho).thenReturn(
            mutableMapOf(
                Estoque.Produto("Maça", 0.25) to 1,
                Estoque.Produto("Laranja", 0.60) to 2
            )
        )

        ofertas.ofertaMaca()
        assertEquals(0.0, ofertas.valorDesconto)
    }

    @Test
    fun testOfertaLaranjaComTresLaranjas() {
        `when`(carrinhoMock.carrinho).thenReturn(
            mutableMapOf(
                Estoque.Produto("Maça", 0.25) to 1,
                Estoque.Produto("Laranja", 0.60) to 3
            )
        )

        ofertas.ofertaLaranja()
        assertEquals(0.25, ofertas.valorDesconto)
    }

    @Test
    fun testOfertaLaranja_SemTresLaranjas() {
        `when`(carrinhoMock.carrinho).thenReturn(
            mutableMapOf(
                Estoque.Produto("Maça", 0.25) to 1,
                Estoque.Produto("Laranja", 0.60) to 2
            )
        )

        ofertas.ofertaLaranja()
        assertEquals(0.0, ofertas.valorDesconto)
    }
}