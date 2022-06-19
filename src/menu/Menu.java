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
		//ArrayList<Cliente> clientes = new ArrayList<>();//lista dos clientes
		
		// Cadastro de alguns clientes para realizar o cadastro de animal
		Cliente cliente1 =  new Cliente("Jose", "Rua Clienteum", "3030", "emailclienteum");
		Cliente cliente2 =  new Cliente("Silvia", "Rua Clientedois", "3050", "emailclientedois");
		Cliente cliente3 =  new Cliente("Nicolas", "Rua Clientetres", "3090", "emailclientetres");

		while(true) {
		   switch(montaMenu()) {
		       case 1://Cadastrar Animal
		    	   String nome = JOptionPane.showInputDialog(null, "Informe o nome:");
		    	   String sexo = JOptionPane.showInputDialog(null, "Informe o sexo:");
		    	   Integer idade = Integer.parseInt( JOptionPane.showInputDialog(null, "Informe a idade:") );		   
		    	   
		    	   //criando um objeto Consulta - lendo os valores
		    	   //Date data = Date.parseDate(JOptionPane.showInputDialog(null, "Informe a data da consulta:"));
		    	   
		    	   String retorno = JOptionPane.showInputDialog(null, "Data da consulta(dd/MM/yyyy): ","Data",JOptionPane.OK_OPTION);
		   		   Date data = new SimpleDateFormat("dd/MM/yyyy").parse(retorno);
		   		   //System.out.println(data);		   		
		    	   String nomeVeterinario = JOptionPane.showInputDialog(null, "Informe o nome do veterinario:");		    	   
		    	   Consulta consulta = new Consulta(data, nomeVeterinario );
		    	   //colocar o teste		    	      
		    	   
		    	   int valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o numero da situacao?\n 1.Em acompanhamento\n 2.Regular\n 3.Falecido\n"));
		    	   Situacao situacao = null;
		    	   switch(valor) {
			       		case 1:
			       			situacao = Situacao.EM_ACOMPANHAMENTO;
			       			break;			
			       		case 2:
			       			situacao = Situacao.REGULAR;
			       			break;
			       		case 3:
			       			situacao = Situacao.FALECIDO;
			       			break;
			       		default:
			       			System.out.print("Valor incorreto, selecione novamente por favor");		       			
		    	   }
		    	   
		    	   int valorCliente = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha o cliente(numero)?\n 1.Jose\n 2.Silvia\n 3.Nicolas"));
		    	   Cliente clienteEscolhido = null;
		    	   switch(valorCliente) {
			       		case 1:
			       			clienteEscolhido = cliente1;
			       			break;	
			       		case 2:
			       			clienteEscolhido = cliente2;
			       			break;
			       		case 3:
			       			clienteEscolhido = cliente3;
			       			break;
			       		default:
			       			System.out.print("Valor incorreto, selecione novamente por favor");
		    	   }
		    	   
		    	   //adiciona na lista de animais um animal com todos os seus dados
		    	   animais.add( new Animal(nome, sexo, idade, situacao, consulta, clienteEscolhido) );
		    	   break;
		    	      
		       case 2://Pesquisar Animal usando o nome
		    	   //lê o nome que será pesquisa na lista de animais
		    	   String nomePesquisa = JOptionPane.showInputDialog(null, "Informe o nome de pesquisa:");
		    	   //flag vai sinalizar se achou ou não o objeto na lista
		    	   boolean flag = false; //o objeto não está na lista 
		    	   //verifica se a lista foi criada
		    	     
		    	   if(animais!=null) {
		    		   for (Animal animal : animais) {
			    	   	 //se existe o animal da posição que está sendo acessa na lista
						 if(animal!=null) {
							 //Não usar -> aluno.getNome() == nomePesquisa, isso verifica os objetos ocupam a mesma posição de memória
							 if(animal.getNome().equals(nomePesquisa)) {
								JOptionPane.showMessageDialog(null, "achou o nome na lista");
								flag = true; //sinaliza que o objeto está na lista
							 }
						 }
		    		   }
		    	    }
					if(flag == false) //ou if(!flag)
						JOptionPane.showMessageDialog(null, "não achou o nome na lista");
					  
					//verdadeiro pro flag
					  //if(flag==true) ou if(flag)
		    	    break;
		    	      
		       case 3://Pesquisar Animal usando o nome do cliente
		    	    //lê o nome que será pesquisado na lista
		    	    String nomePesquisaCliente = JOptionPane.showInputDialog(null, "Informe o nome de pesquisa:");
		    	    //flag vai sinalizar se achou ou não o objeto na lista
		    	    boolean flagg = false; //o objeto não está na lista 
		    	    //verifica se a lista foi criada		    	     
		    	    if(animais!=null) {
		    		   for (Animal animal : animais) {
			    	   	 //se existe o animal da posição que está sendo acessa na lista
						 if(animal!=null) {
							 //Não usar -> aluno.getNome() == nomePesquisa, isso verifica os objetos ocupam a mesma posição de memória							 
							 if(animal.getCliente().getNome().equals(nomePesquisaCliente)) {
								JOptionPane.showMessageDialog(null, "achou na lista");
								flagg = true; //sinaliza que o objeto está na lista
							 }
						 }
		    		   }
		    	    }
					if(flagg == false) //ou if(!flag)
						JOptionPane.showMessageDialog(null, "não achou o nome na lista");					  
					//verdadeiro pro flag
					//if(flag==true) ou if(flag)
		    	    break;

		       case 4: //Pesquisar Animal usando a data da consulta
		    	    //lê o data que será pesquisada na lista
		    	    String auxData = JOptionPane.showInputDialog(null, "Informe a data da consulta para pesquisa (dd/MM/yyyy): ","Data",JOptionPane.OK_OPTION);
			   		Date dataPesquisa = new SimpleDateFormat("dd/MM/yyyy").parse(auxData);			   		   			   					   		   
		    	    //flag vai sinalizar se achou ou não o objeto na lista
		    	    boolean flaggg = false; //o objeto não está na lista 
		    	    //verifica se a lista foi criada		    	     
		    	    if(animais!=null) {
		    		   for (Animal animal : animais) {
			    	   	 //se existe o animal da posição que está sendo acessa na lista
						 if(animal!=null) {
							 //Não usar -> aluno.getNome() == nomePesquisa, isso verifica os objetos ocupam a mesma posição de memória							 
							 if(animal.getConsulta().getData().equals(dataPesquisa)) {
								JOptionPane.showMessageDialog(null, "achou na lista");
								flaggg = true; //sinaliza que o objeto está na lista
							 }
						 }
		    		   }
		    	    }
					if(flaggg == false) //ou if(!flag)
						JOptionPane.showMessageDialog(null, "não achou o nome na lista");					  
					
					break;
		    	      
		       case 5: //Listar todos animais
		    	    if(animais!=null) {
		    	          for (Animal animal : animais) {
	 		    	    	  //se existe o animal da posição que está sendo acessa na lista 
							  if(animal!=null) {
								  JOptionPane.showMessageDialog(null, animal.toString()); 
							  }
		    	          }
		    	       }else
		    	    	   JOptionPane.showMessageDialog(null, "Não existem animais cadastrados!"); 		    	    
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
