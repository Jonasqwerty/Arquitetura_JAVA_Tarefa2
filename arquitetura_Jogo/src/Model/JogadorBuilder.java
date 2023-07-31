package Model;

public class JogadorBuilder {
	private String Nome;
	private String CorDasPecas;
    private String jogador1;
    private String jogador2;
	
	public JogadorBuilder setNome(String Nome) {
		this.Nome = Nome;
		return this;
	}
	
	public JogadorBuilder setCorDasPecas(String CorDasPecas) {
		this.CorDasPecas = CorDasPecas;
		return this;
	}
	
	public JogadorBuilder setjogador1(String jogador1) {
		this.jogador1 = jogador1;
		return this;
	}
	
	public JogadorBuilder setjogador2(String jogador2) {
		this.jogador2 = jogador2;
		return this;
	}
	
	public Jogador build() {
		return new Jogador(Nome, CorDasPecas, jogador1, jogador2);
	}

}
