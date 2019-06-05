package sistemacarro;
import java.util.Comparator;

public class ComparatorCarroAno implements Comparator<Carro> {

	@Override
	public int compare(Carro o1, Carro o2) {
		return (int) (o1.getAno() - o2.getAno());
	}

}
		
		

	

