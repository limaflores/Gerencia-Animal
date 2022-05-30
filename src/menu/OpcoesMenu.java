package menu;

public enum OpcoesMenu {	
	CADASTRAR_ANIMAL(1), PESQ_ANIMAL_POR_NOME(2), PESQ_ANIMAL_POR_NOME_CLIENTE(3), PESQ_ANIMAL_POR_DATA(4), LISTAR_TODOS_ANIMAIS(5), SAIR(6);
	
	private final int valor;
	private OpcoesMenu(int valorOpcao){
		valor = valorOpcao;
	}
	public int getValor(){
		return valor;
	}
    @Override
    public String toString(){
       return this.getValor() + " - " + this.name();
    }
}

