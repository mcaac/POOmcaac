package school.cesar.q2;
import java.util.regex.*;
import java.security.InvalidParameterException;
import java.util.Scanner;

public class ConversorMorse {
	
	private static int count=0;
	
	public static boolean TesteString(String teste) {

		return Pattern.matches("[a-z0-9 ]*", teste);
	}
	public static boolean TesteMorse(String teste) {

		return Pattern.matches("[.-]", teste);
	}

	static String morseEncode(String x)  
    { 
      
        switch (x)  
        { 
            case "a": 
                return ".-"; 
            case "b": 
                return "-..."; 
            case "c": 
                return "-.-."; 
            case "d": 
                return "-.."; 
            case "e": 
                return "."; 
            case "f": 
                return "..-."; 
            case "g": 
                return "--."; 
            case "h": 
                return "...."; 
            case "i": 
                return ".."; 
            case "j": 
                return ".---"; 
            case "k": 
                return "-.-"; 
            case "l": 
                return ".-.."; 
            case "m": 
                return "--"; 
            case "n": 
                return "-."; 
            case "o": 
                return "---"; 
            case "p": 
                return ".--."; 
            case "q": 
                return "--.-"; 
            case "r": 
                return ".-."; 
            case "s": 
                return "..."; 
            case "t": 
                return "-"; 
            case "u": 
                return "..-"; 
            case "v": 
                return "...-"; 
            case "w": 
                return ".--"; 
            case "x": 
                return "-..-"; 
            case "y": 
                return "-.--"; 
            case "z": 
                return "--.."; 
            case "1":
            	return ".----";
            case "2":
            	return "..---";
            case "3":
            	return "...--";
            case "4":
            	return "....-";
            case "5":
            	return ".....";
            case "6":
            	return "-....";
            case "7":
            	return "--...";
            case "8":
            	return "---..";
            case "9":
            	return "----.";
            case "0":
            	return "-----";
            case " ":
            	return "  ";
         
        } 
        return ""; 
    } 
      
	 static void stringToMorse(String s)  
	    { 
	        // character by character print  

		 for(int i=0;i<s.length();i++) {
			  char[] str=s.toCharArray();
		      String Aux=Character.toString(str[i]);
		      System.out.print(morseEncode(Aux));
		      System.out.print(" ");
		     }
	    } 
	
	static String morseDecode(String c)  
    { 
      
        // refer to the Morse table 
        // image attached in the article 
        switch (c)  
        { 
            case ".-": 
                return "a"; 
            case "-...": 
                return "b"; 
            case "-.-.": 
                return "c"; 
            case "-..": 
                return "d"; 
            case ".": 
                return "e" ; 
            case "..-.": 
                return "f" ; 
            case "--.": 
                return "g" ; 
            case "....": 
                return "h"; 
            case "..": 
                return "i" ; 
            case ".---": 
                return "j" ; 
            case "-.-": 
                return "k"; 
            case ".-..": 
                return "l"; 
            case "--": 
                return "m" ; 
            case  "-.": 
                return "n"; 
            case "---": 
                return "o" ; 
            case ".--.": 
                return "p"  ; 
            case "--.-" : 
                return "q"; 
            case ".-.": 
                return "r"; 
            case "...": 
                return "s"; 
            case "-": 
                return "t"; 
            case "..-": 
                return "u" ; 
            case "...-": 
                return "v"; 
            case ".--": 
                return "w"; 
            case "-..-": 
                return "x"; 
            case "-.--": 
            	return "y"; 
            case "--..": 
                return "z";
            case ".----":
            	return "1" ;
            case "..---":
            	return "2";
            case "...--":
            	return "3";
            case "....-":
            	return "4";
            case ".....":
            	return "5";
            case "-....":
            	return "6";
            case "--...":
            	return "7";
            case "---..":
            	return "8";
            case "----.":
            	return "9";
            case "-----":
            	return "0";
            case "":

            	if(count%2==0) {
            		count++;
            		return "";
            	}
            	else {
            		count++;
            		return " ";
            	}
        } 
        return "";
    } 
      
   static void morseToString(String[] str)  
   { 
      
	   for(int i=0;i<str.length;i++) {
       	System.out.print(morseDecode(str[i]));
       }
    }
   
      
    // Driver code  
    public static void main (String[] args) 
    { 
    	Scanner input = new Scanner (System.in);
		
		System.out.println("Digite 1 para transformar frase em codigo:");
		System.out.println("Digite 2 para transformar codigo em frase:");
		int escolha = input.nextInt();
     
		
		
		if(escolha==1) {
			
			Scanner input1 = new Scanner (System.in);
			System.out.printf("Digite uma frase:");
			String palavra = input1.nextLine();
			boolean result1= TesteString(palavra);
			
			if (result1==false) {
				throw new InvalidParameterException("Parametro invalido");	
				}
			else {
				stringToMorse(palavra);
			}
			
			stringToMorse(palavra);
		}
		else if(escolha==2) {
			Scanner input2 = new Scanner (System.in);
			System.out.printf("Digite uma codigo:");
			String codigo = input2.nextLine();
			boolean result2= TesteMorse(codigo);
			
			if (result2==false) {
				throw new InvalidParameterException("Parametro invalido");	
				}
			else {

		        String[] str = codigo.split(" ");
		        morseToString(str);
			}
     
		}
		input.close();
    } 
	
}
