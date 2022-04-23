package seguro;

public class Animal {
	private String nome;
	private String sexo;
	private String idade;
	
	public Animal() {}
	public Animal(String nome, String sexo, String idade) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	
	@Override
	public String toString() {
		return "Animal [nome=" + nome + ", sexo=" + sexo + ", idade=" + idade + "]";
	}	
	
}
