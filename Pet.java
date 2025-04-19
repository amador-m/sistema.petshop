package petShop;

public class Pet {
	private final String nome;
	private boolean limpo;
	
	public Pet(final String nome) {
		this.nome = nome;
		this.limpo = false;
	}
	
	public String getNome() {
		return nome;
	}
	
	public boolean estaLimpo() {
		return limpo;
	}
	
	public void setLimpo(boolean limpo) {
		this.limpo = limpo;
	}

}
