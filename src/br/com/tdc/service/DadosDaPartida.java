package br.com.tdc.service;

import java.util.List;

import br.com.tdc.model.Partida;

public class DadosDaPartida {

	public static void main(String[] args) {

		List<Partida> partidas = new CarregarPartidas().getPartidas();

		publicoTotalNoCampeonato(partidas);
		
		rendaTotalNoCampeonato(partidas);
		
		// Stream<Gol> gols = partidas.stream().flatMap(p ->
		// p.getGols().stream());
		//
		// gols.forEach(System.out::println);
		//
		//
		//
		// System.out.println(partidas.stream().mapToLong(Partida::getId).count());
	}

	private static void publicoTotalNoCampeonato(List<Partida> partidas) {
		System.out.println("Público total do campeonato");

		long publico = partidas.stream()
				.mapToLong(Partida::getPublico)
				.sum();
		
		System.out.println(publico);
		
		System.out.println("");
	}

	private static void rendaTotalNoCampeonato(List<Partida> partidas) {
		System.out.println("Renda total do campeonato");

		double renda = partidas.stream()
				.mapToDouble(Partida::getRenda)
				.sum();
		
		System.out.println(renda);
		
		System.out.println("");		
	}
	
}
