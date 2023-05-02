package conversor_challenge_monedas;

import javax.swing.JOptionPane;

import conversor_challenge.ConversorMoneda;

public class ConversionSeleccionada {
	double resultado=0;
	private String tipoMoneda="";
	private String tipoMonedaUnitaria="";
	String conversionMoneda;
	double cantidad;
	String titulo;
	ConversorMoneda x;
	MetodosConversionMonedaSeleccionada metodoMoneda;
	
	public ConversionSeleccionada(String conversionMoneda, double cantidad, String titulo) {
		super();
		this.conversionMoneda = conversionMoneda;
		this.cantidad = cantidad;
		this.titulo = titulo;
		this.metodoMoneda = new MetodosConversionMonedaSeleccionada();
		
	}	
	
	String[] conversionMonedaList = {"Peso a Dólar",
			"Peso a Euro",
			"Peso a Libras", 
			"Peso a Yen",
			"Peso a Won Coreano",
			"Dólar a peso",
			"Euro a peso",
			"Libras a peso",
			"Yen a peso",
			"Won Coreano a peso",};
	public String getTipoMoneda() {
		return tipoMoneda;
	}

	public void setTipoMoneda(String tipoMoneda) {
		this.tipoMoneda = tipoMoneda;
	}

	public String getTipoMonedaUnitaria() {
		return tipoMonedaUnitaria;
	}

	public void setTipoMonedaUnitaria(String tipoMonedaUnitaria) {
		this.tipoMonedaUnitaria = tipoMonedaUnitaria;
	}
	
	public void definirTipoMoneda(String tipoMoneda, String tipoMonedaUnitaria) {
		this.setTipoMoneda(tipoMoneda);
		this.setTipoMonedaUnitaria(tipoMonedaUnitaria);
	}
	
	public void actualizarDatos (ConversorMoneda x, String tipoMoneda, String tipoMonedaUnitaria) {
		metodoMoneda.metodoMonedaDatos(x, tipoMoneda, tipoMonedaUnitaria);
		this.resultado = this.metodoMoneda.getResultado();
		this.tipoMoneda = this.metodoMoneda.getTipoMoneda();
	}
	
	public void elegirTipoCambio() {
		if (this.conversionMoneda == conversionMonedaList[0]) {
			definirTipoMoneda("dolares", "dolar");
		}  else if (this.conversionMoneda == conversionMonedaList[1]) {
			definirTipoMoneda("euros", "euro");
		} else if (this.conversionMoneda == conversionMonedaList[2]) {
			definirTipoMoneda("libras", "libra");
		}  else if (this.conversionMoneda == conversionMonedaList[3]) {
			definirTipoMoneda("yenes", "yen");
		}else if (this.conversionMoneda == conversionMonedaList[4]) {
			definirTipoMoneda("euros", "euro");
		}  else  {
			definirTipoMoneda("pesos", "peso");
			}
	}
	

	public void eleccionDeClaseHijadeConversorMoneda() {
		if (this.conversionMoneda == conversionMonedaList[0] || this.conversionMoneda == conversionMonedaList[5]) {
				x = new ConversorPesoDolar(this.cantidad);
		} else if (this.conversionMoneda == conversionMonedaList[1] || this.conversionMoneda == conversionMonedaList[6]) {
			x = new ConversorPesoEuro(this.cantidad);
		} else if (this.conversionMoneda == conversionMonedaList[2] || this.conversionMoneda == conversionMonedaList[7]) {
				x = new ConversorPesoLibraEsterlina(this.cantidad);
		} else if (this.conversionMoneda == conversionMonedaList[3] || this.conversionMoneda == conversionMonedaList[8]) {
			x = new ConversorPesoYen(this.cantidad);
		}else if (this.conversionMoneda == conversionMonedaList[4] || this.conversionMoneda == conversionMonedaList[9]) {
			x = new ConversorPesoWon(this.cantidad);
		}
	}
	
	public void metodoDeConversionElegida() {		
		eleccionDeClaseHijadeConversorMoneda();
		elegirTipoCambio();
		actualizarDatos(x, this.tipoMoneda, this.tipoMonedaUnitaria);

		JOptionPane.showMessageDialog(null,"Son " + resultado +" "+ tipoMoneda,
				titulo , JOptionPane.INFORMATION_MESSAGE);;
	}
}
