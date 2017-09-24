/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import entidade.Aviao;
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
public class TestAviao {
    
    public TestAviao() {
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
    public void ct1(){
        Aviao a = new Aviao();
        assertFalse("Voar com avião desligado", a.voar());
    }
    @Test
    public void ct2(){
        Aviao a = new Aviao();
        assertFalse("Pousar sem estar voando", a.pousar());
    }
    @Test
    public void ct3() throws Exception{
        Aviao a = new Aviao();
        a.ligar();
        a.acelerar(200);
        assertEquals(200, a.getVelocidade(),0);
    }
    @Test
    public void ct4() throws Exception{
        Aviao a = new Aviao();
        a.ligar();
        a.acelerar(200);
        a.desacelerar(100);
        assertEquals(100, a.getVelocidade(),0);
    }
    @Test
    public void ct5() throws Exception{
        Aviao a = new Aviao();
        assertFalse("Acelerar desligado", a.acelerar(0));
    }
    @Test
    public void ct6() throws Exception{
        Aviao a = new Aviao();
        assertFalse("Desacelerar desligado", a.desacelerar(0));
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
