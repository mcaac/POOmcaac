package sistemahospedagem;


public class Casa_Apartamento extends Hospedagem {
	
	private int numeroQuartos;
	private boolean cozinha;
	
	public Casa_Apartamento(String name,Tipos tipo, double valorDiaria, int tempoMinHospedagem, boolean cafeDaManha,
			boolean cancelamentoGratis, Idiomas idiomas, String checkOut, String checkIn, int numeroQuartos, boolean cozinha) {
		super(name, tipo,  valorDiaria,  tempoMinHospedagem,  cafeDaManha,
				 cancelamentoGratis,  idiomas,  checkOut,  checkIn);
		this.numeroQuartos = numeroQuartos;
		this.cozinha=cozinha;
	}

	public int getNumeroQuartos() {
		return this.numeroQuartos;
	}
	
	public boolean getCozinha() {
		return this.cozinha;
	}

	@Override
	public String toString() {
		return "Casa_Apartamento [numeroQuartos=" + numeroQuartos + ", cozinha=" + cozinha + ", tipo=" + tipo
				+ ", valorDiaria=" + valorDiaria + ", tempoMinHospedagem=" + tempoMinHospedagem + ", cafeDaManha="
				+ cafeDaManha + ", cancelamentoGratis=" + cancelamentoGratis + ", idiomas=" + idiomas + ", CheckOut="
				+ CheckOut + ", checkIn=" + checkIn + ", name=" + name + "]";
	}

	
	
}
