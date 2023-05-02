package miniProjetoMurilo;

public class Teste2 {
	public static void main(String[] args) {
		Armazem2 armazem = new Armazem2();
		
		armazem.acrescentar_Conta(new Intangivel(null, null, 0));
		armazem.acrescentar_Conta(new Tangivel("Maria"," da caralha", 3232));
		armazem.acrescentar_Conta(new Intangivel("Marcola"," da maconha", 0));
		armazem.acrescentar_Conta(new Tangivel("Rebeca"," do mau", 666));
		armazem.acrescentar_Conta(new Tangivel("Rebeca"," do mau", 666));
		
		System.out.println(armazem.mostrarIventario());
	
	}

}
