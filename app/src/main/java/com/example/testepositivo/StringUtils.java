package com.example.testepositivo;

public class StringUtils {

    public static String aplicaTamanho(String input, int tamanho) {
        if (input.length() == tamanho) return input;
        else{
            // Acrescenta 0 a esquerda do input, para deixar igual.
            String acrescentar = "";
            for (int i = 0; i < tamanho - input.length(); i++) {
                acrescentar += "0";
            }
            return acrescentar + input;
        }
    }

    public static int verificaTamanhoDaMaiorInput(String input1, String input2) {
        if (input1.length() > input2.length()){
            return input1.length();
        } else return input2.length();
    }
}
