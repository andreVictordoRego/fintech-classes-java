package perfil;

public class ContaPerfil {
	
	private double saldo;
	private double vlEntrada;
	private double vlSaida;
	private double vlInvestimento;
	
	public ContaPerfil (){
		
	}

	public ContaPerfil(double saldo, double vlEntrada, double vlSaida, double vlInvestimento) {
		this.saldo = saldo;
		this.vlEntrada = vlEntrada;
		this.vlSaida = vlSaida;
		this.vlInvestimento = vlInvestimento;
	}
	
	
	public double exibirSaldo() {
		double a = 100+30;
		return a;
	}
	
	public double somatoriaEntrada() {
		double a = 100+10;
		return a;
	}
	
	public double somatoriaSaida() {
		double a = 100+20;
		return a;
	}
	
	public double exibirSaldoInvestimento() {
		double a = 100+90;
		return a;
	}
}
