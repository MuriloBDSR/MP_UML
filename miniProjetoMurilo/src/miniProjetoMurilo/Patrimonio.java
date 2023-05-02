package miniProjetoMurilo;

abstract class Patrimonio {
	public String nome;
	public String anotacoes;
	public int valor;
	
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
	public double getValor() {
		return valor;
	}
	public String Imprimir() {
		return null;
	}	
}
