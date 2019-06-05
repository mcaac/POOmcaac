package sistemahospedagem;

public class Hotel_Pousada extends Hospedagem {
	
	private boolean translados;
	
	public Hotel_Pousada(String name,Tipos tipo, double valorDiaria, int tempoMinHospedagem, boolean cafeDaManha,
			boolean cancelamentoGratis, Idiomas idiomas, String checkOut, String checkIn, boolean translados) {
		super(name, tipo,  valorDiaria,  tempoMinHospedagem,  cafeDaManha,
				 cancelamentoGratis,  idiomas,  checkOut,  checkIn);
		this.translados = translados;
	}

	public boolean getTranslados() {
		return this.translados;
	}

	@Override
	public String toString() {
		return "Hotel_Pousada [translados=" + translados + ", tipo=" + tipo + ", valorDiaria=" + valorDiaria
				+ ", tempoMinHospedagem=" + tempoMinHospedagem + ", cafeDaManha=" + cafeDaManha
				+ ", cancelamentoGratis=" + cancelamentoGratis + ", idiomas=" + idiomas + ", CheckOut=" + CheckOut
				+ ", checkIn=" + checkIn + ", name=" + name + "]";
	}

	

}
