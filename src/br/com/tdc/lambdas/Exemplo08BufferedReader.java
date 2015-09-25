package br.com.tdc.lambdas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exemplo08BufferedReader {

	public static void main(String[] args) {
		try {
			new Exemplo08BufferedReader().readFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void readFile() throws IOException {
		readOneLine();
		readTwoLine();
		//main...
		readLine(BufferedReader::readLine);
		readLine((br) -> br.readLine() + br.readLine());
	}

	private String readOneLine() throws IOException {
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(getClass().getClassLoader()
						.getResourceAsStream("document.txt")))) {
			return br.readLine();
		}
	}

	private String readTwoLine() throws IOException {
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(getClass().getClassLoader()
						.getResourceAsStream("document.txt")))) {
			return br.readLine();
		}
	}

	private String readLine(BufferedReaderProcessor p) throws IOException {
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(getClass().getClassLoader()
						.getResourceAsStream("document.txt")))) {
			return p.process(br);
		}
	}

	@FunctionalInterface
	public interface BufferedReaderProcessor {
		String process(BufferedReader br) throws IOException;
	}
}
