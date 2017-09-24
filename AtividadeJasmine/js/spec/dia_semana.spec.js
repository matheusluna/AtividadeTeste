describe("Testando função de dia da semana",function(){

  it("Dia válido", function(){
		expect("Terça").toEqual(diaSemana(3));
	});

  it("Dia inválido menor que 1", function(){
    expect("inválido").toEqual(diaSemana(-6));
  });

  it("Dia inválido maior que 7", function(){
		expect("inválido").toEqual(diaSemana(9));
	});

});
