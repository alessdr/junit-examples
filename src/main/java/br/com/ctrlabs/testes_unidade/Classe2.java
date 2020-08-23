package br.com.ctrlabs.testes_unidade;

public class Classe2 {

	public int fatorial(int n) {
		int r = 1;
		
		for (int t=n; t>=1; t--) {
			r*=t;
		}
		
		return r;
	}
}
