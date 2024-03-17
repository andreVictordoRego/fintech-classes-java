package perfil;

public class Bandeira {

	//ATRIBUTOS
	private int idBandeira;
	private String nome;
	
	
	public Bandeira() {

	}
	
	public Bandeira(int idBandeira, String nome) {
		this.idBandeira = idBandeira;
		this.nome = nome;
	}
	
	public int getIdBandeira() {
		return idBandeira;
	}
	public void setIdBandeira(int idBandeira) {
		this.idBandeira = idBandeira;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void adicionarBandeira(int idBandeira, String nome) {
		this.setIdBandeira(idBandeira);
		this.setNome(nome);
	}
	
	public void editarBandeira(String nome) {
		this.setNome(nome);
	}
	
	public void deletarBandeira(String nome) {
		this.setNome(null);
	}
}
