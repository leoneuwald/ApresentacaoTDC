package br.com.tdc.lambdas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.function.ToIntBiFunction;

import br.com.tdc.model.Jogador;
import br.com.tdc.model.listas.Listas;

public class Exemplo03TypeChecking {
	private static ArrayList<Jogador> listaJogadores = new ArrayList<>(
			Listas.listaDeAtletas);

	public static void main(String[] args) {
		// TypeChecking
		Comparator<Jogador> c1 = (a1, a2) -> a1.getNome().compareTo(
				a2.getNome());
		ToIntBiFunction<Jogador, Jogador> c2 = (a1, a2) -> a1.getNome()
				.compareTo(a2.getNome());

		BiFunction<Jogador, Jogador, Integer> c3 = (a1, a2) -> a1.getNome()
				.compareTo(a2.getNome());

		// Object o = (a1, a2) -> a1.getNome().compareTo(a2.getNome());

		testTypeChecking(c1);

		// testTypeChecking(c2);

		// testTypeChecking(c3);

		testTypeChecking((a1) -> a1.getNome().startsWith("N"));

		// testTypeChecking((a1, a2) -> a1.getNome().compareTo(a2.getNome()));

	}

	private static void testTypeChecking(Comparator<Jogador> comp) {
		listaJogadores.sort(comp);
	}

	private static void testTypeChecking(Predicate<Jogador> pre) {
		pre.test(listaJogadores.stream().findAny().get());
	}

	private static void testTypeChecking(
			BiFunction<Jogador, Jogador, Integer> biFunction) {
		Jogador jogador = listaJogadores.stream().findAny().get();
		Jogador jogador2 = listaJogadores.stream().findAny().get();
		biFunction.apply(jogador2, jogador);
	}
}