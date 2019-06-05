package sistemmain;
import java.util.Scanner;

import sistemahospedagem.ComparatorHospedagem;
import sistemahospedagem.Estrelas;
import sistemahospedagem.Hospedagem;
import sistemahospedagem.Hoteis;
import sistemahospedagem.Albergue;
import sistemahospedagem.Casa_Apartamento;
import sistemahospedagem.Hotel_Pousada;
import sistemahospedagem.Idiomas;
import sistemahospedagem.Tipos;

import java.util.ArrayList;
import java.util.Collections;

public class SistemaHospedagem {
	
	private static final boolean True = true;

	private static void ordenacaoPousada(ArrayList<Hotel_Pousada> array , int ordem) {
	
		if(ordem==1) {
			Collections.sort(array, new ComparatorHospedagem());
	   		int counter=0;

	   		for(int i = 0; i < array.size(); i++) {
	   		 
			      System.out.println(counter+"- "+ array.get(i).toString());
			      counter+=1;
			    }
	   		selecionarPousada(array);
		}
	   	 else {
	   		int counter=0;

	   		for(int i = 0; i < array.size(); i++) { 
			      System.out.println(counter+"- "+ array.get(i).toString());
			      counter+=1;
			    }
	   		selecionarPousada(array);
	   		}
		
	}
	
	private static void ordenacaoAlbergue(ArrayList<Albergue> array , int ordem) {
		
		if(ordem==1) {
			Collections.sort(array, new ComparatorHospedagem());
			int counter=0;

	   		for(int i = 0; i < array.size(); i++) { 
			      System.out.println(counter+"- "+ array.get(i).toString());
			      counter+=1;
			    }
	   		selecionarAlbergue(array);
		}
	   	 else {
	   		int counter=0;

	   		for(int i = 0; i < array.size(); i++) { 
			      System.out.println(counter+"- "+ array.get(i).toString());
			      counter+=1;
			    }
	   		selecionarAlbergue(array);
	   		}
		
	}
	
	private static void ordenacaoCasaApartamento(ArrayList<Casa_Apartamento> array , int ordem) {
		
		if(ordem==1) {
			Collections.sort(array, new ComparatorHospedagem());
	   		int counter=0;

	   		for(int i = 0; i < array.size(); i++) { 
			      System.out.println(counter+"- "+ array.get(i).toString());
			      counter+=1;
			    }
	   		selecionarCasaApartamento(array);
		}
	   	 else {
	   		int counter=0;

	   		for(int i = 0; i < array.size(); i++) { 
			      System.out.println(counter+"- "+ array.get(i).toString());
			      counter+=1;
			    }
	   		selecionarCasaApartamento(array);
	   		}
		
	}
	
	private static void ordenacaoHoteis(ArrayList<Hoteis> array , int ordem) {
		
		if(ordem==1) {
			Collections.sort(array, new ComparatorHospedagem());
			int counter=0;

	   		for(int i = 0; i < array.size(); i++) { 
			      System.out.println(counter+"- "+ array.get(i).toString());
			      counter+=1;
			    }
	   		selecionarHoteis(array);
		}
	   	 else {
	   		int counter=0;

	   		for(int i = 0; i < array.size(); i++) { 
			      System.out.println(counter+"- "+ array.get(i).toString());
			      counter+=1;
			    }
	   		selecionarHoteis(array);
	   		}
		
	}
	
	public static void selecionarPousada(ArrayList<Hotel_Pousada> array) {
		
		System.out.println("Selecione sua Hospedagem");
		try{
		Scanner input= new Scanner(System.in);
		int seletor = input.nextInt();
		
		System.out.println(array.get(seletor));
		
		System.out.println("Para confirmar o aluguel digite 1");
		System.out.println("Para selecionar outra hospedagem desse tipo digite 2");
		System.out.println("Para voltar ao menu principal do sistema digite 3");
		System.out.println("Para encerrar o programa digite 4");

		int confirmar = input.nextInt();

		
		if(confirmar==3) {
			SelecaoSistema selecao = new SelecaoSistema();
			selecao.SelecionarSistema();
		}
		else if(confirmar==1) {
			System.out.println("Aluguel Confirmado da Pousada: "+array.get(seletor));
		}
		else if(confirmar==2) {
			for (int i = 0; i < array.size(); i++) {
				System.out.println(i + "- "+array.get(i));
			}
			selecionarPousada(array);
		}
		else {
			System.out.println("Obrigada por usar esse sistema!!!");

		}
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("Erro:Nao temos nenhuma hospedagem nesta categoria");
		}
			
		}
	
