package fachada;

import java.util.List;

import modelo.Pessoa;
import modelo.Telefone;
import repositorio.Agenda;

public class Fachada {

	private static Agenda agenda = new Agenda();
	
	public static Pessoa cadastrarPessoa (String nome, String numeroTelefone) {
		Telefone telefone = new Telefone(numeroTelefone);
		Pessoa pessoa = new Pessoa(nome, telefone);
		telefone.setDono(pessoa);
		agenda.add(pessoa);
		agenda.add(telefone);
		return pessoa;
	}
	
	public static void adicionarContato (Pessoa pessoa, String numeroTelefone) {
		Telefone telefone = agenda.pesquisarTelefone(numeroTelefone);
		pessoa.adicionar(telefone);
		telefone.adicionar(pessoa);
	}
	
	// Consultas por Pessoa
	
	public static List<Pessoa> listarPessoas () {
		return agenda.getPessoas();
	}

	public static Pessoa pesquisarDono (String numeroTelefone) {
		return agenda.pesquisarDono(numeroTelefone);
	}
	
	public static Pessoa pesquisarPessoa (String nome) {
		return agenda.pesquisarPessoa(nome);
	}
	
	// Consultas por Telefone
	
	public static List<Telefone> listarTelefonesPorUsuario (String nome) {
		Pessoa pessoa = agenda.pesquisarPessoa(nome);
		return pessoa.getContatos();
	}
	
	public static List<Telefone> listarTelefones () {
		return agenda.getTelefones();
	}
	public static Telefone pesquisarTelefone (String numeroTelefone) {
		return agenda.pesquisarTelefone(numeroTelefone);
	}
	
	
}
