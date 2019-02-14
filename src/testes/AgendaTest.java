package testes;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertThat;
import org.junit.Test;

import modelo.Pessoa;
import modelo.Telefone;

public class AgendaTest{
	public Telefone telefone = new Telefone("9999999");
	public Pessoa pessoa = new Pessoa("Kamila", telefone);
	
	
	@Test
    public void testTelefoneAdded() {
        assertThat(pessoa.getTelefones(), hasItems(telefone));
    }
	
	@Test
	public void testAssertSame() {
	    Integer aNumber = Integer.valueOf(768);
	    assertSame("should be same", aNumber, aNumber);
	}
}
