package modelo;

public class Triangulo implements Figuras {

	@Override
	public double area(double[] parameters) {
		// TODO Auto-generated method stub
		return (parameters[0] * parameters[1]) / 2;
	}

	@Override
	public double perimetro(double[] parameters) {
		return parameters[0] + parameters[1] + parameters[2];
	}

}
