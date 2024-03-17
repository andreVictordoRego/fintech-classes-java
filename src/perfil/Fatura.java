package perfil;

import java.util.Date;

public class Fatura {
	
	private int idFatura;
	private Date dtVenc;
	private Double vlTotal;
	
	public Fatura() {
	}

	public Fatura(int idFatura, Date dtVenc, Double vlTotal) {
		this.idFatura = idFatura;
		this.dtVenc = dtVenc;
		this.vlTotal = vlTotal;
	}

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


	public String consultarFatura(int idFatura) {	
		return "Data de Vencimento da Fatura: " + dtVenc + "\nValor Total da Fatura: " + vlTotal;
	}
	
	public String informarPag(double vlTotal, Date dtVenc) {
		
		boolean validacao = true;
		if (validacao == true) {
			return "Pagamento efetuado";
		}
		return null;
	}
	
}
