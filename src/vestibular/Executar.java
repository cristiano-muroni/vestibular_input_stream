package vestibular;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;


public class Executar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Candidato candidato = null;
		List<Candidato> candidatos = new ArrayList<Candidato>();
		
		
		

		try {
			FileOutputStream arquivo = new FileOutputStream("resposta.txt");
			PrintWriter pr = new PrintWriter(arquivo);

			for (int i = 0; i < 3; i++) {
				candidato = new Candidato();
				System.out.println("digite o nome");
				candidato.setNome(sc.nextLine());
				System.out.println("digite o id");
				candidato.setNumero(Integer.valueOf(sc.nextLine()));

				

				//.println(candidato.getNome());

				Avaliacao avaliacao = null;

				for (int j = 0; j < 1; j++) {

					avaliacao = new Avaliacao();
					System.out.println("digite todas as letras da prova");
					avaliacao.setTeste(sc.nextLine());

					candidato.getAvaliacoes().add(avaliacao);
				}
				
				candidatos.add(candidato);
				pr.println(candidato.getNome() + candidato.getAvaliacoes().toString());
				

			}

			/*
			 * pr.println("cristiano aaaaaaaabbbbbbbcccccccdddddddeeeeeee;");
			 * pr.println("nathalia aaaaaaaabbbbbbbcccccccdddddddeeeeeee;");
			 * pr.println("iraci aaaaaaaabbbbbbbcccccccdddddddeeeeeee;");
			 */

			pr.close();
			arquivo.close();

			System.out.println("prova escrita com sucesso!");

		} catch (Exception e) {
			System.out.println("erro ao escrever arquivo!");
		}

		try {
			FileInputStream arquivo = new FileInputStream("resposta.txt");
			InputStreamReader input = new InputStreamReader(arquivo);
			BufferedReader br = new BufferedReader(input);

			String linha = "";

			do {
				linha = br.readLine();
				if (linha != null) {
					String[] palavras = linha.split(";");

					System.out.println("=======================   *    ========================");
					for (int i = 0; i < palavras.length; i++) {
						System.out.println("palavras lida = " + palavras[i]);

					}

				}

			} while (linha != null);

		} catch (Exception e) {
			System.out.println("erro ao ler o arquivo!");
		}
		
		

		sc.close();

	}

}
