package modelo;

import java.util.ArrayList;

public class Pessoa {
	private String nome;
	private ArrayList<Telefone> contatos = new ArrayList<Telefone>();
	private Telefone meuTelefone;
	
	public Pessoa(String nome, Telefone meuTelefone) {
		super();
		this.nome = nome;
		this.meuTelefone = meuTelefone;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}

	public ArrayList<Telefone> getContatos() {
		return contatos;
	}

	public Telefone getMeuTelefone() {
		return meuTelefone;
	}

	public void adicionar (Telefone telefone) {
		this.contatos.add(telefone);
	}
	
}
