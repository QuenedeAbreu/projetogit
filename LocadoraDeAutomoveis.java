
package locadoradeautomoveis;

import java.util.Scanner;

public class LocadoraDeAutomoveis {

	
	private static Scanner input;
	public static void main(String[] args) {
			input = new Scanner (System.in);
			char opw;
        do {
        System.out.println("|========================= Menu Principal ======================|");
        System.out.println("|                                                               |");
        System.out.println("|                    [ 1 ] - Cadastro                           |");                       
        System.out.println("|                    [ 2 ] - Adicionar                          |");
        System.out.println("|                    [ 3 ] - Carros Disponiveis                 |");
        System.out.println("|                    [ 4 ] - Alugar Carro                       |");
        System.out.println("|                    [ 5 ] - Relatorio                          |");
        System.out.println("|                    [ 6 ] - Excluir                            |");
        System.out.println("|                    [ 0 ] - Fechar Programa                    |");
        System.out.println("|                                                               |");
        System.out.println("|===============================================================|");
        
        System.out.println("informe Sua Opção: ");
        int op = input.nextInt();
        
        switch(op) {
        	case 1:
        		do {
        		 	System.out.println("|====================== Menu de Cadastro =======================|");
        	        System.out.println("|                                                               |");
        	        System.out.println("|                    [ 1 ] - Cadastro de Carro                  |");                       
        	        System.out.println("|                    [ 2 ] - Cadastro de Funcionario            |");
        	        System.out.println("|                    [ 3 ] - Cadastro de Cliente                |");
        	        System.out.println("|                                                               |");
        	        System.out.println("|===============================================================|");
        		
        	        System.out.println("informe Sua Opção: ");
        	        int op2 = input.nextInt();
        	        	switch(op2) {
        	        	 case 1:
        	        		 System.out.println("Você Vai Cadastrar Um Carro");
        	        		 break;
        	        	 case 2:
        	        		 System.out.println("Você Vai Cadastrar Um Funcionario");
        	        		
        	        	break;
        				case 3:
        					
        					 System.out.println("Você Vai Cadastrar Um Cliente");
        				break;	
        	        	}
        	        	System.out.println("\nDeseja realizar outra ação no Menu de Cadastro? ");
        	        	opw = input.next().charAt(0);
        		}while(opw == 's'|| opw == 'S');
        		break;
        		
        		
        	case 2:
        		do {
    		 	System.out.println("|======================== Menu de Adição =======================|");
    	        System.out.println("|                                                               |");
    	        System.out.println("|                    [ 1 ] - Adicionar Carro                    |");                       
    	        System.out.println("|                    [ 2 ] - Adicionar Funcionario              |");
    	        System.out.println("|                    [ 3 ] - Adicionar Cliente                  |");
    	        System.out.println("|                                                               |");
    	        System.out.println("|===============================================================|");
    		
    	        System.out.println("informe Sua Opção: ");
    	        int op3 = input.nextInt();
    	        	switch(op3) {
    	        	 case 1:
    	        		 System.out.println("\nVocê Vai adicionar um Carro");
    	        		 break;
    	        	 case 2:
    	        		 System.out.println("\nVocê Vai adicionar um Funcionario");
    	        		
    	        	break;
    				case 3:
    					
    					 System.out.println("\nVocê Vai adicionar um Cliente");
    				break;	
    	        	}
    	        	System.out.println("\nDeseja realizar outra ação no Menu de Adição? ");
    	        	opw = input.next().charAt(0);
        		}while(opw == 's'|| opw == 'S');
    		break;
    		
        	case 3:
        		System.out.println("\nOs Carros Disponiveis São!");
        		break;
        	case 4:
        		System.out.println("\nVocê vai alugar um carro!");
        	break;
        	
        	case 5:
        		do {
        		System.out.println("|======================= Menu de Relatorio =====================|");
    	        System.out.println("|                                                               |");
    	        System.out.println("|                    [ 1 ] - Relatorio de Carro                 |");                       
    	        System.out.println("|                    [ 2 ] - Relatorio de Funcionario           |");
    	        System.out.println("|                    [ 3 ] - Relatorio de Cliente               |");
    	        System.out.println("|                    [ 4 ] - Relatorio de Aluguéis              |");
    	        System.out.println("|                                                               |");
    	        System.out.println("|===============================================================|");
    		
    	        System.out.println("informe Sua Opção: ");
    	        int op4 = input.nextInt();
    	        	switch(op4) {
    	        	 case 1:
    	        		 System.out.println("\nVocê ver o relatorio de um Carro");
    	        		 break;
    	        	 case 2:
    	        		 System.out.println("\nVocê ver o relatorio de um Funcionario");
    	        		
    	        	break;
    				case 3:
    					
    					 System.out.println("\nVocê ver o relatorio de um Cliente");
    				break;	
    				case 4:
    					System.out.println("\nVocê ver o relatorio de Aluguéis!");
    	        	}
    	        		System.out.println("\nDeseja realizar outra ação no Menu de Relatorios? ");
    	        	opw = input.next().charAt(0);
        		}while(opw == 's'|| opw == 'S');
        		break;
        		
        	case 6:
        		do {
            		System.out.println("|======================= Menu de Exclusão ======================|");
        	        System.out.println("|                                                               |");
        	        System.out.println("|                    [ 1 ] - Excluir Carro                      |");                       
        	        System.out.println("|                    [ 2 ] - Excluir Funcionario                |");
        	        System.out.println("|                    [ 3 ] - Excluir de Cliente                 |");
        	        System.out.println("|                                                               |");
        	        System.out.println("|===============================================================|");
        		
        	        System.out.println("informe Sua Opção: ");
        	        int op4 = input.nextInt();
        	        	switch(op4) {
        	        	 case 1:
        	        		 System.out.println("\nVocê vai excluir um Carro");
        	        		 break;
        	        	 case 2:
        	        		 System.out.println("\nVocê vai excluir um Funcionario");
        	        		
        	        	break;
        				case 3:
        					
        					 System.out.println("\nVocê vai excluir um Cliente");
        				break;	
    
        	        	}
        	        		System.out.println("\nDeseja realizar outra ação no Menu de Exclusão? ");
        	        	opw = input.next().charAt(0);
            		}while(opw == 's'|| opw == 'S');
        		break;
        	case 0:
        		System.out.println("fechado para negocios");
        		System.exit(0);
        		
        		break;
        
        	}
        	System.out.println("Deseja realizar outra ação no Menu Principal? ");
        	opw = input.next().charAt(0);
        	
        }while(opw == 's'|| opw == 'S');
    }
	
	
}
    

