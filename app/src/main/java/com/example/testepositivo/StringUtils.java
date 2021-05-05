package com.example.testepositivo;

public class StringUtils {

    // Função: Aplica 0 a esquerda conforme tamanho esperado
    public static String aplicaTamanho(String input, int tamanho) {
        if (input.length() == tamanho) return input;
        else{

            // Cria a string com quantidade X de 0s
            String acrescentar = "";
            for (int i = 0; i < tamanho - input.length(); i++) {
                acrescentar += "0";
            }

            // Retorna 0s + string original
            return acrescentar + input;
        }
    }

    // Função: Verifica e retorna o tamanho da maior string
    public static int verificaTamanhoDaMaiorInput(String input1, String input2) {
        if (input1.length() > input2.length()){
            return input1.length();
        } else return input2.length();
    }
}
