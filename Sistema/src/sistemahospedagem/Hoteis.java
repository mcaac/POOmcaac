package sistemahospedagem;

public class Hoteis extends  Hotel_Pousada {

      private Estrelas estrelas;
     
      public Hoteis(String name,Tipos tipo, double valorDiaria, int tempoMinHospedagem, boolean cafeDaManha,
  			boolean cancelamentoGratis, Idiomas idiomas, String checkOut, String checkIn, boolean translados, Estrelas estrelas) {
  		super(name, tipo,  valorDiaria,  tempoMinHospedagem,  cafeDaManha,
  				 cancelamentoGratis,  idiomas,  checkOut,  checkIn, translados);
  		this.estrelas= estrelas;
  	}

  	public Estrelas getEstrelas() {
  		return this.estrelas;
  	}

	@Override
	public String toString() {
		return "Hoteis [estrelas=" + estrelas + ", tipo=" + tipo + ", valorDiaria=" + valorDiaria
				+ ", tempoMinHospedagem=" + tempoMinHospedagem + ", cafeDaManha=" + cafeDaManha
				+ ", cancelamentoGratis=" + cancelamentoGratis + ", idiomas=" + idiomas + ", CheckOut=" + CheckOut
				+ ", checkIn=" + checkIn + ", name=" + name + "]";
	}


}
