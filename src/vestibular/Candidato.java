package vestibular;

import java.util.ArrayList;
import java.util.List;

public class Candidato {
	private String nome;
	private int acerto;

	private List<Avaliacao> avaliacoes = new ArrayList<Avaliacao>();

	public List<Avaliacao> getAvaliacoes() {
		return avaliacoes;
	}

	public void setAvaliacoes(List<Avaliacao> avaliacoes) {
		this.avaliacoes = avaliacoes;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAcerto() {
		return acerto;
	}

	public void setAcerto(int acerto) {
		this.acerto = acerto;
	}

	public int somaCerto() {
		int soma = 0;
		for (Avaliacao avaliacao : avaliacoes) {
			soma += avaliacao.getAcerto();

		}
		return soma;
	}

}
