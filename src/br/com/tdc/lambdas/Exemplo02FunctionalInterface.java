package br.com.tdc.lambdas;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.Function;

import br.com.tdc.model.Jogador;
import br.com.tdc.model.listas.Listas;

public class Exemplo02FunctionalInterface {

	public static void main(String[] args) {
		ArrayList<Jogador> listaJogadores = new ArrayList<>(
				Listas.listaDeAtletas);

		BiFunction<Double, Double, Boolean> imcNormal = (peso, altura) -> {
			return peso / (altura * altura) >= 18.5
					&& peso / (altura * altura) <= 25;
		};
		if (imcNormal.apply(120.0, 1.74)) {
			// Fluxo IMC Normal
		} else {
			// Fluxo IMC Alterado
		}
		System.out.println(imcNormal.apply(120.0, 1.74));

		Function<Jogador, Integer> idadeAnos = (jogador) -> {
			return Period.between(jogador.getDataNascimento(), LocalDate.now())
					.getYears();
		};

		System.out.println(idadeAnos.apply(listaJogadores.stream().findAny()
				.get()));
	}
}