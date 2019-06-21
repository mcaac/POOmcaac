package school.cesar.q1;

import java.security.InvalidParameterException;

import java.util.Scanner;

import java.util.TreeSet;
import java.util.regex.*;



public class TresLetras {

	
	private static TreeSet<String> list = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
	
	public static boolean Teste(String teste) {

		return Pattern.matches("[a-zA-Z]{5}", teste);
	}
	
			private static void permutar(String str, int l, int r) 
			{ 
				 if (l == r) {
					 list.add(str);
					 }
			        else { 
			            for (int i = l; i <= r; i++) { 
			                str = swap(str, l, i); 
			                permutar(str, l + 1, r); 
			                str = swap(str, l, i); 
			            } 
			        } 
			} 

			public static String swap(String a, int i, int j) 
			{ 
				char temp; 
				char[] charArray = a.toCharArray(); 
				temp = charArray[i]; 
				charArray[i] = charArray[j]; 
				charArray[j] = temp; 
				return String.valueOf(charArray); 
			} 
	

	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.printf("Digite uma palavra com 5 letras:");
		String palavra = input.next();
		
		
		boolean result= Teste(palavra);
		
		
		if (result==false) {
			throw new InvalidParameterException("Parametro invalido");	
			}
		else {
			String aux=palavra.substring(0,3);
			permutar(aux, 0, 2);

			
			System.out.println(list);
		}
		input.close();
	}
	
}
