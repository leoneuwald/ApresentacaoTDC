package br.com.tdc.lambdas;

import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import br.com.tdc.model.Equipe;
import br.com.tdc.model.Jogador;
import br.com.tdc.model.enums.Posicao;
import br.com.tdc.model.listas.Listas;

public class Exemplo06MethodReference {
	private static ArrayList<Jogador> listaJogadores = new ArrayList<>(
			Listas.listaDeAtletas);

	public static void main(String[] args) {
		Consumer<String> consumer = null;
		consumer = (String s) -> System.out.println(s);
		consumer = System.out::println;

		// Método estático
		Function<String, Integer> toInt = Integer::valueOf;
		System.out.print(toInt.apply("10")); // Imprime 10
		Function<String, Integer> toInt2 = (String valor) -> Integer
				.valueOf(valor);

		// Construtor
		BiFunction<String, String, Equipe> build = Equipe::new;
		BiFunction<String, String, Equipe> build2 = (nomeCompleto, nome) -> new Equipe(
				nomeCompleto, nome);

		Equipe barcelona = build.apply("Futbol Club Barcelona", "Barcelona");

		// Método de instancia
		BinaryOperator<String> concater = String::concat;
		String result = concater.apply("Lam", "bda");
		System.out.println(result);// Imprime Lambda

		BinaryOperator<String> concater2 = (String str2, String str1) -> str1
				.concat(str2);

		// Método de um objeto em particular
		listaJogadores.stream().findAny().get();
		Jogador jogador = new Jogador("Lionel Messi", Posicao.ATACANTE);
		Supplier<Posicao> pos = jogador::getPosicao;
		System.out.println(pos.get());

		Supplier<Posicao> pos2 = () -> jogador.getPosicao();

	}
}