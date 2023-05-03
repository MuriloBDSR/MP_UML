package miniProjetoMurilo;

public class Armazem {
	    private Patrimonio patrimonio[];
	    private int tamanho ;
	
		public Armazem() {
		patrimonio = new Patrimonio [120];
		tamanho = 0;
	    }
		public boolean addPatrimonio (Patrimonio c) {
			if( tamanho < 120) {
				patrimonio [ tamanho ] = c;
				tamanho ++;
				return true ;
				} else {
					return false ;
				}
		}
		public String mostrarInventario() {
			String saida = "\n  ***** Patrimonios ***** \n" ;
			for(int i = 0; i < tamanho; i++) {
				saida = saida + "\n"+ patrimonio[i].imprimir();
			}
			return saida;
		}	
		public String procurarPatrimonio(String buscador) {
			String resposta = "\n  *****Resultado da pesquisa***** \n";
			for(int i = 0; i < tamanho; i++) {
				if(buscador == patrimonio[i].getNome()) {
					resposta = resposta + "\n" + patrimonio[i].imprimir();
				}
			}
			return resposta;
		}
}
	 

		
