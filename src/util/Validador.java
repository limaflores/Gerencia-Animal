package util;

import java.util.Date;


public interface Validador {
	
	public default boolean valida(Date data) {
		return true;
	}
	
}

