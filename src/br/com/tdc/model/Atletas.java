package br.com.tdc.model;

import java.time.LocalDate;

public class Atletas {
	private String nome;
	private Double peso;
	private LocalDate dataNascimento;
	private Double altura;

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
		return "Nome=" + nome + ", Peso=" + peso + ", Nascimento=" + dataNascimento + ", Altura=" + altura;
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

	public Atletas(String nome, Double peso, LocalDate dataNascimento, Double altura) {
		super();
		this.nome = nome;
		this.peso = peso;
		this.dataNascimento = dataNascimento;
		this.altura = altura;
	}
}