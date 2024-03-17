package areaTestes;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import perfil.Bandeira;
import perfil.CartaoCredito;
import perfil.Fatura;

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
		
		
	    Bandeira bandeira1 = new Bandeira();
	    Fatura fatura1 = new Fatura();
		CartaoCredito cartao1 = new CartaoCredito();
		bandeira1.adicionarBandeira(1, "visa");
		fatura1.cadastrarFatura(1, dataLancamento, 1000.0);
		cartao1.cadastrarCartaoCredito("CartaoNubank", 1, 312321, "credito", dataLancamento, dataLancamento, dataLancamento, 999999.0, 92319.0, "senha", bandeira1, fatura1);
		
		System.out.println(cartao1.consultarCartaoCredito("apelido"));
		cartao1.setLimiteTotal(99999999.0);
		cartao1.setLimiteDispo(98823.0);
		cartao1.setBandeira(bandeira1);
		
		System.out.println(cartao1.consultarCartaoCredito("apelido"));
	}
}