import java.util.Scanner;

public class ComparadorDeString {

	private String str1;
	private String str2;
	
	public ComparadorDeString() {
		
	}
	
	public String getStr1() {
		return str1;
	}

	public void setStr1(String str1) {
		this.str1 = str1;
	}

	public String getStr2() {
		return str2;
	}

	public void setStr2(String str2) {
		this.str2 = str2;
	}
	
	public String reverter(String str2) {
		String revertida = new StringBuffer(str2).reverse().toString();
		return revertida;
	}
	
	public void comparar() {
		String revertida = reverter(str2);
		
		if(str1.equals(revertida)) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComparadorDeString comparador = new ComparadorDeString();
		Scanner input = new Scanner (System.in);
		
		System.out.printf("Digite a primeira palavra:");
		String str1=input.next();
		
		System.out.println("Digite a segunda palavra:");
		String str2=input.next();
		
		input.close();
		
		comparador.setStr1(str1);
		comparador.setStr2(str2);
		comparador.comparar();
		

	}
	
	

}
