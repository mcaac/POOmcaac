package sistemacarro;

import java.util.Comparator;

public class ComparatorCarro implements Comparator<Carro> {

	@Override
	public int compare(Carro o1, Carro o2) {
		return (int) (o1.getValorAluguel() - o2.getValorAluguel());
	}

}
