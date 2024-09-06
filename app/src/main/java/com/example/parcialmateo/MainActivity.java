package com.example.parcialmateo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText edt_usuario, edt_contrasena;
    Button btn_ingresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        edt_usuario = findViewById(R.id.edt_usuario);
        edt_contrasena = findViewById(R.id.edt_contrasena);
        btn_ingresar = findViewById(R.id.btn_ingresar);

        btn_ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String textU = edt_usuario.getText().toString();
                String textC = edt_contrasena.getText().toString();

                if (textU.equals("") || textC.equals("")){
                    Toast.makeText(MainActivity.this,"Por favor llenar los campos",Toast.LENGTH_LONG).show();
                } else if (textU.equals("uac123") && textC.equals("12345678")) {
                    Intent i = new Intent(MainActivity.this, Ingresado.class);
                    startActivity(i);
                } else {
                    Toast.makeText(MainActivity.this,"Usuario o contraseña incorrectos",Toast.LENGTH_LONG).show();
                }

            }
        });

    }
}