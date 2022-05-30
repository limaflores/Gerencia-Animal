package util;

import java.util.Date;


public interface Validador {
	
	public default boolean valida(Date data) {
		
		//Verifica se a data � diferente de null
		if(data != null) {			
			return true;
		}
		return false;
		
	}
	
}

