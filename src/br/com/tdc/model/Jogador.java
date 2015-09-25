package br.com.tdc.model;

import java.time.LocalDate;

import br.com.tdc.model.enums.Posicao;

public class Jogador {
	private String nome;
	private Double peso;
	private LocalDate dataNascimento;
	private Double altura;
	private Posicao posicao;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPeso() {
		return peso;
	}

	@Override
	public String toString() {
		return "Nome=" + nome + ", Peso=" + peso + ", Nascimento="
				+ dataNascimento + ", Altura=" + altura;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Jogador(String nome, Double peso, LocalDate dataNascimento,
			Double altura, Posicao posicao) {
		super();
		this.nome = nome;
		this.peso = peso;
		this.dataNascimento = dataNascimento;
		this.altura = altura;
		this.posicao = posicao;
	}

	public Jogador(String nome, Posicao posicao) {
		super();
		this.nome = nome;
		this.posicao = posicao;
	}

	public Posicao getPosicao() {
		return posicao;
	}

	public void setPosicao(Posicao posicao) {
		this.posicao = posicao;
	}
}