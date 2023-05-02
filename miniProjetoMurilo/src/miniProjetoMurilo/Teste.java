package miniProjetoMurilo;

import java.util.ArrayList;
import java.util.List;

public class Teste{
	static Tangivel a;
	static Intangivel b;
	static Intangivel c;
	static Tangivel d;
	
	public static void main(String[] args) {
		 
		 Armazem aux = new Armazem();
		 
		 a = new Tangivel("Gaybriel", "Joga LOL", 138);
		 b = new Intangivel("Maria"," da caralha", 3232);
		 c = new Intangivel("Marcola"," da maconha", 0);
		 d = new Tangivel("Rebeca"," do mau", 666);
		 
		
		aux.adicionarPatrimonio(b);
		aux.adicionarPatrimonio(c);
		aux.adicionarPatrimonio(d);
		
		System.out.print(aux.mostrarIventario());
		
	 }
}