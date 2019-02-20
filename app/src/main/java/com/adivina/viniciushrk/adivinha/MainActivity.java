package com.adivina.viniciushrk.adivinha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button botaoJogar;
    private TextView textoResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoJogar = (Button) findViewById(R.id.botaojogarid);
        textoResultado = (TextView) findViewById(R.id.resultadoid);

        //textoResultado.setText("Texto alterado");
        botaoJogar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                Random randomico = new Random();

                int numeroAleatorio = randomico.nextInt(11);

                textoResultado.setText("número escolhido: " + numeroAleatorio);
            }
        });


    }
}
