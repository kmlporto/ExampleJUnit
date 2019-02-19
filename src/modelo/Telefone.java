package modelo;

import java.util.ArrayList;
import java.util.List;

public class Telefone {
	private int numero;
	private Pessoa dono;
	// Pessoas que tem este número nos seus contatos
	private List<Pessoa> pessoas;
	
	
	public Telefone(int numero) {
		super();
		this.numero = numero;
		this.pessoas = new ArrayList<>(); 
	}
	
	public int getNumero() {
		return numero;
	}
	public Pessoa getDono() {
		return dono;
	}
	
	public void setDono(Pessoa p) {
		this.dono = p;
	}
	
	public List<Pessoa> getPessoas() {
		return pessoas;
	}
	
	public void adicionar (Pessoa p) {
		this.pessoas.add(p);
	}

	@Override
	public String toString() {
		return "Telefone [numero=" + numero + ", dono=" + dono + "]";
	}
	
}
