package areaTestes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import perfil.CartaoCredito;

public class ClasseTeste4 {

	public static void main(String[] args) {
		
		 Date dataLancamento = null;
	        String dataString = "28/03/1991";
	        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
	        try {
	            dataLancamento = formatoData.parse(dataString);
	           // System.out.println(dataLancamento);
	        } catch (ParseException e) {
	            e.printStackTrace();
	        }
		
		
		CartaoCredito cartao1 = new CartaoCredito();
		cartao1.cadastrarCartaoCredito("CartaoNubank", 1, 312321, "credito", dataLancamento, dataLancamento, dataLancamento, 999999.0, 92319.0, "senha");
		
		
		System.out.println(cartao1.consultarCartaoCredito("apelido"));
		cartao1.setLimiteTotal(99999999.0);
		cartao1.setLimiteDispo(98823.0);
		
		System.out.println(cartao1.consultarCartaoCredito("apelido"));
	}
}