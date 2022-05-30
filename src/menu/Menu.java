package menu;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import pessoas.*;
import seguro.*;
import util.*;

public class Menu {	
	public static void main(String[] args) throws ParseException {		
		ArrayList<Animal> animais = new ArrayList<>();//lista dos animais que serão cadastrados
		
		while(true) {
		   switch(montaMenu()) {
		       case 1://Cadastrar Animal
		    	   String nome = JOptionPane.showInputDialog(null, "Informe o nome:");
		    	   String sexo = JOptionPane.showInputDialog(null, "Informe o sexo:");
		    	   Integer idade = Integer.parseInt( JOptionPane.showInputDialog(null, "Informe a idade:") );		   
		    	   
		    	   //criando um objeto Consulta - lendo os valores
		    	   //Date data = Date.parseDate(JOptionPane.showInputDialog(null, "Informe a data da consulta:"));
		    	   
		    	   String retorno = JOptionPane.showInputDialog(null, "Data da consulta: ","Data",JOptionPane.OK_OPTION);
		   		   Date data = new SimpleDateFormat("dd/MM/yyyy").parse(retorno);
		   		   //System.out.println(data);		   		
		    	   String nomeVeterinario = JOptionPane.showInputDialog(null, "Informe o nome do veterinario:");		    	   
		    	   Consulta consulta = new Consulta(data, nomeVeterinario );
		    	   //colocar o teste		    	      
		    	   
		    	   //int valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o numero da situacao? 1.Em acompanhamento 2.Regular 3.Falecido"));
		    	   //Situacao situacao = Situacao(Situacao valor);
		    	   
		    	   //adiciona na lista de animais um animal com todos os seus dados
		    	   animais.add( new Animal(nome, sexo, idade, consulta) );		    	      
		    	   break;
		    	      
		       case 2://Pesquisar Animal usando o nome
		    	   
		    	      break;
		    	      
		       case 3://Pesquisar Animal usando o nome do cliente
		    	      break;

		       case 4: //Pesquisar Animal usando a data da consulta
		    	      break;
		    	      
		       case 5: //Listar
		    	      break;
		    	      
		       case 6: System.exit(0); //Sair
	    	      break;
		   }
		}
	}
	
	private static int montaMenu() {
	    String str = "";
	    for(OpcoesMenu opcaoMenu : OpcoesMenu.values())
	        str +=  opcaoMenu.toString()+"\n";
	    return Integer.parseInt(JOptionPane.showInputDialog(str));             
	}
	
}
