package exercicioHerança;

public class testando {

	public static void main(String[] args) {
		modeloCachorro cachorro1=new modeloCachorro();
		
		cachorro1.setNome("bela");
		cachorro1.setIdade(6);
		cachorro1.cachorro();
		cachorro1.isEmiteSom();
		cachorro1.correr();
		
		System.out.println("CACHORO");
		System.out.println("nome é: "+cachorro1.getNome());
		System.out.println("idade é:"+cachorro1.getIdade());
		System.out.println("emite som:" +cachorro1.isEmiteSom());
		System.out.println("corre?"+cachorro1.corre);
		cachorro1.açao();
		System.out.println();
		
		modeloCavalo cavalo1 =new modeloCavalo();
		
		cavalo1.setNome("leoncio");
		cavalo1.setIdade(10);
		cavalo1.cavalo();
		cavalo1.isEmiteSom();
		cavalo1.correr();
		
		System.out.println("CAVALO");
		System.out.println("nome é: "+cavalo1.getNome());
		System.out.println("idade é:"+cavalo1.getIdade());
		System.out.println("emite som:" +cavalo1.isEmiteSom());
		System.out.println("corre?"+cavalo1.corre);
		cavalo1.acao();
		System.out.println();
		
		modeloPreguiça preguiça1=new modeloPreguiça();
		preguiça1.setNome("jorgina");
		preguiça1.setIdade(4);
		preguiça1.preguiça();
		preguiça1.isEmiteSom();
		preguiça1.correr();
		
		System.out.println("PREGUIÇA");
		System.out.println("nome é: "+preguiça1.getNome());
		System.out.println("idade é:"+preguiça1.getIdade());
		System.out.println("emite som:" +preguiça1.isEmiteSom());
		System.out.println("corre?"+preguiça1.corre);
		preguiça1.acao();
		System.out.println();

		
	}

}
