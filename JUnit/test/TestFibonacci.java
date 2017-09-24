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
    public void test1(){
        assertEquals(9, Cubo.getAreaLado(3) , 0);
    }
    @Test
    public void test2(){
        assertEquals(16, Cubo.getAreaLateral(2) , 0);
    }
    @Test
    public void test3(){
        assertEquals(24, Cubo.getAreaTotal(2) , 0);
    }
    @Test
    public void test4(){
        assertEquals(27, Cubo.getVolume(3) , 0);
    }
    @Test
    public void test5(){
        assertEquals(100, Cubo.getAreaLado(10) , 0);
    }
    @Test
    public void test6(){
        assertEquals(125, Cubo.getVolume(5) , 0);
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
