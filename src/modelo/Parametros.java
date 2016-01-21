package modelo;
/**
 * 
 * @author Adrian
 *
 */
public class Parametros {
	
	/**
	 * Retorna el área de un cuadrado
	 * 
	 * @param l l de tipo Int
	 * @return retorna l sumado cuatro veces como tipo Int
	 */
	public int areaCuadrado(int l) {
		return l + l + l + l;
	}
	
	/**
	 * Retorna el área de un rectangulo
	 * 
	 * @param l1 tipo Int
	 * @param l2 tipo Int
	 * @return int
	 */
	public int areaRectangulo(int l1, int l2) {
		return l1 + l1 + l2 + l2;
	}
	
	/**
	 * Retorna el área de un triángulo
	 * 
	 * @param l1 tipo Int
	 * @param l2 tipo Int
	 * @param l3 tipo Int
	 * @return int
	 */
	public int areaTriangulo(int l1, int l2, int l3) {
		return l1 + l2 + l3;
	}
	
	/**
	 * Retorna un ciruculo
	 * 
	 * @param diametro en Int
	 * @return El diametro por PI
	 */
	public double areaCirculo(int diametro) {
		return diametro * Math.PI;
	}
}
