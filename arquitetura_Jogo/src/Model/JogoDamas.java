package Model;

public class JogoDamas {
    private String matriz;
    private String jogador1;
    private String jogador2;
    
    public JogoDamas(String matriz, String jogador1, String jogador2) {
    	this.matriz = matriz;
    	this.jogador1 = jogador1;
    	this.jogador2 = jogador2;
    }

	public String getMatriz() {
		return matriz;
	}

	public void setMatriz(String matriz) {
		this.matriz = matriz;
	}

	public String getJogador1() {
		return jogador1;
	}

	public void setJogador1(String jogador1) {
		this.jogador1 = jogador1;
	}
	
	public String getJogador2() {
		return jogador2;
	}

	public void setJogador2(String jogador2) {
		this.jogador2 = jogador2;
	}

	public String imprimirTabuleiro() {
		return(jogador1+" - "+matriz+"\n"
				+ "----------------\n"
				+ "  B   B   B   B\n"
				+ "B   B   B   B\n"
				+ "  B   B   B   B\n"
				+ "\n"
				+ "\n"
				+ "P   P   P   P\n"
				+ "  P   P   P   P\n"
				+ "P   P   P   P\n"
				+ "  P   P   P   P\n"
				+ "----------------\n"
				
				+jogador2+" - ");
	}
}