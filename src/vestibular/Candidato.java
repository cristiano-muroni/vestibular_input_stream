package vestibular;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Candidato implements Comparable<Candidato> {
	private String nome;
	private int numero = 0;
	private String respostas;
	private int totalAcertos;
	private List<Avaliacao> avaliacoes = new ArrayList<Avaliacao>();
	
	
	
	@Override
    public int hashCode() {
        return Objects.hash(numero);
    }
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Candidato candidato = (Candidato) o;
        return numero == candidato.numero;
	}
	public String getRespostas() {
		return respostas;
	}
	public void setRespostas(String respostas) {
		this.respostas = respostas;
	}
	public int getTotalAcertos() {
		return totalAcertos;
	}
	public void setTotalAcertos(int totalAcertos) {
		this.totalAcertos = totalAcertos;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Avaliacao> getAvaliacoes() {
		return avaliacoes;
	}
	public void setAvaliacoes(List<Avaliacao> avaliacoes) {
		this.avaliacoes = avaliacoes;
	}
	@Override
    public int compareTo(Candidato o) {
        if(this.totalAcertos> o.totalAcertos) {
            return -1;
        }if(this.totalAcertos< o.totalAcertos) {
            return  1;
        }
        return 0;
    }
	@Override
	public String toString() {
		return "Candidato [nome=" + nome + ", numero=" + numero + ", respostas=" + respostas + ", totalAcertos="
				+ totalAcertos + ", avaliacoes=" + avaliacoes + "]";
	}
	
	
	

}
