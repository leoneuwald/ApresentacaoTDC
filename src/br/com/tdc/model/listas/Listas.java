package br.com.tdc.model.listas;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

import br.com.tdc.model.Jogador;
import br.com.tdc.model.enums.Posicao;

public class Listas {
    public static final List<Jogador> listaDeAtletas = Arrays.asList(
	    new Jogador("SERGIO RAMOS GARCÍA", 75.0, LocalDate.of(1986,
		    Month.MARCH, 30), 1.83, Posicao.LATERAL),
	    new Jogador("MARCELO VIEIRA DA SILVA", 75.0, LocalDate.of(1988,
		    Month.MAY, 12), 1.74, Posicao.LATERAL),
	    new Jogador("CRISTIANO RONALDO DOS SANTOS", 80.0, LocalDate.of(
		    1985, Month.FEBRUARY, 05), 1.85, Posicao.ATACANTE),
	    new Jogador("Neymar da Silva Santos Júnior", 68.0, LocalDate.of(
		    1992, Month.FEBRUARY, 05), 1.74, Posicao.ATACANTE),
	    new Jogador("Javier Alejandro Mascherano", 73.0, LocalDate.of(1984,
		    Month.JUNE, 8), 1.74, Posicao.ZAGUEIRO),
	    new Jogador("Lionel Andrés Messi", 72.0, LocalDate.of(1987,
		    Month.JUNE, 24), 1.70, Posicao.MEIO_CAMPO));
}
