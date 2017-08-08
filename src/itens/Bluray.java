/**
 * Classe abstrata que serve de base para a construção de BluRay's
 * 
 * Herda atributos da classe Itens
 * */

package itens;

public abstract class Bluray extends Item {

	protected int duracao;
	protected ClassificacaoIndicativa classind;
	
	/**
	 * Constroi um objeto do tipo BluRay
	 * 
	 * @param nome Nome do Item
	 * @param preco Preço do Item
	 * @param duracao Representa a duração do BluRay
	 * @param classInd Representa a classificação indicativa do BluRay
	 * */
	public Bluray(String nome, double preco, int duracao, String classind) {
		super(nome, preco);
		this.duracao = duracao;
		this.classind = ClassificacaoIndicativa.valueOf(classind.toUpperCase());
	}

	/**
	 * Resgata atributos do BluRay
	 * 
	 * @param atributo Representa o atributo a ser resgatado
	 * 
	 * @return Retorna o atributo buscado em forma de String
	 * */
	public String getInfoBluray(String atributo) {
		String saida = "";
		if ("nome".equals(atributo.toLowerCase())) {
			saida += this.nome;
		}
		else if ("preco".equals(atributo.toLowerCase())) {
			saida += String.valueOf(this.preco);
		}
		return saida;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Bluray))
			return false;
		Bluray other = (Bluray) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
}
