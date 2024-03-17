package perfil;
import java.util.Date;

abstract class Pessoa {
	
	protected int cpf;
	protected String nome;
	protected int telefone;
	protected Date dtNasc;
	protected String genero;
	
	protected Pessoa () {
		
	}
	
	protected Pessoa(int cpf, String nome, int telefone, Date dtNasc, String genero) {
		this.cpf = cpf;
		this.nome = nome;
		this.telefone = telefone;
		this.dtNasc = dtNasc;
		this.genero = genero;
	}


	public int getCpf() {
		return cpf;
	}


	public void setCpf(int cpf) {
		this.cpf = cpf;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	//arrumar um jeito de formatar a data
	public Date getDtNasc() {
		return dtNasc;
	}


	public void setDtNasc(Date dtNasc) {
		this.dtNasc = dtNasc;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	
	
}
