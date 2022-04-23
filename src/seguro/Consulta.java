package seguro;

import java.util.Date;

public class Consulta {
	private Date data;
	private String nomeVeterinario;
	
	public Consulta() {}
	public Consulta( Date data, String nomeVeterinario ) {
		super();
		this.data = data;
		this.nomeVeterinario = nomeVeterinario;		
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
		return "Consulta [data=" + data + ", nomeVeterinario=" + nomeVeterinario + "]";
	}	
	
}
