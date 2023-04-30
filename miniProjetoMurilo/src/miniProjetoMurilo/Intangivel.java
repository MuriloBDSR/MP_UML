package miniProjetoMurilo;

public class Intangivel extends Patrimonio{
	private String tipo = "Inatangível";

	
	public Intangivel() {	
	}

	@Override
	void setNome(String nome) {
		this.nome = nome;
		
	}

	@Override
	String getNome() {
		return nome;
	}

	@Override
	void setAnotacoes(String anotacoes) {
		this.anotacoes = anotacoes;
		
	}

	@Override
	String getAnotacoes() {
		return anotacoes;
	}

	@Override
	void setValor(double valor) {
		this.valor = valor;		
	}

	@Override
	double getValor() {
		return valor;
	}
	public String Imprimir() {
		return "Nome: "+ this.getNome() + 
				"; Anotações: "+ getAnotacoes() +
				"; Valor: "+ getValor() +
				"; tipo: " + tipo;
	}

	
	
}