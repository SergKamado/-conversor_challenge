# -conversor_challenge
Conversor de monedas

Proyecto de Alura Latam Grupo 04 para la formación de BackEnd en Java

Radio de conversión con el conversor de monedas es radio de r(valor de 1 moneda extranjera en pesos) y s(moneda extranjera en terminos de moneda extranjera) donde s=1. Ej peso=r y monedaExtranjera=s=1 radioDeCambio=r/s=r.

Se uso una clase abstracta "Conversor" para escribir la variable de cantidad en privada y la variable de radioDeConversion en privada además de que incluyera dos métodos abstractos que todos los conversores llevarán.

Se hereda de "ConversorW una clase hija llamada ConversorMoneda de la cuál saldran todos los conversores de moneda. En ConversorMoneda se tienen que override los metodos abstractos que seran los que hagan la conversion usando el radio de cambio y la cantidad deseada a cambiar.

	@Override
	public double convertirRAS() {
		double convertir = super.getCantidad() / super.getRadioDeCambio();
		return convertir;
	}

	@Override
	public double convertirSAR() {
		double convertir = super.getCantidad() * super.getRadioDeCambio();
		return convertir;
	}

