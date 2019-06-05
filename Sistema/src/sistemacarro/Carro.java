package sistemacarro;
import sistemmain.Avaliavel;
import sistemacarro.Combustivel;
import sistemacarro.Marca;
import sistemacarro.Tipo;

public class Carro implements Avaliavel {
	
	private Marca marca;
	private int quantidadePassageiros;
	private double valorAluguel;
	private String placa;
	private int ano;
	private double kilometragemTotal;
	private boolean kilometragemLivre;
	private boolean possuiAr;
	private Combustivel combustivel;
	private Tipo tipo;
	
	
	public Carro(Marca marca, int quantidadePassageiros, double valorAluguel, String placa, int ano,
			double kilometragemTotal, boolean kilometragemLivre, boolean possuiAr, Combustivel combustivel, Tipo tipo) {
		super();
		this.marca = marca;
		this.quantidadePassageiros = quantidadePassageiros;
		this.valorAluguel = valorAluguel;
		this.placa = placa;
		this.ano = ano;
		this.kilometragemTotal = kilometragemTotal;
		this.kilometragemLivre = kilometragemLivre;
		this.possuiAr = possuiAr;
		this.combustivel = combustivel;
		this.tipo = tipo;
	}


	public Marca getMarca() {
		return marca;
	}


	public int getQuantidadePassageiros() {
		return quantidadePassageiros;
	}


	public double getValorAluguel() {
		return valorAluguel;
	}


	public String getPlaca() {
		return placa;
	}


	public int getAno() {
		return ano;
	}


	public double getKilometragemTotal() {
		return kilometragemTotal;
	}


	public boolean isKilometragemLivre() {
		return kilometragemLivre;
	}


	public boolean isPossuiAr() {
		return possuiAr;
	}


	public Combustivel getCombustivel() {
		return combustivel;
	}


	public Tipo getTipo() {
		return tipo;
	}


	@Override
	public void Avaliar(int nota) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public String toString() {
		return "Carro [marca=" + marca + ", quantidadePassageiros=" + quantidadePassageiros + ", valorAluguel="
				+ valorAluguel + ", placa=" + placa + ", ano=" + ano + ", kilometragemTotal=" + kilometragemTotal
				+ ", kilometragemLivre=" + kilometragemLivre + ", possuiAr=" + possuiAr + ", combustivel=" + combustivel
				+ ", tipo=" + tipo + "]";
	}
	
	
	
	
	
	
}
	