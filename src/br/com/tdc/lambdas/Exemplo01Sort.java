package br.com.tdc.lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import br.com.tdc.model.Jogador;
import br.com.tdc.model.enums.Posicao;
import br.com.tdc.model.listas.Listas;

public class Exemplo01Sort {

	public static void main(String[] args) {
		ArrayList<Jogador> listaJogadores = new ArrayList<>(
				Listas.listaDeAtletas);
		ArrayList<Jogador> listaAtacantes = new ArrayList<>();

		// Java 6
		for (Jogador atletas : listaJogadores) {
			if (Posicao.ATACANTE.equals(atletas.getPosicao())) {
				listaAtacantes.add(atletas);
			}
		}
		Collections.sort(listaAtacantes, new Comparator<Jogador>() {
			@Override
			public int compare(Jogador a1, Jogador a2) {
				return a1.getNome().compareTo(a2.getNome());
			}
		});
		for (Jogador atletas : listaAtacantes) {
			System.out.println(atletas);
		}

		// Java 8
		listaJogadores.removeIf(atleta -> !Posicao.ATACANTE.equals(atleta
				.getPosicao()));
		listaJogadores.sort((a1, a2) -> a1.getNome().compareTo(a2.getNome()));
		listaJogadores.forEach(System.out::println);

		// Java 8
		listaJogadores.removeIf(jogador -> !Posicao.ATACANTE.equals(jogador
				.getPosicao()));
		listaJogadores.sort(Comparator.comparing(Jogador::getNome));
		listaJogadores.forEach(System.out::println);

		// Java 8 - Streams
		listaJogadores
				.stream()
				.filter(jogador -> Posicao.ATACANTE.equals(jogador.getPosicao()))
				.sorted(Comparator.comparing(Jogador::getNome))
				.forEach(System.out::println);

		// Java 8 - Streams
		listaJogadores
				.parallelStream()
				.filter(jogador -> Posicao.ATACANTE.equals(jogador.getPosicao()))
				.sorted(Comparator.comparing(Jogador::getNome))
				.forEach(System.out::println);

	}
}