package school.cesar.q5;
import java.util.ArrayList;

import school.cesar.q1.TresLetras;


public class ComparaListas {
	
	public static void Comparar(ArrayList<Integer> array1,ArrayList<Integer> array2) {
		ArrayList<Integer> lista3 = new ArrayList<Integer>();
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				if((array1.get(i)==array2.get(j))) {

					lista3.add(array1.get(i));
				}
			}
		}
		System.out.println("Elementos em ambas as listas"+lista3);
		lista3.clear();
	}
	
	
	public static void main(String[] args) {
		ArrayList<Integer> lista1 = new ArrayList<Integer>();
		ArrayList<Integer> lista2 = new ArrayList<Integer>();
		
		 for (int i=0; i<10; i++) {
			 lista1.clear();
			 lista2.clear();
           
			 for (int j=0; j<10; j++) {
	             lista1.add((int)(Math.random() * 2000) - 1000);
	             lista2.add((int)(Math.random() * 2000) - 1000); 
		
			 }
			 
			 System.out.println("Lista 1: "+lista1);
             System.out.println("Lista 2: "+lista2);
			 Comparar(lista1,lista2);
             System.out.println("");

			 
		 }

			
		}

}
