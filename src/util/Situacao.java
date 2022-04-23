package util;

public enum Situacao {
	EM_ACOMPANHAMENTO(1), REGULAR(2), FALECIDO(3);
		
	private final int valor;
		
	private Situacao(int valor) { this.valor = valor; }	
	
	public int getValor() {		
		return valor;		
	}
		
}
