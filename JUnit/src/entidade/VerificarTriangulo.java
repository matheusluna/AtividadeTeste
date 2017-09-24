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
public class VerificarTriangulo {
    private final float lado1;
    private final float lado2;
    private final float lado3;

    public VerificarTriangulo(float lado1, float lado2, float lado3) throws Exception {
        if(lado1 < 0) throw new Exception("Valor inválido");
        this.lado1 = lado1;
        if(lado2 < 0) throw new Exception("Valor inválido");
        this.lado2 = lado2;
        if(lado3 < 0) throw new Exception("Valor inválido");
        this.lado3 = lado3;
    }
    public boolean isTriangulo(){
        return ((lado1+lado2)>lado3) && ((lado1+lado3)>lado2) && ((lado2+lado3)>lado1);
    }
    public String getTipoTriangulo(){
        
        if(isTriangulo()){
            if((lado1==lado2) && (lado2==lado3)){
                return "Triângulo equilátero";
            }
            if((lado1==lado2) || (lado2==lado3) || (lado3==lado1)){
                return "Triângulo isósceles";
            }
            if((lado1!=lado2) && (lado2!=lado3)){
                return "Triângulo escaleno";
            }
        }
        
        return "Não é um triângulo";

    }
}
