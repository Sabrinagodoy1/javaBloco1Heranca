package exercicioHeran�a;

public class testando {

	public static void main(String[] args) {
		modeloCachorro cachorro1=new modeloCachorro();
		
		cachorro1.setNome("bela");
		cachorro1.setIdade(6);
		cachorro1.cachorro();
		cachorro1.isEmiteSom();
		cachorro1.correr();
		
		System.out.println("CACHORO");
		System.out.println("nome �: "+cachorro1.getNome());
		System.out.println("idade �:"+cachorro1.getIdade());
		System.out.println("emite som:" +cachorro1.isEmiteSom());
		System.out.println("corre?"+cachorro1.corre);
		cachorro1.a�ao();
		System.out.println();
		
		modeloCavalo cavalo1 =new modeloCavalo();
		
		cavalo1.setNome("leoncio");
		cavalo1.setIdade(10);
		cavalo1.cavalo();
		cavalo1.isEmiteSom();
		cavalo1.correr();
		
		System.out.println("CAVALO");
		System.out.println("nome �: "+cavalo1.getNome());
		System.out.println("idade �:"+cavalo1.getIdade());
		System.out.println("emite som:" +cavalo1.isEmiteSom());
		System.out.println("corre?"+cavalo1.corre);
		cavalo1.acao();
		System.out.println();
		
		modeloPregui�a pregui�a1=new modeloPregui�a();
		pregui�a1.setNome("jorgina");
		pregui�a1.setIdade(4);
		pregui�a1.pregui�a();
		pregui�a1.isEmiteSom();
		pregui�a1.correr();
		
		System.out.println("PREGUI�A");
		System.out.println("nome �: "+pregui�a1.getNome());
		System.out.println("idade �:"+pregui�a1.getIdade());
		System.out.println("emite som:" +pregui�a1.isEmiteSom());
		System.out.println("corre?"+pregui�a1.corre);
		pregui�a1.acao();
		System.out.println();

		
	}

}
