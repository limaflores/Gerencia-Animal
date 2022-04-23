package pessoas;

import seguro.Animal;

public class Cliente extends Pessoa {
	private String email;
	private Animal animal;
	
	public Cliente() {}
	public Cliente(String nome, String endereco, String telefone, String email, Animal animal) {
		super(nome, endereco, telefone);
		this.email = email;		
		this.animal = animal;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Pessoa:" + super.toString() + "Cliente [email=" + email + "]";
	}	
	
}
