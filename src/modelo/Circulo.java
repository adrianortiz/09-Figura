package modelo;

public class Circulo implements Figuras {

	/**
	 * Área de un cúrculo
	 * 
	 * @param parameters parameters[0] = radio
	 * @return double retorna el área de un círculo
	 */
	@Override
	public double area(double[] parameters) {
		return Math.PI*Math.pow(parameters[0], 2);
	}

	/**
	 * Perímetro de un círculo
	 * 
	 * @param parameters parameters[0] = radio
	 * @return double retorna el área de un círculo
	 */
	@Override
	public double perimetro(double[] parameters) {
		return Math.PI * parameters[0];
	}

}
