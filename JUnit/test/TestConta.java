/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import entidade.Conta;
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
public class TestConta {
    
    public TestConta() {
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
    public void test1() throws Exception{
        Conta c = new Conta(1, "Matheus", 500, 1000);
        assertFalse("Saldo indisponível", c.sacar(1001));
    }
    @Test
    public void test2() throws Exception{
        Conta c = new Conta(1, "Matheus", 500, 1000);;
        assertFalse("Limite indisponível", c.comprarNoCredito(1201));
    }
    @Test
    public void test3() throws Exception{
        Conta c = new Conta(1, "Matheus", 500, 1000);
        assertFalse("Tentando sacar valor negativo", c.sacar(-10));
    }
    @Test
    public void test4() throws Exception{
        Conta c = new Conta(1, "Matheus", 500, 1000);
        assertFalse("Tentando depositar valor negativo", c.depositar(-500));
    }
    @Test
    public void test5() throws Exception{
        Conta c = new Conta(1, "Matheus", 500, 1000);
        assertFalse("Compra negativa no crédito", c.comprarNoCredito(-5));
    }
    @Test
    public void test6() throws Exception{
        Conta c = new Conta(1, "Matheus", 0, 1000);
        Conta c2 = new Conta(2, "João", 500, 800);
        assertFalse("Transferência sem saldo", c.transferir(c2, 50));
    }
    @Test
    public void test7() throws Exception{
        Conta c = new Conta(1, "Matheus", 500, 1000);
        Conta c2 = new Conta(2, "Chico", 500, 800);
        assertFalse("Transferência inválida", c.transferir(c2, -100));
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
