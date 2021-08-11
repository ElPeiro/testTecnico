package com.solucionfactible.dev;
/**
 * persistence takes in a positive parameter num and returns its multiplicative persistence, which is the number 
 * of times you must multiply the digits in num until you reach a single digit.
 * 
 * @author developer
 */
public class Persistence  {
	public static void main(String[] args) {
		persistence(294);
	}
	public static long persistence(long num) {
		int repeticiones = 0;
		System.out.println("Nº inicial es: " + num);
		while(num > 9){
			int producto = 1;
			while(num != 0){
				long unidades = num % 10;
				producto *= unidades;
				num = (num - unidades)/10;
			}
			repeticiones++;
			System.out.println("Producto " + repeticiones + "º es:" + producto);
			num = producto;
		}
		return num;
	}
}
