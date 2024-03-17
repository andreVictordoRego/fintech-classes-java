package areaTestes;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import perfil.Categoria;
import perfil.LancamentoManual;

public class ClasseTeste2 {

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
		
		LancamentoManual lanc1 = new LancamentoManual();
		Categoria categoria1 = new Categoria();
		categoria1.cadastrarCategoria(1, "Lazer", "Saída");
		lanc1.cadastrarLancamento(1, "escola", dataLancamento, 100.0, "dinheiro", "a vista", "saida", "mensal", categoria1);

		System.out.println(lanc1.getIdLancamento());
		System.out.println(lanc1.getDescricao());
		System.out.println(lanc1.getData());
		System.out.println(lanc1.getVlLancanmento());
		System.out.println(lanc1.getMetodoPagto());
		System.out.println(lanc1.getCondPag());
		System.out.println(lanc1.getTipo());
		System.out.println(lanc1.getPeriodicidade());
		System.out.println(lanc1.getCategoria().toString());
		
		System.out.println(lanc1.consultarLancamento(1));
		
		lanc1.editarLancamento("faculdade", dataLancamento, 1000.0, "cartão", "parcelado", "anual", categoria1);
		System.out.println(lanc1.consultarLancamento(1));
		
		lanc1.deletarLancamento(1);
		System.out.println(lanc1.consultarLancamento(1));
		
		
		
		
		
		
		
		
		
	}

	
}
