/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import entidade.VerificarTriangulo;
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
public class TestVerificaTriangulo {
    
    public TestVerificaTriangulo() {
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
        VerificarTriangulo v = new VerificarTriangulo(5,6,10);
        assertTrue(v.isTriangulo());
    }
    @Test
    public void ct2() throws Exception{
        VerificarTriangulo v = new VerificarTriangulo(5,6,20);
        assertFalse(v.isTriangulo());
    }
    @Test
    public void ct3() throws Exception{
        VerificarTriangulo v = new VerificarTriangulo(5,6,20);
        assertEquals("Não é um triângulo",v.getTipoTriangulo());
    }
    @Test
    public void ct4() throws Exception{
        VerificarTriangulo v = new VerificarTriangulo(6,6,6);
        assertEquals("Triângulo equilátero",v.getTipoTriangulo());
    }
    @Test
    public void ct5() throws Exception{
        VerificarTriangulo v = new VerificarTriangulo(6,6,10);
        assertEquals("Triângulo isósceles",v.getTipoTriangulo());
    }
    @Test
    public void ct6() throws Exception{
        VerificarTriangulo v = new VerificarTriangulo(6,10,6);
        assertEquals("Triângulo isósceles",v.getTipoTriangulo());
    }
    @Test
    public void ct7() throws Exception{
        VerificarTriangulo v = new VerificarTriangulo(10,6,6);
        assertEquals("Triângulo isósceles",v.getTipoTriangulo());
    }
    @Test
    public void ct8() throws Exception{
        VerificarTriangulo v = new VerificarTriangulo(6,7,8);
        assertEquals("Triângulo escaleno",v.getTipoTriangulo());
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
