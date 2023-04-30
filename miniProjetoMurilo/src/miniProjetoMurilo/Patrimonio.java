package miniProjetoMurilo;

abstract class Patrimonio {
	public String nome;
	public String anotacoes;
	public double valor;
	boolean status = true;
	
	abstract void setNome(String nome);
	abstract String getNome();
	abstract void setAnotacoes(String anotacoes);
	abstract String getAnotacoes();
	abstract void setValor(double valor);
	abstract double getValor();
	abstract String Imprimir();
	
}
