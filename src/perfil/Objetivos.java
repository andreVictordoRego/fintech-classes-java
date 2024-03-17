package perfil;

import java.util.Date;

public class Objetivos {

	
	private int idObjetivo;
	private String nome;
	private Date dtInicial, dtFinal, dtDeposito;
	private Double vlObjetivo;
	private Double vlAtual;
	private String periodicidade;
	
	
	public Objetivos() {
		
	}


	public Objetivos(int idObjetivo, String nome, Date dtInicial, Date dtFinal, Double vlObjetivo, Double vlAtual,
			String periodicidade) {
		this.setIdObjetivo(idObjetivo);
		this.setNome(nome);
		this.setDtInicial(dtInicial);
		this.setDtFinal(dtFinal);
		this.setVlObjetivo(vlObjetivo);
		this.setVlAtual(vlAtual);
		this.setPeriodicidade(periodicidade);
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


	public Double getVlAtual() {
		return vlAtual;
	}


	public void setVlAtual(Double vlAtual) {
		this.vlAtual = vlAtual;
	}


	public String getPeriodicidade() {
		return periodicidade;
	}


	public void setPeriodicidade(String periodicidade) {
		this.periodicidade = periodicidade;
	}
			
	public Date getDtFinal() {
		return dtFinal;
	}


	public void setDtFinal(Date dtFinal) {
		this.dtFinal = dtFinal;
	}

																																	
	public Date getDtDeposito() {
		return dtDeposito;
	}


	public void setDtDeposito(Date dtDeposito) {
		this.dtDeposito = dtDeposito;
	}


	public void cadastrarObjetivo(int idObjetivo, String nome,Date dtInicial,Date dtFinal, Double vlObjetivo, Double vlAtual, String periodicidade) {
		this.setIdObjetivo(idObjetivo);
		this.setNome(nome);
		this.setDtInicial(dtInicial);
		this.setDtFinal(dtFinal);
		this.setVlObjetivo(vlObjetivo);
		this.setVlAtual(vlAtual);
		this.setPeriodicidade(periodicidade);
		
	}

   public void depositarObjetivo(Double valor, Date dtDeposito) {
	   this.setVlAtual(this.vlAtual += valor);
	   this.setDtDeposito(dtDeposito);
    }
   
   public void editarObjetivo(String nome,Date dtFinal, Double vlObjetivo, Double vlAtual, String periodicidade){
	   this.setNome(nome);
	   this.setDtFinal(dtFinal);
	   this.setVlObjetivo(vlObjetivo);
	   this.setVlAtual(vlAtual);
	   this.setPeriodicidade(periodicidade);
   }
   
   public String concluir (){
	   if(this.vlAtual >= this.vlObjetivo) {		   
       return "Objetivo concluído!";
	   }
	   else{
	   return "Fail!";
	   }
	   
   }
	
   public void consultar(String nome) {
	   this.setNome(nome);
	   
   }
   
   public void deletar(int idObjetivo, String nome, Date dtInicial, Date dtFinal, Double vlObjetivo, Double vlAtual, String periodicidade) {
	   this.setIdObjetivo(0);
		this.setNome(null);
		this.setDtInicial(null);
		this.setDtFinal(null);
		this.setVlObjetivo(null);
		this.setVlAtual(null);
		this.setPeriodicidade(null);
   }
	   
}
  
 
