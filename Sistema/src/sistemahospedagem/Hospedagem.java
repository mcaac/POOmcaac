package sistemahospedagem;
import java.util.Calendar;

import sistemmain.Avaliavel;

public class Hospedagem implements Avaliavel, Arrumavel{

	@Override
	public void Avaliar(int nota) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Calendar Date() {
		// TODO Auto-generated method stub
		return Arrumavel.super.Date();
	}

	protected Tipos tipo;
	protected double valorDiaria;
	protected int tempoMinHospedagem;
	protected boolean cafeDaManha;
	protected boolean cancelamentoGratis;
	protected Idiomas idiomas;
	protected String CheckOut;
	protected String checkIn;
	protected String name;
	
	
	
	public Hospedagem(String name,Tipos tipo, double valorDiaria, int tempoMinHospedagem, boolean cafeDaManha,
			boolean cancelamentoGratis, Idiomas idiomas, String checkOut, String checkIn) {
		super();
		this.tipo = tipo;
		this.valorDiaria = valorDiaria;
		this.tempoMinHospedagem = tempoMinHospedagem;
		this.cafeDaManha = cafeDaManha;
		this.cancelamentoGratis = cancelamentoGratis;
		this.idiomas = idiomas;
		CheckOut = checkOut;
		this.checkIn = checkIn;
	}
	public Tipos getTipo() {
		return tipo;
	}
	
	public double getValorDiaria() {
		return valorDiaria;
	}
	
	public int getTempoMinHospedagem() {
		return tempoMinHospedagem;
	}
	
	public boolean isCafeDaManha() {
		return cafeDaManha;
	}
	
	public boolean isCancelamentoGratis() {
		return cancelamentoGratis;
	}
	
	public Idiomas getIdiomas() {
		return idiomas;
	}
	
	public String getCheckOut() {
		return CheckOut;
	}
	
	public String getCheckIn() {
		return checkIn;
	}
	
	
}
