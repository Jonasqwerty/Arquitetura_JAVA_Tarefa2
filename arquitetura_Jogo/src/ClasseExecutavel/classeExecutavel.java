package ClasseExecutavel;

import Model.JogoBuilder;
import Model.JogoDamas;

public class classeExecutavel {
	public static void main(String[] args) {
		
		JogoDamas jogoDamas = new JogoBuilder().setJogador1("Alex")
	    .setMatriz("branco").setJogador2("Carlos")
		.build();
		
		System.out.println(jogoDamas.imprimirTabuleiro());
		}
}