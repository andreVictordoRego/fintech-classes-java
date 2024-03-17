package perfil;

import java.util.Date;

public class Objetivos {

	
	private int idObjetivo;
	private String nome;
	private Date dtInicial;
	private Double vlObjetivo;
	private Double vlAtual;
	private String periodicidade;
	
	
	public Objetivos() {
		
	}


	public Objetivos(int idObjetivo, String nome, Date dtInicial, Double vlObjetivo, Double vlAtual,
			String periodicidade) {
		this.idObjetivo = idObjetivo;
		this.nome = nome;
		this.dtInicial = dtInicial;
		this.vlObjetivo = vlObjetivo;
		this.vlAtual = vlAtual;
		this.periodicidade = periodicidade;
	}


	public int getIdObjetivo() {
		return idObjetivo;
	}


	public void setIdObjetivo(int idObjetivo) {
		this.idObjetivo = idObjetivo;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Date getDtInicial() {
		return dtInicial;
	}


	public void setDtInicial(Date dtInicial) {
		this.dtInicial = dtInicial;
	}


	public Double getVlObjetivo() {
		return vlObjetivo;
	}


	public void setVlObjetivo(Double vlObjetivo) {
		this.vlObjetivo = vlObjetivo;
	}


	public Double getvlAtual() {
		return vlAtual;
	}


	public void setVlInicial(Double vlAtual) {
		this.vlAtual = vlAtual;
	}


	public String getPeriodicidade() {
		return periodicidade;
	}


	public void setPeriodicidade(String periodicidade) {
		this.periodicidade = periodicidade;
	}
	
	public void cadastrar(int idObjetivo, String nome, Date dtInicial, Double vlObjetivo, Double vlAtual, String periodicidade) {
		this.idObjetivo = idObjetivo;
		this.nome = nome;
		this.dtInicial = dtInicial;
		this.vlObjetivo = vlObjetivo;
		this.vlAtual = vlAtual;
		this.periodicidade = periodicidade;
	}
	
	public void depositar(double valor) {
		this.vlAtual += valor;
	}
	
	public void editar(int idObjetivo, String nome, Date dtInicial, Double vlObjetivo, Double vlAtual, String periodicidade) {
		this.idObjetivo = idObjetivo;
		this.nome = nome;
		this.dtInicial = dtInicial;
		this.vlObjetivo = vlObjetivo;
		this.vlAtual = vlAtual;
		this.periodicidade = periodicidade;
	}
	
	//Verificar o metodo com o time
	public boolean concluir() {
		if(this.vlObjetivo >= this.vlAtual){
			//Identificar no app a conclusao do objetivo
			return true;
		} else {
			return false;
		}
	}
	
	//Verificar o metodo com o time
	public void consultar(String nome) {
	
	}
	
	//Verificar o metodo com o time
	public void deletar(String nome) {
		this.idObjetivo = 0;
		this.nome = null;
		this.dtInicial = null;
		this.vlObjetivo = null;
		this.vlAtual = null;
		this.periodicidade = null;
	}
}

