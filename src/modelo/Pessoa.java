package modelo;

import java.util.ArrayList;

public class Pessoa {
	String nome;
	ArrayList<Telefone> telefones = new ArrayList<Telefone>();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<Telefone> getTelefones() {
		return telefones;
	}

	public void adicionar(Telefone telefone) {
		telefones.add(telefone);
	}
	public void remover(Telefone telefone) {
		telefones.remove(telefone);
	}
	
	@Override
	public String toString() {
		return "Pessoa \n nome: " + nome +  (telefones != null ? " telefones: " + telefones : "sem telefone");
	}
	public Pessoa(String nome) {
		super();
		this.nome = nome;
	}
	public Pessoa(String nome, Telefone telefone) {
		super();
		this.telefones.add(telefone);
	}
	
}
