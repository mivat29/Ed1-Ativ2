
import java.util.Scanner;

import javax.swing.JOptionPane;

public class TestaVetor {

	public static void main(String[] args) {
		int opcao = 0;
		int pos;
        int id, prioridade, espera;
		boolean criado=true;
        String nome;
		
		Scanner sc = new Scanner(System.in);
		
		Vetor lista = new Vetor();

		do {
			System.out.println("\n\n                        ### Menu ###");
			System.out.println("\n                  =========================================");
			System.out.println("              	  |                       |");
			System.out.println("              	  |     2 - Inserir no Fim da Fila         |");
			System.out.println("                  |     3 - Remover Primeiro na Fila       |");
			System.out.println("                  |     4 - Mostrar Primeiro da Fila       |");
			System.out.println("                  |     5 - Buscar Elemento na Fila        |");
			System.out.println("                  |     6 - Mostrar Tamanho da Fila        |");  
			System.out.println("                  |     7 - Limpar Lista                   |");
			System.out.println("                  |     8 - Mostrar Lista                  |");
			System.out.println("                  |     0 - Sair                           |");
			System.out.println("                  ==========================================\n");
			
			opcao = sc.nextInt();
			System.out.print("\n");
			switch (opcao) {
		case 1: 
			//criar lista
			if(criado==false){
				System.out.print("\nA pilha não está criada!");
				//Vetor lista = new Vetor();
			}
			
        case 2:
			System.out.println("\nOpcao escolhida :"+opcao);
			
            System.out.println("\nDigite o nome :");
            nome = sc.next();
			System.out.println("\nDigite o id :");
			id = sc.nextInt();
			System.out.println("\nDigite a espera :");
			espera = sc.nextInt();
			System.out.println("\nDigite a prioridade :");
			prioridade = sc.nextInt();
            LinkedList novoObjeto = new LinkedList(nome, id, espera, prioridade);
			lista.inserir(novoObjeto);
			
			System.out.println("\nAdicionado!");
			
			break;
        case 3:
			System.out.println("\nOpcao escolhida :"+opcao);
			lista.remover();
			break;
		case 4:
			System.out.println("\nOpcao escolhida :"+opcao);
			lista.inicio();
			
			break;
        case 5: 
			System.out.println("\nOpcao escolhida :"+opcao);

			System.out.println("\nDigite a posicao :");
			pos = sc.nextInt();
			
			System.out.println(lista.obtem(pos));
			break;
        case 6:
			System.out.println("\nOpcao escolhida :"+opcao);
			System.out.println("\nTamanho da lista: "+lista.tamanho());
			break;
		case 7:
			System.out.println("\nOpcao escolhida :"+opcao);
			lista.clear();
			JOptionPane.showMessageDialog(null, lista);
			break;
		case 8: 
			System.out.println("\nOpcao escolhida :"+opcao);
			JOptionPane.showMessageDialog(null, lista);
			break;
			
		case 0:
			break;
        default:
            System.out.println("Opção Inválida!");
            break;
        }
    } while (opcao != 0);
		sc.close();
	}
}
