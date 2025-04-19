package petShop;

public class MaquinaBanhoPet {
	private boolean Maqlimpa = true; 
	private int shampoo = 10;
	private int agua = 30;
	private Pet pet;
	
	public void darBanhoNoPet() {
		if(this.pet == null) {
			System.out.println("Coloque o pet na máquina para iniciar o banho");
			return;
		} else {
			this.agua -= 10;
			this.shampoo -= 2; // gasta a cada banho
			pet.setLimpo(true);
			System.out.printf("O pet %s está limpo\n",pet.getNome());
		}
	}
	
	public void addAgua() {
		if(agua >= 30) {
			System.out.println("A capacidade de água da máquina está no máximo");
			return;
		} else {
			System.out.println("Colocando água na máquina");
			agua += 2; // se não estiver no máximo abastecer a água com 2L
		}
	}
	
	public void addShampoo() {
		if(shampoo >= 10) {
			System.out.println("A capacidade de shampoo da máquina está no máximo");
			return;
		} else {
			System.out.println("Colocando shampoo na máquina");
			shampoo += 2; // se não estiver no máximo abastecer o shampoo com 2L
		}
	}
	
	public int getAgua() {
		return agua;
	}
	public int getShampoo() {
		return shampoo;
	}
	
	public boolean temPetNaMaquina() {
		// "return pet != null;" também funcionaria
		if(pet != null) {
			System.out.println("Tem pet na máquina");
			return true;
		} else {
			System.out.println("Não tem pet na máquina");
			return false;
		}
	}
	
	public void setPet(Pet pet) {
	    if (!this.Maqlimpa) {
	        System.out.println("A máquina está suja, para colocar o pet é necessário limpá-la");
	        return;
	    } if(this.pet != null) { // verifica se tem pet na máquina
	        System.out.printf("O pet %s está na máquina no momento. Retire ele antes de colocar outro.\n", this.pet.getNome());
	        return;
	    }
	    this.pet = pet;
	    System.out.printf("O pet %s foi colocado na máquina\n", pet.getNome());
	}



	public void tirarPetDaMaquina() {
		// "this.Maqlimpa = this.pet.estaLimpo" também funcionaria	
		if(!this.pet.estaLimpo()) {
			this.Maqlimpa = false;
		}
		System.out.printf("O pet %s está limpo e saiu da máquina\n",this.pet.getNome());
		this.pet = null; 
	}
	
	public void limparMaquina() {
		this.agua -= 3;
		this.shampoo -= 1;
		this.Maqlimpa = true;
		System.out.println("A máquina foi limpa");
	}

}
