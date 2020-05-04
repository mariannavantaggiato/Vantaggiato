/**
*
* visto dal prof Gervasi
*/


/**
 * <b> Class Trapezio </b>
 * <h4>Questa classe permetterŕ di calcolare l'area del trapezio</h4>
 * <h2>Variabili</h2>
 * <h5>bMag= base maggiore del trapezio</h5><br>
 * <h5>bMin=base minore del trapezio</h5><br>
 * <h5>h= altezza del trapezio</h5><br>
 * 
 * <h1>@author Marianna Vantaggiato</h1>
 */
public class Trapezio {
	private float bMag;
	private float bMin;
	private float h;

	/**
	 * Constructor
	 * 
	 * @param bMag
	 * @param bMin
	 * @param h
	 */
	public Trapezio(float bMag, float bMin, float h) {
		this.bMag = bMag;
		this.bMin = bMin;
		this.h = h;
	}

	/**
	 * Method getBMag Restituisce la base maggiore
	 * 
	 * @return bMag
	 */
	public float getBMag() {
		return bMag;
	}

	/**
	 * Method setBMag Setta il valore della base maggiore
	 * 
	 * @param b
	 */
	public void setB(float bMag) {
		this.bMag = bMag;
	}

	/**
	 * Method getBMin restituisce il valore della base minore
	 * 
	 * @return bMin
	 */
	public float getBMin() {
		return bMin;
	}

	/**
	 * Method setBMin setta il valore della base minore
	 * 
	 * @param bMin
	 */
	public void setBMin(float bMin) {
		this.bMin = bMin;
	}

	/**
	 * Method getH Restituisce il valore dell'altezza
	 * 
	 * @return h
	 */
	public float getH() {
		return h;
	}

	/**
	 * Method setH setta il valore dell'altezza
	 * 
	 * @param h
	 */
	public void setH(float h) {
		this.h = h;
	}

	/**
	 * Method area Questo metodo calcola l'area del trapezio
	 * 
	 * @return area
	 */
	public float area() {
		float area = 0;
		area = ((bMag + bMin) * h) / 2;
		return area;
	}

	/**
	 * Main testo i metodi del programma
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Trapezio t = new Trapezio(22.5f, 5f, 2f);
		System.out.println(t.area());
	}

}
