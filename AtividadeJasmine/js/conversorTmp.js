function Conversor(){

  this.celsiusToFahrenheit = celsiusToFahrenheit;
  this.fahrenheitToCelsius = fahrenheitToCelsius;
  this.celsiusToKelvin = celsiusToKelvin;
  this.kelvinToCelsius = kelvinToCelsius;

  function celsiusToFahrenheit(_temp){
    return ((_temp/5)*9)+32;
  }

  function fahrenheitToCelsius(_temp){
    return (_temp-32)/1.8;
  }

  function celsiusToKelvin(_temp){
    return _temp+273;
  }

  function kelvinToCelsius(_temp){
    return _temp-273;
  }

}
