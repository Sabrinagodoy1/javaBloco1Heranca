package exercicioHerança;

public class modeloCachorro extends Exercicio1MoldeloAnimal {

	boolean corre;
	public void cachorro() {
		this.setEmiteSom(true);
		System.out.println("AUAU");
	}
	public void correr() {
		this.corre=true;
	
	}
	public void açao() {
		System.out.println("estou correndo AUAU:)!!!");
		
	}
}
