package hash;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		Agenda agend = new Agenda();
		Contato con1 = new Contato();
		Contato con2 = new Contato();
		Contato con3 = new Contato();
		 List<Contato>contatos;
		
		
		con1.setNome("Abacate");
		con1.setEmail("boibandido@gmail.com");
		con1.setEmail("arrozdeleite@gmail.com");
		con1.setTelefones(839876543);
		con1.setTelefones(839999999);
		
		con3.setNome("Benoura");
		con3.setEmail("tesouradas@gmail.com");
		con3.setEmail("chocolate@gmail.com");
		con3.setTelefones(836666666);
		con3.setTelefones(837777777);
		
		con2.setNome("Cenoura");
		con2.setEmail("tesouradas@gmail.com");
		con2.setEmail("chocolate@gmail.com");
		con2.setTelefones(836666666);
		con2.setTelefones(837777777);
		
		agend.inserirContato(con1);
		agend.inserirContato(con2);
		agend.inserirContato(con3);
		
		
		contatos=agend.pegaTodas();
		System.out.println(contatos.get(1).getNome());
		

	}

}
