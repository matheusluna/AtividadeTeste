function reajuste(salario){
	var salarioFinal;

	if(salario<=280){
		salarioFinal = salario + (salario*20/100);
	}else if((salario>280) && (salario<=700)){
		salarioFinal = salario + (salario*15/100);
	}else if((salario>700) && (salario<=1500)){
		salarioFinal = salario + (salario*10/100);
	}else{
		salarioFinal = salario + (salario*5/100);
	}

	return salarioFinal;
}