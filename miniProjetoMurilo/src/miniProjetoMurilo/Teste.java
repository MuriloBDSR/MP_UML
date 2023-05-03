package miniProjetoMurilo;

public class Teste {
	public static void main(String[] args) {
		
		Armazem armazem = new Armazem();
			 
			armazem.addPatrimonio(new Intangivel("Patente", "do bico de mamadeira", 350));
			armazem.addPatrimonio(new Tangivel("Barraco","em Itaqua", "Bem velho", 350000, 1));
			armazem.addPatrimonio(new Tangivel("Apartamento","no Guaruja","em Sao Paulo", 50000000, 1));
			armazem.addPatrimonio(new Tangivel("Dienheiro","no cofre", "em reais", 7357.83, 1));
			armazem.addPatrimonio(new Tangivel("Carros","na garagem", "", 70, 2));
			armazem.addPatrimonio(new Intangivel("Patente","de um site na internet", 700));

			
			System.out.println(armazem.mostrarInventario());
			
			System.out.println(armazem.procurarPatrimonio("Patente"));	
		}

}
