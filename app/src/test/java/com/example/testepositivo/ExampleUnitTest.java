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
    public void verificaTamanhoDaStringQuandoInput1ForMaior(){
        int tamanho = StringUtils.verificaTamanhoDaMaiorInput("123456789", "123");
        assertEquals(9,tamanho);
    }

    @Test
    public void verificaTamanhoDaStringQuandoInput2ForMaior(){
        int tamanho = StringUtils.verificaTamanhoDaMaiorInput("1234", "1234567");
        assertEquals(7,tamanho);
    }

    @Test
    public void verificarValorFuncaoOr(){
        String resultado = CalculadoraUtils.or("FF","FA");
        assertEquals("FF",resultado);
    }

    @Test
    public void verificarValorFuncaoXor(){
        String resultado = CalculadoraUtils.xor("FF","FA");
        assertEquals("05",resultado);
    }

    @Test
    public void verificarValorFuncaoXorBytes(){
        byte[] input1 = CalculadoraUtils.hexStringToByteArray("FF");
        byte[] input2 = CalculadoraUtils.hexStringToByteArray("FA");
        String resultado = CalculadoraUtils.xor(input1, input2);
        assertEquals("05",resultado);
    }

    @Test
    public void validaQuantidadeDe0naString(){
        // Testando a inserção de 3x o 0 na esquerda da String
        assertEquals("000123456789", StringUtils.aplicaTamanho("123456789", 12));
    }
}