	public static void selecionarAlbergue(ArrayList<Albergue> array) {
		
		System.out.println("Selecione sua Hospedagem");

		try{
		Scanner input= new Scanner(System.in);
		int seletor = input.nextInt();
		
		System.out.println(array.get(seletor));
		
		System.out.println("Para confirmar o aluguel digite 1");
		System.out.println("Para selecionar outra hospedagem desse tipo digite 2");
		System.out.println("Para voltar ao menu principal do sistema digite 3");
		System.out.println("Para encerrar o programa digite 4");

		int confirmar = input.nextInt();

		
		if(confirmar==3) {
			SelecaoSistema selecao = new SelecaoSistema();
			selecao.SelecionarSistema();
		}
		else if(confirmar==1) {
			System.out.println("Aluguel Confirmado do Albergue: "+array.get(seletor));
		}
		else if(confirmar==2) {
			for (int i = 0; i < array.size(); i++) {
				System.out.println(i + "- "+array.get(i));
			}
			selecionarAlbergue(array);
		}
		else {
			System.out.println("Obrigada por usar esse sistema!!!");

		}
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("Erro:Nao temos nenhuma hospedagem nesta categoria");
		}
			
		}
	
	public static void selecionarCasaApartamento(ArrayList<Casa_Apartamento> array) {
		
		System.out.println("Selecione sua Hospedagem");

		try{
		Scanner input= new Scanner(System.in);
		int seletor = input.nextInt();
		
		System.out.println(array.get(seletor));
		
		System.out.println("Para confirmar o aluguel digite 1");
		System.out.println("Para selecionar outra hospedagem desse tipo digite 2");
		System.out.println("Para voltar ao menu principal do sistema digite 3");
		System.out.println("Para encerrar o programa digite 4");

		int confirmar = input.nextInt();

		
		if(confirmar==3) {
			SelecaoSistema selecao = new SelecaoSistema();
			selecao.SelecionarSistema();
		}
		else if(confirmar==1) {
			System.out.println("Aluguel Confirmado do Casa ou Apartamento: "+array.get(seletor));
		}
		else if(confirmar==2) {
			for (int i = 0; i < array.size(); i++) {
				System.out.println(i + "- "+array.get(i));
			}
			selecionarCasaApartamento(array);
		}
		else {
			System.out.println("Obrigada por usar esse sistema!!!");

		}
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("Erro:Nao temos nenhuma hospedagem nesta categoria");
		}
			
		}
	
public static void selecionarHoteis(ArrayList<Hoteis> array) {
	
	System.out.println("Selecione sua Hospedagem");

	try{
	Scanner input= new Scanner(System.in);
	int seletor = input.nextInt();
	
	System.out.println(array.get(seletor));
	
	System.out.println("Para confirmar o aluguel digite 1");
	System.out.println("Para selecionar outra hospedagem desse tipo digite 2");
	System.out.println("Para voltar ao menu principal do sistema digite 3");
	System.out.println("Para encerrar o programa digite 4");

	int confirmar = input.nextInt();

	
	if(confirmar==3) {
		SelecaoSistema selecao = new SelecaoSistema();
		selecao.SelecionarSistema();
	}
	else if(confirmar==1) {
		System.out.println("Aluguel Confirmado do Hotel: "+array.get(seletor));
	}
	else if(confirmar==2) {
		for (int i = 0; i < array.size(); i++) {
			System.out.println(i + "- "+array.get(i));
		}
		selecionarHoteis(array);
	}
	else {
		System.out.println("Obrigada por usar esse sistema!!!");

	}
	}
	catch(IndexOutOfBoundsException e) {
		System.out.println("Erro:Nao temos nenhuma hospedagem nesta categoria");
	}
		
	}
	

