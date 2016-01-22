package modelo;

public class Rectangulo implements Figuras{

	@Override
	public double area(double[] parameters) {
		return parameters[0] * parameters[1];
	}

	@Override
	public double perimetro(double[] parameters) {
		return parameters[0] + parameters[0] + parameters[1] + parameters[1];
	}

}
