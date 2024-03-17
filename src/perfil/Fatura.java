package perfil;

import java.util.Date;

public class Fatura {
	
	//ATRIBUTOS
	private int idFatura;
	private Date dtVenc;
	private Double vlTotal;
	
	//CONSTRUTORES
	public Fatura() {
	}

	public Fatura(int idFatura, Date dtVenc, Double vlTotal) {
		super();
		this.idFatura = idFatura;
		this.dtVenc = dtVenc;
		this.vlTotal = vlTotal;
	}

	
	//GETTERS AND SETTERS
	public int getIdFatura() {
		return idFatura;
	}

	public void setIdFatura(int idFatura) {
		this.idFatura = idFatura;
	}

	public Date getDtVenc() {
		return dtVenc;
	}

	public void setDtVenc(Date dtVenc) {
		this.dtVenc = dtVenc;
	}

	public Double getVlTotal() {
		return vlTotal;
	}

	public void setVlTotal(Double vlTotal) {
		this.vlTotal = vlTotal;
	}

	
	//verificar o que ele vai mostrar
	public void consultar(int idFatura) {	
	}
	
	public void informarPag(double vlTotal, Date dtVenc) {
		this.vlTotal = vlTotal;
		this.dtVenc = dtVenc;
	}
	
}
