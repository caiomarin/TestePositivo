package com.example.testepositivo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Calculadora Lógica");
    }

    public void Calcular(View v){
        EditText in1 = (EditText) findViewById(R.id.txtInput1);
        EditText in2 = (EditText) findViewById(R.id.txtInput2);
        TextView resultado = (TextView) findViewById(R.id.txtResultado);
        TextView txtResultado = (TextView) findViewById(R.id.textResultado);
        txtResultado.setVisibility(View.VISIBLE);

                // Pega o valor do radiobutton selecionado
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.rdGroup);
        int radio = radioGroup.getCheckedRadioButtonId();

        // Pega o valor dos inputs
        String input1 = in1.getText().toString().trim();
        String input2 = in2.getText().toString().trim();

        // Verifica tamanho das inputs. Se for diferente, iguala com 0 a esquerda.
        int tamanhoStringMaior = StringUtils.verificaTamanhoDaMaiorInput(input1, input2);
        Log.i("CHECK1", ""+ tamanhoStringMaior);
        input1 = StringUtils.aplicaTamanho(input1, tamanhoStringMaior);
        input2 = StringUtils.aplicaTamanho(input2, tamanhoStringMaior);
        Log.i("CHECK", ""+ input1);
        Log.i("CHECK", ""+ input2);

        // Verifica qual radiobutton está selecionado e executa o calculo
        if (radio == R.id.rbOr) resultado.setText(CalculadoraUtils.or(input1,input2));
        else if (radio == R.id.rbXor) resultado.setText(CalculadoraUtils.xor(input1, input2));
    }


}