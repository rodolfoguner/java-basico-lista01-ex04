package br.fai.ex04;

public class Main {
	public static void main(String[] args) {
		Main app = new Main();
		app.start();
	}
	
	private void start(){
		int i = 0;
		while (i < 20) {
			i += 1;
			System.out.println("Valor i: " + i);
		}
	}
}
