package testes;

import fachada.Fachada;
import junit.framework.TestCase;
import modelo.Pessoa;

public class PessoaTest extends TestCase {

	private Pessoa pessoa;
	
	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
		pessoa = Fachada.cadastrarPessoa("Fabrício", 87654321);
	}
	
	
	// Verificar se o número de telefone foi vinculado a esse Cliente
    public void testAssertEquals() {
		int numeroTelefone = 87654321;
		assertEquals(numeroTelefone, pessoa.getMeuTelefone().getNumero());
    }
	
}
