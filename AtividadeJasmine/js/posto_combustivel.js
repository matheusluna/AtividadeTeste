function preco(tipoCombustivel, litros){
	var precoFinal;
	if(tipoCombustivel == "A"){
		if(litros<=20){
			var litroPreco = 3.2 - 0.096;
			precoFinal = litroPreco * litros;
		}else{
			var litroPreco = 3.2 - 0.16;
			precoFinal = litroPreco * litros;
		}
	}
	if(tipoCombustivel == "G"){
		if(litros<=20){
			var litroPreco = 3.7 - 0.148;
			precoFinal = litroPreco * litros;
		}else{
			var litroPreco = 3.7 - 0.222;
			precoFinal = litroPreco * litros;
		}
	}	
	return precoFinal;
}