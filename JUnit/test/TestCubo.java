/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import entidade.Cubo;
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
public class TestCubo {
    
    public TestCubo() {
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
        assertEquals(9, Cubo.getAreaLado(2) , 0);
    }
    @Test
    public void ct2(){
        assertEquals(4, Cubo.getAreaLateral(1) , 0);
    }
    @Test
    public void ct3(){
        assertEquals(24, Cubo.getAreaTotal(2) , 0);
    }
    @Test
    public void ct4(){
        assertEquals(27, Cubo.getVolume(3) , 0);
    }
    @Test
    public void ct5(){
        assertEquals(125, Cubo.getVolume(5) , 0);
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
