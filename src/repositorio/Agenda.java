package repositorio;

import java.util.ArrayList;
import java.util.List;

import modelo.Pessoa;
import modelo.Telefone;

public class Agenda {
	
	private List<Pessoa> pessoas = new ArrayList<>();
	private List<Telefone> telefones = new ArrayList<>();
	
	
	public List<Pessoa> getPessoas() {
		return pessoas;
	}
	
	public List<Telefone> getTelefones() {
		return telefones;
	}
	
	public void add (Pessoa pessoa) {
		this.pessoas.add(pessoa);
	}
	
	public void add (Telefone telefone) {
		this.telefones.add(telefone);
	}
	
	public Telefone pesquisarTelefone (String numeroTelefone) {
		for (Telefone t: this.telefones)
			if (t.getNumero().equals(numeroTelefone))
				return t;
		return null;
	}
	
	public Pessoa pesquisarPessoa (String nome) {
		for (Pessoa p: this.pessoas)
			if (p.getNome().equals(nome))
				return p;
		return null;
	}
	
	public Pessoa pesquisarDono (String numeroTelefone) {
		for (Telefone t: this.telefones)
			if (t.getNumero().equals(numeroTelefone))
				return t.getDono();
		return null;
	}
	
}
