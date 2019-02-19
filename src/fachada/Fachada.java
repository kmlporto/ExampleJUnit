package fachada;

import java.util.List;

import modelo.Pessoa;
import modelo.Telefone;
import repositorio.Agenda;

public class Fachada {

	private static Agenda agenda = new Agenda();
	
	public static Pessoa cadastrarPessoa (String nome, int numeroTelefone) {
//		Telefone t = agenda.pesquisarTelefone(numeroTelefone);
//		if (t != null)
//			throw new Exception("Numero de telefone vinculado a outra pessoa");
		Telefone telefone = new Telefone(numeroTelefone);
		Pessoa pessoa = new Pessoa(nome, telefone);
		telefone.setDono(pessoa);
		agenda.add(pessoa);
		agenda.add(telefone);
		return pessoa;
	}
	
	public static void adicionarContato (Pessoa pessoa, int numeroTelefone) {
		Telefone telefone = agenda.pesquisarTelefone(numeroTelefone);
		pessoa.adicionar(telefone);
		telefone.adicionar(pessoa);
	}
	
	public static boolean verificarExistenciaDeDono (Telefone t) {
		if (t.getDono() == null)
			return false;
		return true;
	}
	
	// Consultas por Pessoa
	
	public static List<Pessoa> listarPessoas () {
		return agenda.getPessoas();
	}

	public static Pessoa pesquisarDono (int numeroTelefone) {
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
	
	public static Telefone pesquisarTelefone (int numeroTelefone) {
		return agenda.pesquisarTelefone(numeroTelefone);
	}
	
	
}
