package perfil;
import java.util.Date;

public class Usuario extends Pessoa {
	
	private int idUsuario;
	private String status;
	private String email;
	private String senha;
	private String perfilInvestidor;
	
	public Usuario() {
		
	}
	
	// Verificar como o Java pode gerar automaticamente o idUsuario
	// Verificar como editar (override) o retorno do objeto Date
	public Usuario(int idUsuario, String status, String email, String senha, int cpf, String nome, int telefone, Date dtNasc, String genero) {
		super.setCpf(cpf);
		super.setNome(nome);
		super.setTelefone(telefone);
		super.setDtNasc(dtNasc);
		super.setGenero(genero);
		this.idUsuario = idUsuario;
		this.status = status;
		this.email = email;
		this.senha = senha;	
	}

	
	public String getPerfilInvestidor() {
		return perfilInvestidor;
	}

	public void setPerfilInvestidor(String perfilInvestidor) {
		this.perfilInvestidor = perfilInvestidor;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public void cadastrarUser(int idUsuario, String status, String email, String senha, String perfilInvestidor, int cpf, String nome, int telefone, Date dtNasc, String genero) {
		super.setCpf(cpf);
		super.setNome(nome);
		super.setTelefone(telefone);
		super.setDtNasc(dtNasc);
		super.setGenero(genero);
		this.setIdUsuario(idUsuario);
		this.setStatus(status);
		this.setEmail(email);
		this.setSenha(senha);
		this.setPerfilInvestidor(perfilInvestidor);
	}
	
	public void editarUser(int idUsuario, String email, String senha, String perfilInvestidor, int cpf, String nome, int telefone, Date dtNasc, String genero) {
		super.setCpf(cpf);
		super.setNome(nome);
		super.setTelefone(telefone);
		super.setDtNasc(dtNasc);
		super.setGenero(genero);
		this.setEmail(email);
		this.setSenha(senha);
		this.setPerfilInvestidor(perfilInvestidor);
	}
	
	public void desativarUser(int idUsuario, String status) {
		//vericacao no banco de dados idUsuario e status
		if (status != "inativo") {
			this.setStatus("inativo");
		}
	}
	
	public void ativarUser(int idUsuario, String status, String email, String senha) {
		//verificacao no banco de dados de email e senha
		if (status != "ativo") {
			this.setStatus("ativo");
		}
	}
	
	// Pesquisar o metodo correto para exclusao de objeto
	public void deletarUser(int idUsuario, String senha) {
		super.setCpf(0);
		super.setDtNasc(null);
		super.setGenero(null);
		super.setNome(null);
		super.setTelefone(0);
		this.setStatus(null);
		this.setEmail(null);
		this.setSenha(null);
		this.setPerfilInvestidor(null);
	}

	public String desconectarApp() {
		//Pesquisar o metodo correto para desconexão
		return "Desconectado";
	}
	
}
