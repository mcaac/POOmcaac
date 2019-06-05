package sistemahospedagem;
import java.util.Calendar;

public interface Arrumavel {
	
	default Calendar Date(){
	 Calendar Data = Calendar.getInstance();
	 return Data;
	}
}
