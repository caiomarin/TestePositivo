package com.example.testepositivo;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void verificaTamanhoInput1Maior(){
        int tamanho = StringUtils.verificaTamanhoDaMaiorInput("123456789", "123");
        assertEquals(9,tamanho);
    }

    @Test
    public void verificaTamanhoInput2Maior(){
        int tamanho = StringUtils.verificaTamanhoDaMaiorInput("1234", "1234567");
        assertEquals(7,tamanho);
    }

    @Test
    public void verificarValorOr(){
        String resultado = CalculadoraUtils.or("FF","FA");
        assertEquals("FF",resultado);
    }

    @Test
    public void verificarValorXor(){
        String resultado = CalculadoraUtils.xor("FF","FA");
        assertEquals("05",resultado);
    }

    @Test
    public void verificarValorXorBytes(){
        byte[] input1 = CalculadoraUtils.hexStringToByteArray("FF");
        byte[] input2 = CalculadoraUtils.hexStringToByteArray("FA");
        String resultado = CalculadoraUtils.xor(input1, input2);
        assertEquals("05",resultado);
    }

    @Test
    public void aplicaTamanhoString(){
        // Testando a inserção de 3x o 0 na esquerda da String
        assertEquals("000123456789", StringUtils.aplicaTamanho("123456789", 12));
    }
}