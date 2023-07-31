package Model;

public class JogoBuilder {
    private String matriz;
    private String jogador1;
    private String jogador2;
    
    public JogoBuilder setMatriz(String matriz) {
    	this.matriz = matriz;
    	return this;
    }
    
    public JogoBuilder setJogador1(String jogador1) {
    	this.jogador1 = jogador1;
    	return this;
    }
    
    public JogoBuilder setJogador2(String jogador2) {
    	this.jogador2 = jogador2;
    	return this;
    }
    
    
    public JogoDamas build() {
    	return new JogoDamas(matriz, jogador1, jogador2);
    }
    
}