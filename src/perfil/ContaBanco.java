package perfil;

public class ContaBanco {
	
	private String apelido;
	private String idBanco;
	private int numero;
	private int agencia;
	private String senhaApp;
	private String tipo;
	private Double saldo;
	private boolean lancamentoAuto;
	
	public ContaBanco() {
		
	}
	
	public ContaBanco(String apelido, String idBanco, int numero, int agencia, String senhaApp, String tipo, Double saldo, boolean lancamentoAuto) {
		this.setApelido(apelido);
		this.setIdBanco(idBanco);
		this.setNumero(numero);
		this.setAgencia(agencia);
		this.setSenhaApp(senhaApp);
		this.setTipo(tipo);
		this.setSaldo(saldo);
		this.setLancamentoAuto(lancamentoAuto);
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public String getIdBanco() {
		return idBanco;
	}

	public void setIdBanco(String idBanco) {
		this.idBanco = idBanco;
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

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public boolean isLancamentoAuto() {
		return lancamentoAuto;
	}

	public void setLancamentoAuto(boolean lancamentoAuto) {
		this.lancamentoAuto = lancamentoAuto;
	}
	
	public void cadastrarContaBanco(String apelido, String idBanco, int numero, int agencia, String senhaApp, String tipo, Double saldo){
		this.setLancamentoAuto(true);
		this.setApelido(apelido);
		this.setIdBanco(idBanco);
		this.setNumero(numero);
		this.setAgencia(agencia);
		this.setSenhaApp(senhaApp);
		this.setTipo(tipo);
		this.setSaldo(saldo);
	}
	
	public void cadastrarContaBanco(String apelido, String idBanco, String tipo, Double saldo){
		this.setLancamentoAuto(false);
		this.setApelido(apelido);
		this.setIdBanco(idBanco);
		this.setTipo(tipo);
		this.setSaldo(saldo);
	}
	
	public String consultarContaBanco(String apelido) {
		return "Apelido: " + apelido + "Agência: " + agencia + "Número: " + numero + "Tipo da conta: " + tipo + "Saldo: " + saldo;
	}
	
	public void deletarContaBanco(String apelido) {
		this.setApelido(null);
		this.setIdBanco(null);
		this.setNumero(0);
		this.setAgencia(0);
		this.setSenhaApp(null);
		this.setTipo(null);
		this.setSaldo(0.0);
		
	}
	
	

}
