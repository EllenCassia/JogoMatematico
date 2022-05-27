

public class JogoMatematico {

    private String calculo;
    private int resposta;

    public int getResposta() {
        return resposta;
    }

    public void setConta(String conta) {
        this.calculo = conta;
    }

    public String getConta() {
        return calculo;
    }

    public void setResposta(int resposta) {
        this.resposta = resposta;
    }

    public void sortearCalculo(){

        int n1 = (int)(Math.random()*101);
        int n2 = (int)(Math.random()*101);
        String[] sinal = { "+","-", "*", "/"};
        String operadorSorteado = sinal[(int)(Math.random()* 4)];

        switch (operadorSorteado){
            case "+":
                resposta = n1 + n2;
                break;
            case "-":
                resposta = n1 - n2;
                break;
            case "*":
                resposta = n1 * n2;
                break;
            case "/":
                resposta = n1 / n2;
        }
        calculo = n1+ operadorSorteado +n2;
    }

    public boolean checarResposta(int resultadoDaPessoa){
        return resposta == resultadoDaPessoa;
    }

}
