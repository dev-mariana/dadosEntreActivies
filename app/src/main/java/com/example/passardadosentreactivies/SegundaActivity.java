package com.example.passardadosentreactivies;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {

    private TextView tvIdade;
    private TextView tvSituacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        tvIdade = findViewById(R.id.tvIdade);
        tvSituacao = findViewById(R.id.tvSituacao);

        //Recuperar os dados que foram enviados pela intent
        Bundle dados = getIntent().getExtras();
        int idade = dados.getInt("idadeInserida");

        //Inserindo a idade recuperada da Intent pelo Bundle na TextView.
        tvIdade.setText(String.valueOf(idade));

        //Verificar se a idade informada é maior ou menor de idade
        if(idade < 18) {
            tvSituacao.setText("Você é menor de idade!");
        }

        else {
            tvSituacao.setText("Vocé é maior de idade!");
        }
    }
}