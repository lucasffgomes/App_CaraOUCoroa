package com.example.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button buttonJogar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonJogar = findViewById(R.id.buttonJogar);

        buttonJogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intencao = new Intent(getApplicationContext(), ResultadoActivity.class);

                // Passar dados para proxima tela
                int numero = new Random().nextInt(2);  // 0 ou 1

                intencao.putExtra("numero", numero);

                //Toast.makeText(getApplicationContext(), "esse é o numero: " + numero, Toast.LENGTH_SHORT).show();

                //Log.d("randi", String.valueOf(numero));

                startActivity( intencao );

            }
        });

    }
}