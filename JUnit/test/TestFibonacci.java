/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import entidade.Fibonacci;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author mathe
 */
public class TestFibonacci {
    
    public TestFibonacci() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void ct1() throws Exception{
        assertEquals(2, Fibonacci.getEnesimo(3));
    }
    @Test
    public void ct2() throws Exception{
        assertEquals(13, Fibonacci.getEnesimo(7));
    }
    @Test
    public void ct3() throws Exception{
        assertEquals(34, Fibonacci.getEnesimo(9));
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
