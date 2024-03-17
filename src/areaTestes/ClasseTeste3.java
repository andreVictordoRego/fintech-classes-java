package areaTestes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import perfil.ContaInvest;



public class ClasseTeste3 {

	public static void main(String[] args) {
		 Date dataLancamento = null;
	        String dataString = "28/03/1991";
	        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
	        try {
	            dataLancamento = formatoData.parse(dataString);
	            System.out.println(dataLancamento);
	        } catch (ParseException e) {
	            e.printStackTrace();
	        }

	        ContaInvest conta1 = new ContaInvest();
	        
	        conta1.cadastrarContaInvest(1, "Economia", "Produto1", "BancoXYZ", "EmissorUVW", dataLancamento, 103.20, 3.4, 99.6, 3.2, "Descricao Padrao");
	
	        System.out.println(conta1.consultarContaInvest(1));
	        
	        conta1.deletarContaInvest(1);
	        
	        System.out.println(conta1.consultarContaInvest(1));
	       

	}

}
