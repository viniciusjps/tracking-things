package itens;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Inventario {
	private List<Item> itensOrdenados;
	
	public Inventario() {
		itensOrdenados = new ArrayList<>();
	}

	public void adicionaItens(ArrayList<Item> todosItens) {
		itensOrdenados.clear();
		itensOrdenados.addAll(todosItens);
	}
	
	public void ordenaNome() {
		Collections.sort(itensOrdenados, new OrdemAlfabeticaComparator());
	}
	
	public void ordenaValor() {
		Collections.sort(itensOrdenados, new OrdemPorValorComparator());
	}
	
	public String listarItensOrdenadosPorNome() {
		ordenaNome();
		return listaItensString();
	}
	
	public String listarItensOrdenadosPorValor() {
		ordenaValor();
		return listaItensString();
	}
	
	public String listaItensString() {
		String saida = "";
		for (Item item : itensOrdenados) {
			saida += item.toString() + "|";
		} 
		return saida;
	}
}
