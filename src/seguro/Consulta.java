package seguro;

import java.util.Date;

public class Consulta {
	private Date data;
	private String nomeVeterinario;
	//private Animal animal;
	
	public Consulta() {}
	public Consulta( Date data, String nomeVeterinario
			//, Animal animal 
			) {
		super();
		this.data = data;
		this.nomeVeterinario = nomeVeterinario;		
		//this.animal = animal;
	}
	
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getNomeVeterinario() {
		return nomeVeterinario;
	}
	public void setNomeVeterinario(String nomeVeterinario) {
		this.nomeVeterinario = nomeVeterinario;
	}
	
	@Override
	public String toString() {
		return "Consulta [data=" + data + ", nomeVeterinario=" + nomeVeterinario + 
				//(animal!=null?animal.toString():"Animal animal") + 
				"]";
	}	
	
}
