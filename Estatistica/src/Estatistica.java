import java.util.Scanner;
import java.lang.Math;

public class Estatistica {
	
	private int maiorValor;
	private int somatorio = 0;
	private float media;
	private float variancia;
	private int valor;
	
	public Estatistica() {
		
	}
	
	public void Estatistica(int maiorValor) {
		
		if(maiorValor <= 0) {
			System.out.println("ERRO voce digitou um valor incorreto");
		}
		else {
			setMaiorValor(maiorValor);
		}
	}
	
	public int getMaiorValor() {
		return maiorValor;
	}

	public void setMaiorValor(int maiorValor) {
		this.maiorValor = maiorValor;
	}

	
	public int somatorio() {
		int aux= maiorValor;
		int aux2=maiorValor;
		
		for(int count=0;count<aux;count++) {
		    somatorio += aux2;
		    aux2--;
		    
		}
		
		System.out.println(somatorio);
		return somatorio;
		
	}
	
		public float media() {
			int count=0;
			
			do {
				media= (float)somatorio/maiorValor;
				count=1;
				}
			while(count==0);
			System.out.println(media);
			return media;
		}
		
		public float variancia() {
			int count = 0;
			float aux = 0;
			float aux2 = maiorValor;
			float total=0;
			
			while(count<(aux2+1)) {
				
				aux=(float)Math.pow((maiorValor-media),2);	
				total +=aux;
				maiorValor--;
				count++;
			
			}
			
			variancia= (float)total/aux2;
			System.out.println(variancia); 
			return variancia;
			
		}
				

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estatistica novaEstatistica = new Estatistica();
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Digite o primeiro numero:");
		int valor = input.nextInt();
		input.close();
		
		novaEstatistica.Estatistica(valor);
		novaEstatistica.somatorio();
		novaEstatistica.media();
		novaEstatistica.variancia();
		
		
	

}
}
