describe("Testando função do triângulo",function(){

	it("Testando triângulo equilátero", function(){
		expect("Triângulo equilátero").toEqual(verificaTriangulo(5,5,5));
	});
	it("Testando triângulo isósceles 1", function(){
		expect("Triângulo isósceles").toEqual(verificaTriangulo(6,6,3));
	});
	it("Testando triângulo isósceles 2", function(){
		expect("Triângulo isósceles").toEqual(verificaTriangulo(2,7,7));
	});
	it("Testando triângulo escaleno", function(){
		expect("Triângulo escaleno").toEqual(verificaTriangulo(20,9,12));
	});

});
