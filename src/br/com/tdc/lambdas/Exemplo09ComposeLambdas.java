package br.com.tdc.lambdas;

import java.io.IOException;
import java.util.function.Predicate;

import br.com.tdc.model.Jogador;
import br.com.tdc.model.enums.Posicao;

public class Exemplo09ComposeLambdas {

	public static void main(String[] args) {
		try {
			new Exemplo09ComposeLambdas().readFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void readFile() throws IOException {
		Predicate<Jogador> filter = (Jogador j) -> Posicao.ATACANTE.equals(j
				.getPosicao());
		filter.and((Jogador j) -> Posicao.ATACANTE.equals(j.getPosicao()))
				.or((Jogador j) -> Posicao.MEIO_CAMPO.equals(j.getPosicao()))
				.and((Jogador j) -> j.getNome().startsWith("C"));
	}
}
