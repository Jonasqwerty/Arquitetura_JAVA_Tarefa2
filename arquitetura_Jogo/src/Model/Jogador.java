package Model;

public class Jogador {
	private String Nome;
	private String CorDasPecas;
	private String jogador1;
    private String jogador2;
	
	public Jogador(String Nome, String CorDasPecas, String jogador1, String jogador2) {
		this.Nome = Nome;
		this.CorDasPecas = CorDasPecas;
		this.jogador1 = jogador1;
		this.jogador2 = jogador2;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getCorDasPecas() {
		return CorDasPecas;
	}

	public void setCorDasPecas(String corDasPecas) {
		CorDasPecas = corDasPecas;
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
}