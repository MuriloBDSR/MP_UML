package miniProjetoMurilo;

public class Armazem {
	private int tamanho = 1;
	private Patrimonio[] lista = new Patrimonio[tamanho];
	private String pesquisa;
	
	public Armazem() {
	}
	
	public void adicionarPatrimonio(Patrimonio p) {
		p = lista[tamanho] = p;
		int qtd = tamanho +1;
		setTamanho(qtd);
	}
	public void setPatrimonio(Patrimonio p, int i) {
		this.lista[i] = p;
	}
	public String getPesquisa() {
		return pesquisa;
	}
	public void setPesquisa(String pesquisa) {
		this.pesquisa = pesquisa;
	}
	public String mostrarIventario() {
		String saida = "***** Lista de Alunos Matriculados ***** \n" ;
		for(int i = 0; i < tamanho; i++) {
			System.out.println(lista[i]);
			saida = saida + "\n"+ lista[i].getNome();
		}
		return saida;
	}	
	public String encontrarPatrimonio() {
		Patrimonio resultado = lista[0];
		for(int i = 0; i < lista.length; i++) {
			if(pesquisa == lista[i].getNome()) {
				resultado = lista[i];
			}
		}
		return resultado.getNome();
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	
	
}