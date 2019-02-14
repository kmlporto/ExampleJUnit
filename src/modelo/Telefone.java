package modelo;


public class Telefone {
	String numero;
	Pessoa dono;
	
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public Pessoa getDono() {
		return dono;
	}
	public void setDono(Pessoa dono) {
		this.dono = dono;
	}
	@Override
	public String toString() {
		return "Telefone [numero=" + numero + ", dono=" + dono + "]";
	}
	public Telefone(String numero, Pessoa dono) {
		super();
		this.numero = numero;
		this.dono = dono;
	}
	public Telefone(String numero) {
		super();
		this.numero = numero;
	}
}
