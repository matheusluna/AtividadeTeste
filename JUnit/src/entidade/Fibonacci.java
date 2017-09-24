/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidade;

/**
 *
 * @author mathe
 */
public class Fibonacci {
    public static int getEnesimo(int n) throws Exception{
        int resultado;
        if(n < 0)throw new Exception("Número inválido");
        if(n == 0 || n==1){
            resultado = n;
        }else{
            resultado = getEnesimo(n-1) + getEnesimo(n-2);
        }
        
        return resultado;
    }
}
