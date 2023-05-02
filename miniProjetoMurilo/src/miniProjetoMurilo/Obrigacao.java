package miniProjetoMurilo;

public class Obrigacao extends Patrimonio{
	private String tipo = "Obrigacao";
	private int quantidade;
	public Obrigacao(String n, String a, double v, int q) {	
		nome = n;
		anotacoes = a;
		valor = v;
		quantidade = q;
		
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
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public String Imprimir() {
		return "Nome: "+ nome + 
				"; Anotacoes: "+ anotacoes +
				"; Valor: "+ valor +
				"; tipo: " + tipo +
				"; quantidade: "+ quantidade;
	}


}
