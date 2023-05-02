package miniProjetoMurilo;

import java.util.ArrayList;

public class Armazem2 {
	    private Patrimonio contas [];
	    private int qtd_contas ;
	
		public Armazem2() {
		contas = new Patrimonio [120];
	    qtd_contas = 0;
	    }
		public boolean acrescentar_Conta (Patrimonio c) {
			if( qtd_contas < 120) {
				contas [ qtd_contas ] = c;
				qtd_contas ++;
				return true ;
				} else {
					return false ;
				}
		}
		public String mostrarIventario() {
			String saida = "***** Lista de Alunos Matriculados ***** \n" ;
			for(int i = 0; i < qtd_contas; i++) {
				System.out.println(contas[i]);
				saida = saida + "\n"+ contas[i].Imprimir();
			}
			return saida;
		}	
}
	 

		
