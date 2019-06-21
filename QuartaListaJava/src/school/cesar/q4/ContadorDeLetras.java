package school.cesar.q4;
import java.util.regex.*;

import school.cesar.q1.TresLetras;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.InvalidParameterException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;


public class ContadorDeLetras {
	
	private static TreeSet<String> list = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);

	
	public static boolean Teste(String teste) {
		
		return Pattern.matches("[a-zA-Z0-9 ]*", teste);
	}
	
	private static int countOccurrences(String str, char ch) {

		Matcher matcher = Pattern.compile(String.valueOf(ch))
								.matcher(str);

		int counter = 0;
		while (matcher.find()) {
			counter++;
		}

		return counter;
	}
	
	
	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Digite uma frase:");
		String palavra = input.nextLine();
	
		boolean result=Teste(palavra);
		
		char[] array = palavra.toCharArray();
		System.out.println(palavra);

		
		if (result==false) {
			throw new InvalidParameterException("Parametro invalido");	
			}
		else {
			for(int i=0;i<array.length;i++) {
				String aux= Character.toString(array[i]);
				list.add(aux);
				}
			
			Iterator<String> iterator = list.iterator();
			while (iterator.hasNext()) {
				String s= iterator.next();
				//System.out.println(s);
				
				String chlower=s.toLowerCase();
				char ch=chlower.charAt(0);

				System.out.println(s + "-> "+countOccurrences(palavra.toLowerCase(),ch));
		
			}
			}

			input.close();
		}
}
