package testes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import fachada.Fachada;
import modelo.Pessoa;
import modelo.Telefone;

public class AgendaTest{

	private Pessoa kamila = Fachada.cadastrarPessoa("Kamila", 12345678);
	private Pessoa fabricio = Fachada.cadastrarPessoa("Fabrício Liberato", 87654321);
		
	
	@Test
	// Verificar se o número de telefone foi vinculado a esse Cliente
    public void testAssertEquals() {
		int numeroTelefone = 12345678;
		assertEquals(numeroTelefone, kamila.getMeuTelefone().getNumero());
    }
	
	@Test
	// Verificar se o número de telefone não esta vinculado a esse Cliente
    public void testAssertNotEquals() {
		int numeroTelefone = 12345678;
		assertNotEquals(numeroTelefone, fabricio.getMeuTelefone().getNumero());
    }
	
	@Test
	// Verificar se o objeto kamila é igual a monitora
	public void testAssertSame() {
		Pessoa monitora = kamila;
		monitora.setNome("Monitora");
		assertSame(kamila, monitora);
	}
	
	@Test
	// Verificar se o objeto kamila não é igual ao objeto fabricio
	public void testAssertNotSame() {
		assertNotSame(kamila, fabricio);
	}
	
	@Test
	// Verificar se existe ninguem com o numero de telefone especificado
	public void testAssertNull() {
		Pessoa p = Fachada.pesquisarDono(457844544);
		assertNull("should be null", p);
	}
	
	@Test
	// Verificar se existe alguem com o numero de telefone especificado
	public void testAssertNotNull() {
		Pessoa p = Fachada.pesquisarDono(87654321);
		assertNotNull("should not be null", p);
	}
	
	@Test
	// Verificar se telefone não tem dono
	public void testAssertFalse() {
		Telefone t = new Telefone(88954251);
		assertFalse("failure - should be false", Fachada.verificarExistenciaDeDono(t));
	}
	
	@Test
	// Verificar se telefone possui dono
	public void testAssertTrue() {
		assertTrue("failure - should be true", Fachada.verificarExistenciaDeDono(fabricio.getMeuTelefone()));
	}
	
	

}
