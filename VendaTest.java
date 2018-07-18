

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class VendaTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class VendaTest
{
    /**
     * Default constructor for test class VendaTest
     */
    public VendaTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }


    @Test
    public void totalVenda()
    {
        Venda venda1 = new Venda();

        Produto produto1 = new Produto(1, "iPhone", 1000);
        ItemVenda itemVend1 = new ItemVenda();
        itemVend1.setProduto(produto1);
        itemVend1.setQuantidade(2);
        venda1.addNoCarrinho(itemVend1, 0);

        Produto produto2 = new Produto(2, "S8", 500);
        ItemVenda itemVend2 = new ItemVenda();
        itemVend2.setProduto(produto2);
        itemVend2.setQuantidade(1);
        venda1.addNoCarrinho(itemVend2, 1);

        assertEquals(2625, venda1.calcularTotal(), 0.1);
    }

    @Test
    public void vendaComSeguro()
    {
        Seguro seguro1 = new Seguro("Porto Seguro", 0.02);
        Seguro seguro2 = new Seguro("Mapfre", 0.015);
        Venda venda1 = new Venda();
        venda1.setSeguro(seguro1);
        Produto produto1 = new Produto(1, "Banana", 0.1);
        ItemVenda itemVend1 = new ItemVenda();
        itemVend1.setProduto(produto1);
        itemVend1.setQuantidade(100);
        venda1.addNoCarrinho(itemVend1, 0);
        assertEquals(10.71, venda1.calcularTotal(), 0.1);
        venda1.setSeguro(seguro2);
        assertEquals(10.66, venda1.calcularTotal(), 0.1);
    }
}




