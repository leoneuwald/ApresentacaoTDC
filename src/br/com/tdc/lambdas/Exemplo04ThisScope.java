package br.com.tdc.lambdas;

import java.util.ArrayList;
import java.util.Comparator;

import br.com.tdc.model.Jogador;
import br.com.tdc.model.listas.Listas;

public class Exemplo04ThisScope {
	private static ArrayList<Jogador> listaJogadores = new ArrayList<>(
			Listas.listaDeAtletas);
	private String scope = "class";

	public void testThisScope() {
		// Print classScope
		Comparator<Jogador> c1 = (a1, a2) -> {
			String scope = "lambda";
			System.out.println(this.scope);
			return a1.getNome().compareTo(a2.getNome());
		};
		listaJogadores.sort(c1);

		// Print innerClassScope
		listaJogadores.sort(new Comparator<Jogador>() {
			String scope = "anonymous";

			@Override
			public int compare(Jogador o1, Jogador o2) {
				System.out.println(this.scope);
				return o1.getNome().compareTo(o2.getNome());
			}
		});
	}

	public static void main(String[] args) {
		new Exemplo04ThisScope().testThisScope();
	}
}