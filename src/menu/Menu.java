package menu;

import java.util.ArrayList;
import pessoas.*;
import seguro.*;
import util.*;

//import javax.swing.JOptionPane;

public class Menu {
	
	public static void main(String[] args) {
		
		ArrayList<Cliente> clientes = new ArrayList<>();
		
		while(true) {
		   switch(montaMenu()) {
		       case 1://Cadastrar Animal
		    	     // String nome = JOptionPane.showInputDialog(null, "Informe o nome:");		
		    	      break;
		    	      
		       case 2://Pesquisar Animal usando o nome
		    	   
		    	      break;
		    	      
		       case 3://Pesquisar Animal usando o nome do cliente
		    	      break;

		       case 4: //Pesquisar Animal usando a data da consulta
		    	      break;
		    	      
		       case 5: //Listar
		    	      break;
		    	      
		       case 6: //Sair
		    	      break;
		   }
		}
	}
	/*
	private static int montaMenu() {
	    String str = "";
	    for(OpcoesMenu opcaoMenu : OpcoesMenu.values())
	        str +=  opcaoMenu.toString()+"\n";
	    return Integer.parseInt(JOptionPane.showInputDialog(str));             
	}
	*/
}
