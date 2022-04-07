package exercicioHerança;

public class modeloCavalo extends Exercicio1MoldeloAnimal {
	
	boolean corre;
	public void cavalo() {
		this.setEmiteSom(true);
		
	}
	public void correr() {
		this.corre=true;
		
	}
	public void acao() {
		System.out.println("galopando na tarde ensolarada...");
	}
}


