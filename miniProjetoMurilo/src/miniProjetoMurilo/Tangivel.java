package miniProjetoMurilo;

public class Tangivel extends Patrimonio{
	private String tipo = "Tangivel";
	private int quantidade;
	
	public Tangivel(String n, String a, double v, int q) {	
		nome = n;
		anotacoes = a;
		valor = v;
		quantidade = q;
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

	public void setValor(double valor) {
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
				"; Anotacoes: "+ this.getAnotacoes() +
				"; Valor: "+ this.getValor() +
				"; tipo: " + tipo +
				"; quantidade: "+ quantidade;
	}

}
