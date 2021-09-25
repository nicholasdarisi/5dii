package Model;
//prova
public class Data {

	private int numero;
	private int tentativi;

	public Data() {
		// TODO Auto-generated constructor stub
		this.numero = numero;
		this.tentativi = 5;

	}

	public int getNumero() {
		return numero;
	}

	public int getTentativi() {
		return tentativi;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void genera_n () {
		//numero = (int)(Math.random()*20);
		numero = 12;
	}

	public int inc_tent () {
		return tentativi++;
	}

	public int dec_tent () {
		return tentativi--;
	}

	public void res_tent () {
		tentativi = 0;
	}

	public int check (int n) {
		if (numero == n) return 1;
		if (numero > n) return 2;
		return 0;



	}

}
