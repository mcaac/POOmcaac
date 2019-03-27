import java.util.Scanner;

public class calculadora {

private static float soma;
private static float subtracao;
private static float divisao;
private static float multiplicacao;

	public static float soma(float primeiro,float segundo) {
		soma=primeiro+segundo;
		return soma;
	}
	
	public static float subtracao(float primeiro,float segundo) {
		subtracao=primeiro-segundo;
		return subtracao;
	}
	
	public static float divisao(float primeiro,float segundo) {
		divisao=primeiro/segundo;
		return divisao;
	}
	
	public static float multiplicacao(float primeiro,float segundo) {
		multiplicacao=primeiro*segundo;
		return multiplicacao;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String operacao;
		Scanner input = new Scanner (System.in);
		
		System.out.printf("Digite o primeiro numero:");
		float primeiro = input.nextFloat();
	
		
		System.out.println("Digite o segundo numero:");
		float segundo = input.nextFloat();
		
		System.out.println("Escolha a operacao +, -, * ou /:");
		operacao = input.next();
		
		input.close();

		if(operacao.equals("+")) {
		 System.out.printf("%f%n",soma(primeiro,segundo));
		}
		else if(operacao.equals("-")) {
		 System.out.printf("%f%n",subtracao(primeiro,segundo));
		}
		else if(operacao.equals("*")) {
		 System.out.printf("%f%n",multiplicacao(primeiro,segundo));
		}
		else if(operacao.equals("/")) {
		 System.out.printf("%f%n",divisao(primeiro,segundo));
		}
	}

}
