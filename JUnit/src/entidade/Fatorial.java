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
public class Fatorial {
    public long calculaFatorial(long num) throws Exception{
        long fatorial = 1;
        if(num < 0) throw new Exception("Erro: Parâmetro negativo");
        for(long i = 1; i <= num; i++){
            fatorial *= i;
        }
        return fatorial;
    }
}
