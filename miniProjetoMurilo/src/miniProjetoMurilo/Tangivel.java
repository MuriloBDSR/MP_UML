package miniProjetoMurilo;

public class Tangivel extends Patrimonio{
	private String tipo = "Tangível";
	private int quantidade;
	
	public Tangivel(String n, String a, int v) {	
		nome = n;
		anotacoes = a;
		valor = v;
	}

	@Override
	public void setNome(String nome) {
		this.nome = nome;
		
	}

	@Override
	public String getNome() {
		return nome;
	}

	@Override
	public void setAnotacoes(String anotacoes) {
		this.anotacoes = anotacoes;
		
	}

	@Override
	public String getAnotacoes() {
		return anotacoes;
	}

	@Override
	public void setValor(int valor) {
		this.valor = valor;		
	}

	@Override
	public double getValor() {
		return valor;
	}
	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String Imprimir() {
		return "Nome: "+ this.getNome() + 
				"; Anotações: "+ this.getAnotacoes() +
				"; Valor: "+ this.getValor() +
				"; tipo: " + tipo +
				"; quntidade: "+ quantidade;
	}

}
