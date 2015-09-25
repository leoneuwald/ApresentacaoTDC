package br.com.tdc.lambdas;

public class Exemplo05Final {
	private int port2 = 1010;

	private void exemploFinal() {
		int port = 8080;
		Runnable r = () -> System.out.print(port);
		// porn = 8081;

		Runnable r2 = System.out::println;
		port2 = 9898;
	}

	public static void main(String[] args) {
		new Exemplo05Final().exemploFinal();
	}
}