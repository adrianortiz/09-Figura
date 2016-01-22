package modelo;

/**
 * 
 * @author Adrian
 *
 */
public interface Figuras {
	
	/**
	 * Calcula el área de una figura
	 * 
	 * @param parameters
	 * @return double retorna el área de una figura
	 */
	public double area(double parameters[]);
	
	/**
	 * Calculo el perímetro de una figura
	 * 
	 * @param parameters
	 * @return double retornar el perímetro de una figura
	 */
	public double perimetro(double parameters[]);
	
}
