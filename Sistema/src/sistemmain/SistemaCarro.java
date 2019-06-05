package sistemmain;

import sistemacarro.Carro;
import sistemacarro.Combustivel;
import sistemacarro.ComparatorCarro;
import sistemacarro.ComparatorCarroAno;
import sistemacarro.Marca;
import sistemacarro.Tipo;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class SistemaCarro {
	
	private static final boolean True = true;

	private static void ordenacao(ArrayList<Carro> array , int ordem) {
	
		if(ordem==1) {
			Collections.sort(array, new ComparatorCarroAno());
	   		int counter=0;

	   		for(int i = 0; i < array.size(); i++) { 
			      System.out.println(counter+"- "+ array.get(i).toString());
			      counter+=1;
			    }
	   		selecionar(array);
		}
	   	 else if(ordem ==2) {
	   		Collections.sort(array, new ComparatorCarro());
	   		int counter=0;
	   		for(int i = 0; i < array.size(); i++){
	   			System.out.println(counter+"- "+ array.get(i).toString());
			      counter+=1;
			    }
	   		selecionar(array);
	   		}
	   	 else {
	   		for (int i = 0; i < array.size(); i++) {
				System.out.println(i + "- "+array.get(i));
			}
	   		selecionar(array);
	   		}
		
	}
	
public static void selecionar(ArrayList<Carro> array) {
	System.out.println("Selecione seu Carro");

	try{
	Scanner input= new Scanner(System.in);
	int seletor = input.nextInt();
	
	System.out.println(array.get(seletor));
	
	System.out.println("Para confirmar o aluguel digite 1");
	System.out.println("Para selecionar outro carro desse tipo digite 2");
	System.out.println("Para voltar ao menu principal do sistema digite 3");
	System.out.println("Para encerrar o programa digite 4");

	int confirmar = input.nextInt();

	
	if(confirmar==3) {
		SelecaoSistema selecao = new SelecaoSistema();
		selecao.SelecionarSistema();
	}
	else if(confirmar==1) {
		System.out.println("Aluguel Confirmado do carro: "+array.get(seletor));
	}
	else if(confirmar==2) {
		for (int i = 0; i < array.size(); i++) {
			System.out.println(i + "- "+array.get(i));
		}
		selecionar(array);
	}
	else {
		System.out.println("Obrigada por usar esse sistema!!!");

	}
	}
	catch(IndexOutOfBoundsException e) {
		System.out.println("Erro:Nao temos nenhum Caarro nesta categoria");
	}
		
	}
	

	public void SistemaCarro() {
		ArrayList<Carro> basico = new ArrayList<Carro>();
		ArrayList<Carro> executivo = new ArrayList<Carro>();
		ArrayList<Carro> comum = new ArrayList<Carro>();
		ArrayList<Carro> Luxo = new ArrayList<Carro>();
		
		Carro fox= new Carro(Marca.Fox, 5, 35.00,"TVD-4007", 2014, 1000.0, True, True, Combustivel.eletrico, Tipo.basico);
		Carro celta= new Carro(Marca.Celta,5, 40.00,"MGD-4567", 2016, 10000.0, True, True, Combustivel.diesel, Tipo.basico);
		Carro march= new Carro(Marca.March,5, 50.00,"ABC-0123", 2015, 5000.0, True, True, Combustivel.gasolina, Tipo.basico);
		basico.add(fox);
		basico.add(celta);
		basico.add(march);
		
		Carro prius= new Carro(Marca.Prius, 5, 135.00,"GJV-5397", 2018, 1000.0, True, True, Combustivel.flex, Tipo.executivo);
		Carro Range= new Carro(Marca.RangeRover,5, 140.00,"KHD-9735", 2017, 3000.0, True, True, Combustivel.diesel, Tipo.executivo);
		Carro SUV= new Carro(Marca.SUV,5, 50.00,"QTP-8913", 2016, 5000.0, True, True, Combustivel.flex, Tipo.executivo);
		executivo.add(prius);
		executivo.add(Range);
		executivo.add(SUV);
		
		Carro ferrari= new Carro(Marca.Ferrari, 2, 235.00,"FAI-0611", 2019, 2300.0, True, True, Combustivel.gasolina, Tipo.luxo);
		Carro mercedes = new Carro(Marca.Mercedes,4, 240.00,"TIM-2006", 2018, 5500.0, True, True, Combustivel.gasolina, Tipo.luxo);
		Carro audi= new Carro(Marca.Audi,4, 250.00,"FET-0696", 2017, 10000.0, True, True, Combustivel.eletrico, Tipo.luxo);
		Luxo.add(ferrari);
		Luxo.add(mercedes);
		Luxo.add(audi);
		
		
		System.out.println("Digite 1 para carros basicos");
		System.out.println("Digite 2 para carros comuns");
		System.out.println("Digite 3 para carros executivos");
		System.out.println("Digite 4 para carros de Luxo");

		Scanner input= new Scanner(System.in);

		int escolhatipo = input.nextInt();
		
		switch(escolhatipo) {
			
		     case 1:
		 		Scanner inputs = new Scanner(System.in);

		 			System.out.println("Digite 1 para ordenar por Ano");
		 		    System.out.println("Digite 2 para ordenar por Valor");
		 			System.out.println("Digite ountro valor se nao quiser ordenar:\n");
		 			int ordem = inputs.nextInt();
		    	 	ordenacao(basico, ordem);
		    	break;
		     case 2:
			 		Scanner input1 = new Scanner(System.in);

		    	 	System.out.println("Digite 1 para ordenar por Ano");
		 		    System.out.println("Digite 2 para ordenar por Valor");
		 			System.out.println("Digite ountro valor se nao quiser ordenar:\n");			 		
		 			int ordem1= input1.nextInt();
			    	ordenacao(comum, ordem1);
		    	 break;
		     case 3:
			 		Scanner input2 = new Scanner(System.in);

		    	 	System.out.println("Digite 1 para ordenar por Ano");
		 		    System.out.println("Digite 2 para ordenar por Valor");
		 			System.out.println("Digite ountro valor se nao quiser ordenar:\n");			 		
		 			int ordem2= input2.nextInt();
			    	ordenacao(executivo, ordem2);
		    	 break;
		     case 4:
			 		Scanner input3 = new Scanner(System.in);

		    	 	System.out.println("Digite 1 para ordenar por Ano");
		 		    System.out.println("Digite 2 para ordenar por Valor");
		 			System.out.println("Digite ountro valor se nao quiser ordenar:\n");			 		
		 			int ordem3= input3.nextInt();
			    	ordenacao(Luxo, ordem3);
		    	 break;
		}		
	}
	
}
