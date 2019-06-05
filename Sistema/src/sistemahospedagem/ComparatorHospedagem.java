package sistemahospedagem;
import java.util.Comparator;


public class ComparatorHospedagem implements Comparator<Hospedagem> {

	@Override
	public int compare(Hospedagem o1, Hospedagem o2) {
		return (int) (o1.getValorDiaria() - o2.getValorDiaria());
	}
	    

	}
	
	
