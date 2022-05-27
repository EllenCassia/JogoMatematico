import java.util.Scanner;

public class ProgramaJogoMatematico {

    public static void main(String[] args) {
        boolean acabou = false;
        int qtdAcerto = 0;
        int qtdTentativas = 0;

        while (!acabou){
            Scanner leitor = new Scanner(System.in);

            JogoMatematico jogo = new JogoMatematico();
            jogo.sortearCalculo();
            System.out.println(jogo.getConta());
            int resultado = Integer.parseInt(leitor.nextLine());
            boolean verificacao = jogo.checarResposta(resultado);

            if (verificacao) {
                System.out.println("resposta correta");
                qtdAcerto++;
            }else {
                System.out.println("resposta errada, resposta certa: " + jogo.getResposta());
                qtdTentativas++;
            }

            if (qtdTentativas == 3) {
                acabou = true;
            }

        }
        System.out.println("Você acertou: " + qtdAcerto);
    }
}
