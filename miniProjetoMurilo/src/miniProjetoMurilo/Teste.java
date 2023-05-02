package miniProjetoMurilo;

public class Teste {
	public static void main(String[] args) {
		
		Armazem armazem = new Armazem();
			
			armazem.addPatrimonio(new Intangivel("Patente", " do bico de mamadeira", 350));
			armazem.addPatrimonio(new Tangivel("Barraco","em Itaqua", 350000, 1));
			armazem.addPatrimonio(new Direito("Entrega","da entrga do bico ", 5));
			armazem.addPatrimonio(new Tangivel("Dienheiro","em reais", 7357.83, 1));
			armazem.addPatrimonio(new Obrigacao("Eduarda","pela hora extra", 70, 5));
			armazem.addPatrimonio(new Direito("Entrega","da entrga do copo ", 5));

			
			System.out.println(armazem.mostrarIventario());
			
			System.out.println(armazem.procurarPatrimonio("Entrega"));	
		}

}
