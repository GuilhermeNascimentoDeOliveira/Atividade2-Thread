package controller;

public class ati2 extends Thread{
	private int[][] matriz;
	private int aux;
	
	public ati2(int[][] matriz, int aux) {
		this.matriz = matriz;
		this.aux = aux;
		
	}
	
	@Override
	public void run() {
			int i = aux;
			int soma = 0;
			for(int j = 0; j < 5; j++) {
			
			 soma = soma + matriz[i][j];
			 
			}
			System.out.println("Linha " + (i+1) + " - Resultado = " + soma);
		
	}
	
}
