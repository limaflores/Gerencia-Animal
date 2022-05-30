package pessoas;
import seguro.Animal;
import java.util.List;

public class Cliente extends Pessoa {
	private String email;
	//private Animal animal;
	private List<Animal> animais;	
	
	public Cliente() {}
	public Cliente(String nome, String endereco, String telefone, String email, List<Animal> animais) {
		super(nome, endereco, telefone);
		this.email = email;		
		this.animais = animais;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		String aux = "";
		if(animais!=null) {
			for(Animal animal: animais) {
				if(animal!=null) {
					aux += animal.toString() + "\n";
				}
			}
		}
		return "Cliente [" + super.toString() + "email=" + email + aux + "]";
		
	}	
	
}
