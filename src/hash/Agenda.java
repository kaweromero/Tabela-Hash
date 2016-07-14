package hash;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.swing.JOptionPane;

public class Agenda {

	private ArrayList<LinkedList<Contato>> agenda = new ArrayList<LinkedList<Contato>>();

	public Agenda() {

		for (int i = 0; i < 26; i++) {
			
			LinkedList<Contato> lista = new LinkedList<Contato>();
			agenda.add(lista);
		}
	}

	public void inserirContato(Contato contato) {
		try {
			int indice = this.calculaHash(contato);
			agenda.get(indice).add(contato);
			
			//LinkedList<Contato> lista = this.agenda.get(indice);
			//lista.add(contato);
			

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao inserir contato, inicie o nome com letra maiuscula");
		}
	}

	private int calculaHash(Contato contato) {
		return contato.nome.toLowerCase().charAt(0) % 26;
	}
	
	public List<Contato> pegaTodas() {
		  List<Contato> contatos = new ArrayList<Contato>();

		  for (int i = 0; i < this.agenda.size(); i++) {
		    contatos.addAll(this.agenda.get(i));
		  }

		  return contatos;
		}

}
