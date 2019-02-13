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
	public void setTelefones(ArrayList<Telefone> telefones) {
		this.telefones = telefones;
	}
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", telefones=" + telefones + "]";
	}
	public Pessoa(String nome, ArrayList<Telefone> telefones) {
		super();
		this.nome = nome;
		this.telefones = telefones;
	}
	
}
