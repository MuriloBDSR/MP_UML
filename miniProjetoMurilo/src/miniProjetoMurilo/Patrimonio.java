package miniProjetoMurilo;

abstract class Patrimonio {
	public String nome;
	public String anotacoes;
	public double valor;
	
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
		return null;
	}
	public void alterar() {
		
	}
}