	public void SistemaHospedagem() {
		ArrayList<Hoteis> hotel = new ArrayList<Hoteis>();
		ArrayList<Albergue> albergue = new ArrayList<Albergue>();
		ArrayList<Casa_Apartamento> casa_apartamento = new ArrayList<Casa_Apartamento>();
		ArrayList<Hotel_Pousada> pousadas = new ArrayList<Hotel_Pousada>();
		
		Hoteis h1= new Hoteis("Courtyard Marriott",Tipos.Hoteis,175.00,2,true, true,Idiomas.Ingles,"30/09/2019 12:00PM","20/08/2019 15:00PM",false,Estrelas.Quatro);
		Hoteis h2= new Hoteis("Hyatt Regency Dallas",Tipos.Hoteis,140.00,3,true,false,Idiomas.Ingles,"26/07/2019 12:00PM","15/07/2019 15:00PM",true, Estrelas.Quatro);
		Hoteis h3= new Hoteis("Fairmont Dallas",Tipos.Hoteis,250.00,3,true, false,Idiomas.Ingles,"19/11/2019 12:00 PM","09/11/2019 15:00PM", true,Estrelas.Cinco);
		hotel.add(h1);
		hotel.add(h2);
		hotel.add(h3);
		
		Casa_Apartamento ca1= new Casa_Apartamento("Courtyard Marriott",Tipos.Aluguel_Casa_Apartamento,75.00,2,true, true,Idiomas.Portugues,"30/09/2019 12:00PM","20/08/2019 15:00PM",1,false);
		Casa_Apartamento ca2= new Casa_Apartamento("Hyatt Regency Dallas",Tipos.Aluguel_Casa_Apartamento,100.00,3,true,false,Idiomas.Portugues,"26/07/2019 12:00PM","15/07/2019 15:00PM",2,true);
		Casa_Apartamento ca3= new Casa_Apartamento("Fairmont Dallas",Tipos.Aluguel_Casa_Apartamento,150.00,3,true, false,Idiomas.Espanhol,"19/11/2019 12:00 PM","09/11/2019 15:00PM",3,true);
		casa_apartamento.add(ca1);
		casa_apartamento.add(ca2);
		casa_apartamento.add(ca3);
		
		Albergue a1= new Albergue("Courtyard Marriott",Tipos.Albergues,35.00,2,true, true,Idiomas.Espanhol,"30/09/2019 12:00PM","20/08/2019 15:00PM",5);
		Albergue a2= new Albergue("Hyatt Regency Dallas",Tipos.Albergues,50.00,3,true,false,Idiomas.Ingles,"26/07/2019 12:00PM","15/07/2019 15:00PM",10);
		Albergue a3= new Albergue("Fairmont Dallas",Tipos.Albergues,70.00,3,true, false,Idiomas.Portugues,"19/11/2019 12:00 PM","09/11/2019 15:00PM",15);
		albergue.add(a1);
		albergue.add(a2);
		albergue.add(a3);
		
		System.out.println("Digite 1 para Hoteis");
		System.out.println("Digite 2 para Casa/Apartamento");
		System.out.println("Digite 3 para  Albergue");
		System.out.println("Digite 4 para Pousadas");

		Scanner input= new Scanner(System.in);

		int escolhatipo = input.nextInt();
		
		switch(escolhatipo) {
			
		     case 1:
		 		Scanner inputs = new Scanner(System.in);

		 			System.out.println("Digite 1 para ordenar por valor da diaria");
		 			System.out.println("Digite ountro valor se nao quiser ordenar:\n");
		 			int ordem = inputs.nextInt();
		    	 	ordenacaoHoteis(hotel, ordem);
		    	break;
		     case 2:
			 		Scanner input1 = new Scanner(System.in);

		    	 	System.out.println("Digite 1 para ordenar por valor da diaria");
		 			System.out.println("Digite ountro valor se nao quiser ordenar:\n");			 		
		 			int ordem1= input1.nextInt();
			    	ordenacaoCasaApartamento(casa_apartamento, ordem1);
		    	 break;
		     case 3:
			 		Scanner input2 = new Scanner(System.in);

		    	 	System.out.println("Digite 1 para ordenar por valor da diaria");
		 			System.out.println("Digite ountro valor se nao quiser ordenar:\n");			 		
		 			int ordem2= input2.nextInt();
			    	ordenacaoAlbergue(albergue, ordem2);
		    	 break;
		     case 4:
			 		Scanner input3 = new Scanner(System.in);

		    	 	System.out.println("Digite 1 para ordenar por valor da diaria");
		 			System.out.println("Digite ountro valor se nao quiser ordenar:\n");			 		
		 			int ordem3= input3.nextInt();
			    	ordenacaoPousada(pousadas, ordem3);
		    	 break;
		}		
	}
	
}
