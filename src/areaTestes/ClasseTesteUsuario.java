package areaTestes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import perfil.Usuario;

public class ClasseTesteUsuario {

	public static void main(String[] args) {
		
		 Date dataNascimento = null;
	        String dataString = "28/03/1991";
	        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
	        try {
	            dataNascimento = formatoData.parse(dataString);
	            System.out.println(dataNascimento);
	        } catch (ParseException e) {
	            e.printStackTrace();
	        }
	       
	        Usuario andre = new Usuario();
	        andre.cadastrarUser(1, "ativo", "andre@bol.com", "1234", "conservador", 1234568, "andre", 11986133, dataNascimento, "masculino");
	        System.out.println(andre.getIdUsuario());
	        System.out.println(andre.getStatus());
	        System.out.println(andre.getEmail());
	        System.out.println(andre.getSenha());
	        System.out.println(andre.getPerfilInvestidor());
	        System.out.println(andre.getCpf());
	        System.out.println(andre.getNome());
	        System.out.println(andre.getTelefone());
	        System.out.println(andre.getDtNasc());
	        System.out.println(andre.getGenero());
	        
	        andre.desativarUser(1, "ativo");
	        System.out.println(andre.getStatus());
	        
	        andre.ativarUser(1, "inativo", "uhauha", "1231");
	        System.out.println(andre.getStatus());
	        
	        andre.deletarUser(1, "1231");
	        System.out.println(andre.getIdUsuario());
	        System.out.println(andre.getStatus());
	        System.out.println(andre.getEmail());
	        System.out.println(andre.getSenha());
	        System.out.println(andre.getPerfilInvestidor());
	        System.out.println(andre.getCpf());
	        System.out.println(andre.getNome());
	        System.out.println(andre.getTelefone());
	        System.out.println(andre.getDtNasc());
	        System.out.println(andre.getGenero());
	        
	        System.out.println(andre.desconectarApp());
	        

	}

}
