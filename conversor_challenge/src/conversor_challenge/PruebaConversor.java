package conversor_challenge;

import conversor_challenge_monedas.ConversorPesoDolar;
import conversor_challenge_monedas.ConversorPesoYen;

public class PruebaConversor {

	public static void main(String[] args) {
		ConversorMoneda conversor = new ConversorPesoYen(20.0);
		System.out.println("20 pesos son " + conversor.convertirRAS() + " yen");
		System.out.println("20 yen son " + conversor.convertirSAR() + " pesos");
	}

}
