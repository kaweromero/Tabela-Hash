package hash;

import java.util.ArrayList;

public class Contato {

	ArrayList<Integer>telefones= new ArrayList<Integer>();
	ArrayList<String>emails = new ArrayList<String>();
	String nome;
	
	public void getTelefones() {
		
		for(int i = 0; i < telefones.size(); i++) {
            System.out.println(telefones.get(i));
        }
	}
	public void getEmail() {
		
		for(int i = 0; i < emails.size(); i++) {
            System.out.println(emails.get(i));
        }
		
	}
	public void setTelefones(int telefone) {
		this.telefones.add(telefone);
	}
	
	public void setEmail(String email) {
		this.emails.add(email);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
