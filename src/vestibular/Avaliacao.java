package vestibular;

public class Avaliacao implements Comparable<Avaliacao>{
	private String teste;
	
	private String gabarito;

	


	public String getGabarito() {
		return gabarito;
	}

	public void setGabarito(String gabarito) {
		this.gabarito = gabarito;
	}

	public String getTeste() {
		return teste;
	}

	public void setTeste(String teste) {
		this.teste = teste;
	}


	@Override
	public String toString() {
		return "teste=" + teste + "  ---->";
	}

	@Override
	public int compareTo(Avaliacao other) {
	
		return 0;
	}

}
