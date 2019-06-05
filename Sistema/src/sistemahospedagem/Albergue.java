package sistemahospedagem;

public class Albergue extends Hospedagem{
	
	

	private int quantidadeHospedesPorQuarto;
	
	public Albergue(String name,Tipos tipo, double valorDiaria, int tempoMinHospedagem, boolean cafeDaManha,
			boolean cancelamentoGratis, Idiomas idiomas, String checkOut, String checkIn, int quantidadeHospedesPorQuarto) {
		super(name,tipo,  valorDiaria,  tempoMinHospedagem,  cafeDaManha,
				 cancelamentoGratis,  idiomas,  checkOut,  checkIn);
		this.quantidadeHospedesPorQuarto = quantidadeHospedesPorQuarto;
	}

	public int getQuantidadeHospedesPorQuarto() {
		return this.quantidadeHospedesPorQuarto;
	}
	
	
	@Override
	public String toString() {
		return "Albergue [quantidadeHospedesPorQuarto=" + quantidadeHospedesPorQuarto + ", tipo=" + tipo
				+ ", valorDiaria=" + valorDiaria + ", tempoMinHospedagem=" + tempoMinHospedagem + ", cafeDaManha="
				+ cafeDaManha + ", cancelamentoGratis=" + cancelamentoGratis + ", idiomas=" + idiomas + ", CheckOut="
				+ CheckOut + ", checkIn=" + checkIn + ", name=" + name + "]";
	}

	
	

}
