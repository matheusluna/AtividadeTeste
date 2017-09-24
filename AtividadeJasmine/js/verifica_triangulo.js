function verificaTriangulo(lado1, lado2, lado3){
	
	if((lado1+lado2)>lado3 && (lado1+lado3)>lado2 && (lado2+lado3)>lado1){
		if((lado1==lado2) && (lado2==lado3)) return "Triângulo equilátero";
		if((lado1==lado2) || (lado2==lado3) || (lado3==lado1)) return "Triângulo isósceles";
		if((lado1!=lado2) && (lado2!=lado3)) return "Triângulo escaleno";
	}else{
		return "Não é triângulo";
	}

	
}