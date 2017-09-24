function calculaConceito(nota1, nota2){	
	if(nota1<0 || nota2<0){
		return "Notas inválidas";
	}
  var media = (nota1+nota2)/2;

  if((media>=9) && (media<=10)){
  	return "A";
  }else if((media>=7.5) && (media<=8.9)){
  	return "B";
  }else if((media>=6) && (media<=7.4)){
  	return "C";
  }

}
