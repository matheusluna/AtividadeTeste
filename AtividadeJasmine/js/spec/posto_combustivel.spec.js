describe("Testando função do posto de combustível",function(){

	it("Testando álcool até 20 litros", function(){
		expect(6.208).toEqual(preco("A", 2));
	});
	it("Testando álcool acima de 20 litros", function(){
		expect(228).toEqual(preco("A", 75));
	});

	it("Testando gasolina até 20 litros", function(){
		expect(28.416).toEqual(preco("G", 8));
	});
	it("Testando gasolina acima de 20 litros", function(){
		expect(153.032).toEqual(preco("G", 44));
	});

});
