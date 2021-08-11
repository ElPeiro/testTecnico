package com.solucionfactible.dev;


import java.util.HashSet;
import java.util.Set;

/**
 * findMissingLetter takes an array of consecutive (increasing) letters as input and that returns the missing letter 
 * in the array. You will always get an valid array. And it will be always exactly one letter be missing. 
 * The length of the array will always be at least 2.The array will always contain letters in only one case.
 * (Use the English alphabet with 26 letters)
 * 
 * @author developer
 */
public class FindMissingLetter {
	private final int ASCII_A = 97;//rango de A-Z en ASCCI
	private final int ASCII_Z = 122;//donde termina el rango de A-Z en ASCII
	public String findMissingLetter(String palabra){
		if (palabra.length()>2 && palabra.matches("^.*[^a-zA-Z0-9 ].*$")) {
			Set<Integer> codigosASCCI = new HashSet<Integer>();
			for (char character : palabra.toLowerCase().toCharArray()) {
				//Convierte una cadena en un array de caracteres y minisculas las letras de la cadena.
				if (character >= ASCII_A && character <= ASCII_Z) {
					codigosASCCI.add((int) character);
					if (codigosASCCI.size() == 26) {
						break; // en caso de que cumpla la palabra con todas la letras del abecedario, de detiene el for
					}
				}
			}
			StringBuilder letrasFaltantes = new StringBuilder();
			//esta clase me ayuda para poder agregar a una cadena las letras del ascci que fueron detectadas en el
			//siclo aneterior por numero ascci
			for (int i = ASCII_A; i <= ASCII_Z; i++) {
				if (!codigosASCCI.contains(i)) {
					//si el numero que contiene codigosASCCI es diferente dentro del rango de A - Z ASCCI se guardan en la
					//cadena letrasFaltantes
					letrasFaltantes.append((char) i);
					//aqui agregamos la letra encontrada por el codigo ascci
				}
			}
			return letrasFaltantes.toString();
		}
		return "la cadena es menor a 2 caracteres o no es alphanumerica";
	}
	public static void main(String[] args) {
		String case1 = "El veloz murciélago hindú comía feliz cardillo y kiwi";
		//esta oracion la saque de Google para poder probar todas las letras del abecedario
		String case2 = "abcdfghijaovklemnpqrstuxywz";
		//aqui introduje el abecedario para probar que no falto ninguna letra de encontrar
		String case3 = "a";
		FindMissingLetter missingLetters = new FindMissingLetter();
		System.out.println("Missing letters for[" + case1 + "]: " +
				missingLetters.findMissingLetter(case1));
		System.out.println("Missing letters for[" + case2 + "]: " +
				missingLetters.findMissingLetter(case2));
		System.out.println("Missing letters for[" + case3 + "]: " +
				missingLetters.findMissingLetter(case3));
	}
}