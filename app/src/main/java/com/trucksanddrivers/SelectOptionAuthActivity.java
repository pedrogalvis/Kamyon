package com.trucksanddrivers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SelectOptionAuthActivity extends AppCompatActivity {

    Button mButtonIniciar;
    Button mButtonRegistrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_option_auth);

        //Obtiene referencia al Botón en el layout
        mButtonIniciar = findViewById(R.id.btnIniSes);
        // Obtén referencia al Botón de Registrarse en el layout
        mButtonRegistrar = findViewById(R.id.btnRegis);

        //Configura el evento de click para el Botón
        mButtonIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { goToLoginActivity();
            //Aqui es donde se muestra como abrir otra actividad o realizar alguna operación
                //Tambien como abrir el RegisterActivity
             }
        });
    // Configura el evento de click para el Botón de Registrarse
        mButtonRegistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Aqui es donde se muestra como abrir otra actividad o realizar alguna operación
                //Tambien como abrir el RegisterActivity
                goToRegisterActivity();
                }
        });
    }

    private void goToLoginActivity() {
        Intent intent = new Intent(SelectOptionAuthActivity.this, LoginActivity.class);
        startActivity(intent);
    }

    private void goToRegisterActivity() {
        Intent intent = new Intent(SelectOptionAuthActivity.this, RegisterActivity.class);
        startActivity(intent);
    }
}
