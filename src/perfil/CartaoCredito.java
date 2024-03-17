package perfil;

public class CartaoCredito {
	
	//ATRIBUTOS
	private String idBanco; //verificar se é String ou INT
	private String nome;
	private int numero;
	private int agencia;
	private String senhaApp;
	private String tipo;
	private Double saldo;
	private boolean lacamentoAuto;
	
	//CONSTRUTORES
	public CartaoCredito() {
	}

	public CartaoCredito(String idBanco, String nome, int numero, int agencia, String senhaApp, String tipo,
			Double saldo, boolean lacamentoAuto) {
		super();
		this.idBanco = idBanco;
		this.nome = nome;
		this.numero = numero;
		this.agencia = agencia;
		this.senhaApp = senhaApp;
		this.tipo = tipo;
		this.saldo = saldo;
		this.lacamentoAuto = lacamentoAuto;
	}

	//GETTERS AND SETTERS
	
	public String getIdBanco() {
		return idBanco;
	}

	public void setIdBanco(String idBanco) {
		this.idBanco = idBanco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public String getSenhaApp() {
		return senhaApp;
	}

	public void setSenhaApp(String senhaApp) {
		this.senhaApp = senhaApp;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Double getSaldo() {
		return saldo;
	}

	//VERIFICAR SE TEM QUE TIRAR
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public boolean isLacamentoAuto() {
		return lacamentoAuto;
	}

	public void setLacamentoAuto(boolean lacamentoAuto) {
		this.lacamentoAuto = lacamentoAuto;
	}
	
	
	//QUAL PARAMETRAO PASSAR PARA DELETAR O CARTÃO?
	public void deletar(int numero) {
		this.idBanco = null;
		this.nome = null;
		this.numero = 0;
		this.agencia = 0;
		this.senhaApp = null;
		this.tipo = null;
		this.saldo = null;
		this.lacamentoAuto = false;
	}
	
	
	
	

}
