describe("Testando função do reajuste",function(){

	it("Testando salário até R$ 280", function(){
		expect(240).toEqual(reajuste(200));
	});
	it("Testando salário acima de R$ 280 até R$ 700", function(){
		expect(690).toEqual(reajuste(600));
	});
	it("Testando salário acima de R$ 700 até R$ 1500", function(){
		expect(1320).toEqual(reajuste(1200));
	});
	it("Testando salário acima de R$ 1500", function(){
		expect(4725).toEqual(reajuste(4500));
	});

});
