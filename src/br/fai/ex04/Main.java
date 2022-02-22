package br.fai.ex04;

public class Main {
	public static void main(String[] args) {
		Main app = new Main();
		app.start();
	}
	
	private void start(){
		int i = 0;
		System.out.println("Usando while");
		while (i < 20) {
			i += 1;
			System.out.println("Valor i: " + i);
		}
		System.out.println("Usando do while");
		i = 0;
		do {
			i += 1;
			System.out.println("Valor i: " + i);
		}while (i < 20);
		System.out.println("Usando for");
		for (i = 1; i <= 20; i++) {
			System.out.println("Valor i: " + i);
		}
	}
}
