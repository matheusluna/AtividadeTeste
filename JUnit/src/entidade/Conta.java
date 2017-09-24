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
public class Conta {
    private int numero;
    private String titular;
    private double saldo;
    private double limiteCredito;

    public Conta(int numero, String titular, double saldo, double limiteCredito) throws Exception {
        this.numero = numero;
        this.titular = titular;
        if(saldo < 0) throw new Exception("Valor inválido");
        this.saldo = saldo;
        this.limiteCredito = limiteCredito;
    }
    public boolean sacar(double valor){
        if(valor>0){
            if(saldo<=0 || saldo<valor){
                return false;
            }else{
                saldo -= valor;
                return true;
            }
        }else{
            return false;
        }
    }
    public boolean depositar(double valor){
        if(valor>0){
            saldo += valor;
            return true;
        }else{
            return false;
        }
    }
    public boolean transferir(Conta destino, double valor){
        if(valor>0){
            if(saldo<=0 || saldo<valor){
                return false;
            }else{
                saldo -= valor;
                destino.depositar(valor);
                return true;
            }
        }else{
            return false;
        }
    }
    public boolean comprarNoCredito(double valor){
        if(valor>0){
            if(limiteCredito<=0 || limiteCredito<valor){
                return false;
            }else{
                limiteCredito -= valor;
                return true;
            }
        }else{
            return false;
        }
    }
}
