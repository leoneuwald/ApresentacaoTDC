package br.com.tdc.lambdas;

import java.util.ArrayList;
import java.util.Comparator;

import br.com.tdc.model.Jogador;
import br.com.tdc.model.listas.Listas;

public class Exemplo07MethodReferenceRealAction {
	private static ArrayList<Jogador> listaJogadores = new ArrayList<>(
			Listas.listaDeAtletas);

	public static void main(String[] args) {
		listaJogadores.sort(Comparator.comparing(Jogador::getNome)
				.thenComparing(Jogador::getPosicao)
				.thenComparing(Jogador::getDataNascimento));
	}
}