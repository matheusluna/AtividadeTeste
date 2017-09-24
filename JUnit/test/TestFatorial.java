/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import entidade.Fatorial;
import static junit.framework.Assert.assertEquals;
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
public class TestFatorial {
    
    public TestFatorial() {
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
    public void Caso_de_Teste_1() throws Exception{
        long resultado = new Fatorial().calculaFatorial(5);
        assertEquals(120,resultado);
    }
    
    @Test
    public void Caso_de_Teste_2() throws Exception{
        long resultado = new Fatorial().calculaFatorial(10);
        assertEquals(3628800,resultado);
    }
    
    @Test
    public void Caso_de_Teste_3() throws Exception{
        long resultado = new Fatorial().calculaFatorial(20);
        assertEquals(2432902008176640000L, resultado);
    }
    
    @Test(expected = Exception.class)
    public void Caso_de_Teste_4() throws Exception{
        long resultado = new Fatorial().calculaFatorial(-10);
        assertEquals(1, resultado);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
