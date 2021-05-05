package com.example.testepositivo;

public class CalculadoraUtils {

    // Função: OR
    public static String or(String hexaDecimalInput1, String hexaDecimalInput2) {
        byte[] bKey = hexStringToByteArray(hexaDecimalInput1);
        byte[] bValue = hexStringToByteArray(hexaDecimalInput2);
        byte[] bResult = new byte[bKey.length];

        // Operador lógico do Or: |
        for (int i = 0; i < bKey.length; i++) {
            bResult[i] = (byte) (bKey[i] | bValue[i]);
        }
        return bytesToHexString(bResult);
    }

    // Função: XOR (entrada hexadecimal)
    public static String xor(String hexaDecimalInput1, String hexaDecimalInput2) {
        byte[] bKey = hexStringToByteArray(hexaDecimalInput1);
        byte[] bValue = hexStringToByteArray(hexaDecimalInput2);

        // chama função de xor bytes
        return xor(bKey, bValue);
    }

    // Função: XOR (entrada de bytes)
    public static String xor(byte[] input1, byte[] input2) {
        byte[] bResult = new byte[input1.length];

        // Operador lógico do Xor: ^
        for (int i = 0; i < input1.length; i++) {
            bResult[i] = (byte) (input1[i] ^ input2[i]);
        }
        return bytesToHexString(bResult);
    }

    // Função: Converte bytes[] para Hexadecimal
    public static String bytesToHexString(byte[] src) {
        StringBuilder stringBuilder = new StringBuilder("");
        if (src == null || src.length <= 0) {
            return null;
        }
        for (byte aSrc : src) {
            int v = aSrc & 0xFF;
            String hv = Integer.toHexString(v);
            if (hv.length() < 2) {
                stringBuilder.append(0);
            }
            stringBuilder.append(hv.toUpperCase());
        }
        return stringBuilder.toString();
    }

    // Função: Converte Hexadecima para bytes[]
    public static byte[] hexStringToByteArray(String s) {
        int len = s.length();
        byte[] data = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4)
                    + Character.digit(s.charAt(i+1), 16));
        }
        return data;
    }
}
