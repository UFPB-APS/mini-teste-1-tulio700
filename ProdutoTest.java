

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ProdutoTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ProdutoTest
{
    /**
     * Default constructor for test class ProdutoTest
     */
    public ProdutoTest()
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
    public void reajusteDezPorcento()
    {
        Produto produto2 = new ProdutoAmazon(1, "Pastel", 10.00);
        produto2.reajustarPreco(10.0);
        assertEquals(11.0, produto2.getPrecoReferencia(), 0.1);
    }

    @Test
    public void reajuste20porcento()
    {
        ProdutoAmazon produto1 = new ProdutoAmazon(2, "abc", 5.50);
        produto1.reajustarPreco(20);
        assertEquals(6.6, produto1.getPrecoReferencia(), 0.1);
    }


    @Test
    public void reajusteNegativo()
    {
        ProdutoAmazon produto1 = new ProdutoAmazon(4, "Chocolate", 3);
        produto1.reajustarPreco(-50);
        assertEquals(3.0, produto1.getPrecoReferencia(), 0.1);
    }
}




