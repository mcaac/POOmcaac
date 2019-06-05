package sistemmain;
import sistemacarro.Carro;
import sistemahospedagem.Hospedagem;
import java.util.ArrayList;
import java.util.Scanner;


public class SelecaoSistema {
	
	public void SelecaoSistema() {
		
	}
	
	public void SelecionarSistema() {
		Scanner input = new Scanner(System.in);
		SistemaCarro tipo = new SistemaCarro();
		SistemaHospedagem tipo2 = new SistemaHospedagem();
		System.out.println("Digite 1 se quiser alugar um carro");
		System.out.println("Digite 2 se quiser reservar uma hospedagem:");
		int selecionarsistema = input.nextInt();

		
		if(selecionarsistema==1) {
			tipo.SistemaCarro();
		}
		else if(selecionarsistema==2) {
			tipo2.SistemaHospedagem();
		}
		
		input.close();

	}
	
	
	
	public static void main(String[] args) {
		SelecaoSistema sistem = new SelecaoSistema(); 		
		System.out.println("Qual servico voce gostaria no momento");
		sistem.SelecionarSistema();

	}

}
