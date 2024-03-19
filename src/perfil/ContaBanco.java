package perfil;

public class ContaBanco extends Conta{
	
	private String idBanco;
	private int agencia;
	private String tipo;
	
	public ContaBanco() {
		
	}
	
	public ContaBanco(String apelido, String idBanco, int numero, int agencia, String senhaApp, String tipo, Double saldo, boolean lancamentoAuto) {
        super();
		this.apelido = apelido;
        this.idBanco = idBanco;
        this.numero = numero;
        this.agencia = agencia;
        this.senhaApp = senhaApp;
        this.tipo = tipo;
        this.saldo = saldo;
        this.lancamentoAuto = lancamentoAuto;
    }

	
	
	public String getIdBanco() {
		return idBanco;
	}

	public void setIdBanco(String idBanco) {
		this.idBanco = idBanco;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void cadastrarContaBanco(int idContaBanco, String apelido, String idBanco, int numero, int agencia, String senhaApp, String tipo, Double saldo){
		this.setIdBanco(idBanco);
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
	
	public void editarContaBanco(String apelido, String idBanco, int numero, int agencia, String senhaApp, String tipo, Double saldo) {
		this.setLancamentoAuto(true);
		this.setApelido(apelido);
		this.setIdBanco(idBanco);
		this.setNumero(numero);
		this.setAgencia(agencia);
		this.setSenhaApp(senhaApp);
		this.setTipo(tipo);
		this.setSaldo(saldo);
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
