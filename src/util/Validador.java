package util;

import java.util.Date;


public interface Validador {
	
	public default boolean valida(Date data) {
		
		//Verifica se a data é diferente de null
		if(data != null) {			
			return true;
		}
		return false;
		
	}
	
}

