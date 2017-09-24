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
public class Aviao {
    private boolean ligado;
    private boolean voando;
    private int potencia;
    private double velocidade;
    public Aviao(){
        ligado = false;
        voando = false;
        velocidade = 0;
        potencia = 2000;
    }
    public boolean ligar(){
        if(ligado == true){
            return false;
        }else{
            ligado = true;
            return true;
        }
    }
    public boolean desligar(){
        if(ligado == true){
            ligado = false;
            return true;
        }else{
            return false;
        }
    }
    public boolean acelerar(double valor) throws Exception{
        if(valor < 0) throw new Exception("Valor inválido");
        if(ligado==true){
            velocidade += valor;
            return true;
        }else{
            return false;
        }
    }
    public boolean desacelerar(double valor) throws Exception{
        if(valor < 0) throw new Exception("Valor inválido");
        if(ligado==true){
            velocidade -= valor;
            return true;
        }else{
            return false;
        }
    }
    public boolean voar(){
        if(voando == false){
            if(ligado==true){   
                voando = true;
                return true;
            }else{
                return false;
            }
        }else{
            return false;
        }
        
    }
    public boolean pousar(){
        if(voando == true){
            velocidade = 0;
            voando = false;
            return true;
        }else{
            return false;
        }
    }

    public boolean estaLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean estaVoando() {
        return voando;
    }

    public void setVoando(boolean voando) {
        this.voando = voando;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) throws Exception {
        if(potencia < 0) throw new Exception("Valor inválido");
        this.potencia = potencia;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) throws Exception {
        if(velocidade < 0) throw new Exception("Valor inválido");
        this.velocidade = velocidade;
    }
}
