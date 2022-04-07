package exercicioHerança;

public class modeloPreguiça extends Exercicio1MoldeloAnimal  {

	boolean corre;
	public void preguiça() {
		this.setEmiteSom(true);
		
	}
	public void correr() {
		this.corre=false;
	}
	public void acao() {
		System.out.println("mimindo com preguiça zzzzzz");
	}
}


