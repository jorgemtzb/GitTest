/**
 * 
 */
package app.jorge.main;

import app.jorge.bean.Carro;

/**
 * @author Jorge
 *
 */
public class Main {
	public static void main(String[] args) {
		Carro car = new Carro("tsuru", 1992, "rojo", "tsuru rojo 1992", "df2345d".toCharArray());
		Carro car2 = new Carro("neon", 1992, "azul", "neon azul 1992", "ss343d".toCharArray());
		System.out.println("modelo: " + car.getModelo() + " año: "+ car.getYear() + " colo: "+ car.getColor() + " descripcion: " + car.getDescripcion() + " matricula: " + String.valueOf(car.getMatricula()));
		System.out.println("modelo: " + car2.getModelo() + " año: "+ car2.getYear() + " colo: "+ car2.getColor() + " descripcion: " + car2.getDescripcion() + " matricula: " + String.valueOf(car2.getMatricula()));		
	}
}
