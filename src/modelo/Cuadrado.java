package modelo;

/**
 * 
 * @author Adrian
 *
 */
public class Cuadrado implements Figuras{

	@Override
	public double area(double[] parameters) {
		return parameters[0] * parameters[0];
	}

	@Override
	public double perimetro(double[] parameters) {
		return parameters[0] * 4;
	}

}
