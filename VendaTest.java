

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

        assertEquals(2500, venda1.getTotal(), 0.1);
    }
}



