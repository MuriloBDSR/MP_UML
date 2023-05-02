package miniProjetoMurilo;

public class Intangivel extends Patrimonio{
	private String tipo = "Inatangível";

	
	public Intangivel(String n, String a, int v) {	
		nome = n;
		anotacoes = a;
		valor = v;
	}
	public void setNome(String nome) {
		this.nome = nome;
		
	}
	public String getNome() {
		return nome;
	}
	public void setAnotacoes(String anotacoes) {
		this.anotacoes = anotacoes;
		
	}
	public String getAnotacoes() {
		return anotacoes;
	}
	public void setValor(int valor) {
		this.valor = valor;		
	}
	/*public double getValor() {
		return valor;
	}*/
	public String Imprimir() {
		return "Nome: "+ nome + 
				"; Anotações: "+ anotacoes +
				"; Valor: "+ valor +
				"; tipo: " + tipo;
	}

	
	
}
