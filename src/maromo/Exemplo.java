package maromo;

public class Exemplo {

	public static void main(String[] args) {
	       //um string Gabarito
	        //um vetor de Respostas de dois candidatos
	        String gabarito = "abcdeabcdeabcdeabcdeabcdeabcdeabcdeabcdeabcdeabcde";
	        //simulei 50 acertos para o candidato 1 e 10 para o candidato 2
	        String[] respostas = new String [2];
	        respostas[0] = "abcdeabcdeabcdeabcdeabcdeabcdeabcdeabcdeabcdeabcde";
	        respostas[1] = "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb";
	        //acertos de dois candidatos
	        int[] acertos = new int[2];
	        for (int i = 0; i < 2; i++) {
	            //outro for para cada respostas (50 no meu exemplo)
	            for (int j = 0; j < 50; j++) {
	                if(gabarito.charAt(j) == respostas[i].charAt(j)){
	                    //acertos do candidato comparado
	                    acertos[i]++;
	                }
	            }
	        }
	        System.out.println("Canditado 1 acertou: " + acertos[0]);
	        System.out.println("Canditado 2 acertou: " + acertos[1]);
	    }
}
