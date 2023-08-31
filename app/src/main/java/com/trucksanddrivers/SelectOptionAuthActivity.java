package com.trucksanddrivers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SelectOptionAuthActivity extends AppCompatActivity {

    Button mButtonIniciar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_option_auth);

        //Obtiene referencia al Botón en el layout
        mButtonIniciar = findViewById(R.id.btnIniSes);

        //Configura el evento de click para el Botón
        mButtonIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { goToRegisterActivity();
            //Aqui es donde se muestra como abrir otra actividad o realizar alguna operación
                //Tambien como abrir el RegisterActivity
            }
        });

    }
    private void goToRegisterActivity() {
        Intent intent = new Intent(SelectOptionAuthActivity.this, RegisterActivity.class);
        startActivity(intent);
    }
}