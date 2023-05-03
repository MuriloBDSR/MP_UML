package miniProjetoMurilo;

public class Tangivel extends Patrimonio{
	private String tipo = "Tangivel";
	private String local;
	private int quantidade;
	
	public Tangivel(String n, String l,String a, double v, int q) {	
		nome = n;
		anotacoes = a;
		valor = v;
		local = l;
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

	public String imprimir() {
		return "Nome: "+ nome + 
				"; local: " + local+
				"; Anotacoes: "+ anotacoes +
				"; Valor: "+ valor +
				"; quantidade: "+ quantidade +
				"; tipo: " + tipo;
	}
	public void alterar(String n, String l,String a, double v, int q) {
		nome = n;
		anotacoes = a;
		valor = v;
		local = l;
		quantidade = q;		
	}

}
