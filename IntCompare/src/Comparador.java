import java.util.Scanner;

public class Comparador {
	private int primeiro;
	private int segundo;
	private int terceiro;
	
	public Comparador() {
		
	}
	
	public int getPrimeiro() {
		return primeiro;
	}

	public void setPrimeiro(int primeiro) {
		this.primeiro = primeiro;
	}
	
	public int getSegundo() {
		return segundo;
	}

	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}
	
	public int getTerceiro() {
		return terceiro;
	}

	public void setTerceiro(int terceiro) {
		this.terceiro = terceiro;
	}
	
	public int getMaior() {
		int maior = 0;
		
		if(primeiro> segundo && primeiro > terceiro ) {
			maior=primeiro;
		}
		else if(segundo>primeiro && segundo > terceiro ) {
			maior=segundo;
			}
		else if(terceiro > primeiro && terceiro > segundo ) {
			maior=terceiro;
		}
		return maior;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner input = new Scanner (System.in);
				
				
				System.out.printf("Digite o primeiro numero:");
				int primeiro = input.nextInt();
			
				
				System.out.println("Digite o segundo numero:");
				int segundo = input.nextInt();
				
				
				System.out.println("Digite o terceiro numero:");
				int terceiro = input.nextInt();
				
				input.close();
				
				Comparador comparador;
				comparador = new Comparador();
				comparador.setPrimeiro(primeiro);
				comparador.setSegundo(segundo);
				comparador.setTerceiro(terceiro);
				System.out.printf("%d%n",comparador.getMaior());
	}

}
