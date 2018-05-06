/**
 * 
 */
package app.jorge.bean;

/**
 * @author Jorge
 *
 */
public class Carro {
	private String modelo;
	private int year;
	private String color;
	private String descripcion;
	private char[] matricula;
	
//	constructor vacio sin parametros
	public Carro() {
		
	}

	/**
	 * @param modelo
	 * @param year
	 * @param color
	 * @param descripcion
	 * @param matricula
	 */
	public Carro(String modelo, int year, String color, String descripcion, char[] matricula) {
		super();
		this.modelo = modelo;
		this.year = year;
		this.color = color;
		this.descripcion = descripcion;
		this.matricula = matricula;
	}

	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the matricula
	 */
	public char[] getMatricula() {
		return matricula;
	}

	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(char[] matricula) {
		this.matricula = matricula;
	}
	
	
}
