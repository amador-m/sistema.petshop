package petShop;

import java.util.Scanner;

public class Main {
	public static Scanner input = new Scanner(System.in);
	private final static MaquinaBanhoPet maquinaBanhoPet = new MaquinaBanhoPet();

	public static void main(String[] args) {
		int op; 
		
		do {
			System.out.println();
			System.out.println("Menu de opções do PetShop:");
			System.out.println("\n\t1 - Dar banho no pet");
			System.out.println("\t2 - Abastecer a máquina com água");
			System.out.println("\t3 - Abastecer a máquina com shampoo");
			System.out.println("\t4 - Verificar a água da máquina");
			System.out.println("\t5 - Verificar o shampoo da máquina");
			System.out.println("\t6 - Verificar se há pets tomando banho");
			System.out.println("\t7 - Colocar o pet na máquina");
			System.out.println("\t8 - Retirar o pet da máquina");
			System.out.println("\t9 - Limpar a máquina");
			System.out.println("\t0 - Encerrar o sistema");
			System.out.print("\nDigite a opção desejada: ");
			op = input.nextInt();
			System.out.println();
			
			switch(op) {
			case 1: 
				maquinaBanhoPet.darBanhoNoPet();
				break;
			case 2:
				maquinaBanhoPet.addAgua();
				break;
			case 3: 
				maquinaBanhoPet.addShampoo();
				break;
			case 4:
				int qtdAgua = maquinaBanhoPet.getAgua();
				System.out.printf("A máquina está com %d litro(s) de água\n",qtdAgua);
				break;
			case 5:
				int qtdShampoo = maquinaBanhoPet.getShampoo();
				System.out.printf("A máquina está com %d litro(s) de shampoo\n",qtdShampoo);
				break;
			case 6:
				maquinaBanhoPet.temPetNaMaquina();
				break;
			case 7:
				colocarPetNaMaq();
				break;
			case 8:
				maquinaBanhoPet.tirarPetDaMaquina();
				break;
			case 9:
				maquinaBanhoPet.limparMaquina();
				break;
			case 0:
				System.out.println("Programa encerrado");
				break;
			default:
				System.out.println("Opção inválida");
			}
			
		} while(op != 0);
	}

	public static void colocarPetNaMaq() {
	    input.nextLine(); // limpa buffer 
	    System.out.print("Digite o nome do pet: ");
	    String nome = input.nextLine().trim();
	    while (nome.isEmpty()) {
	        System.out.print("Nome inválido. Digite o nome do pet: ");
	        nome = input.nextLine().trim();
	    }
	    Pet pet = new Pet(nome);
	    maquinaBanhoPet.setPet(pet); // A verificação se há um pet na máquina será feita dentro de setPet()
	}

}
