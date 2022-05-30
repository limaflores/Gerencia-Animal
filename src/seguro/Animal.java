package seguro;
//import java.util.List;

import util.Situacao;

public class Animal {
	private String nome;
	private String sexo;
	private int idade;
	//private Situacao situacao;
	private Consulta consulta;
	
	public Animal() {}	
	public Animal(String nome, String sexo, int idade,  Consulta consulta) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		//this.situacao = situacao;
		this.consulta = consulta;
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
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	@Override
	public String toString() {
		return "Animal [nome=" + nome + ", sexo=" + sexo + ", idade=" + idade + 
				//(situacao!=null?situacao.toString():"Situacao invalida") +
				(consulta!=null?consulta.toString():"Consulta consulta") + "]";
	}	
	
}
