describe("Testando o conversor de temperatura",function(){

	var c = new Conversor();

	it("Celsius - Fahrenheit", function(){
		expect(122).toEqual(c.celsiusToFahrenheit(50));
	});

	it("Fahrenheit - Celsius", function(){
		expect(10).toEqual(c.fahrenheitToCelsius(50));
	});

	it("Celsius - Kelvin", function(){
		expect(298).toEqual(c.celsiusToKelvin(25));
	});

	it("Kelvin - Celsius", function(){
		expect(-234).toEqual(c.kelvinToCelsius(39));
	});
});
