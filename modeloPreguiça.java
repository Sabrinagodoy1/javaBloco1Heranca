package exercicioHeran�a;

public class modeloPregui�a extends Exercicio1MoldeloAnimal  {

	boolean corre;
	public void pregui�a() {
		this.setEmiteSom(true);
		
	}
	public void correr() {
		this.corre=false;
	}
	public void acao() {
		System.out.println("mimindo com pregui�a zzzzzz");
	}
}


