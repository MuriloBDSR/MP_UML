package miniProjetoMurilo;

public class Intangivel extends Patrimonio{
	private String tipo = "Inatangivel";

	
	public Intangivel(String n, String a, double v) {	
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
	public void setValor(double valor) {
		this.valor = valor;		
	}
	public double getValor() {
		return valor;
	}
	public String imprimir() {
		return "Nome: "+ nome + 
				"; Anotacoes: "+ anotacoes +
				"; Valor: "+ valor +
				"; tipo: " + tipo;
	}
	public void alterar(String n, String a, double v) {	
		nome = n;
		anotacoes = a;
		valor = v;
		
	}

	
	
}
