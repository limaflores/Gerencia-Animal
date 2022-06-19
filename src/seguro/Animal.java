package seguro;
//import java.util.List;
import pessoas.Cliente;
import util.Situacao;

public class Animal {
	private String nome;
	private String sexo;
	private int idade;
	private Situacao situacao;
	private Consulta consulta;
	private Cliente cliente;
	
	public Animal() {}	
	public Animal(String nome, String sexo, int idade, Situacao situacao, Consulta consulta, Cliente cliente) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
		this.situacao = situacao;
		this.consulta = consulta;
		this.cliente = cliente; 
		
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
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Consulta getConsulta() {
		return consulta;
	}
	public void setConsulta(Consulta consulta) {
		this.consulta = consulta;
	}
	
	@Override
	public String toString() {
		return "Animal [nome=" + nome + ", sexo=" + sexo + ", idade=" + idade + 
				(situacao!=null?situacao.toString():"Situacao invalida") +
				(cliente!=null?cliente.toString():"Cliente cliente") + "]";
	}	
	
}
