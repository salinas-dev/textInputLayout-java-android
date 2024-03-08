package com.salinas.textinput;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

     private ImageView boton;
     private  ImageView boton1;
     //Se van a validar
     private TextInputEditText txtEmail;
     private  TextInputEditText txtPass;
     private  TextInputEditText txtEdad;
     private AppCompatButton ButtonCalcular;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton = findViewById(R.id.imageView1);
        boton1 = findViewById(R.id.imageButton);
        //Validar
        txtEdad = findViewById(R.id.editTextEdad);
        txtEmail = findViewById(R.id.editTextEmail);
        txtPass = findViewById(R.id.editTextPassword);
        ButtonCalcular = findViewById(R.id.buttonCalcular);


        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Se van a validar los TextInputLayout(se extraran los datos)
                //getText
                //toString
                //trim se eliminan los espacios
                //length cuenta los caractares
                int edad;

                if (txtEmail.getText().toString().trim().length() == 0) {
                    txtEmail.setError("INGRESE EMAIL");
                } else if (txtPass.getText().toString().trim().length() == 0) {
                    txtPass.setError("INGRESE CONTRASEÑA");
                    //Parea resivir el valor numerico es usando una excepcion
                } else if (txtEdad.getText().toString().length() == 0) {
                    txtEdad.setError("INGRESA LA EDAD");
                    /*Hace un error porque validad un vacio, no puede cambiar un valor nulo a un valor numerico
                    edad = Integer.parseInt(txtEdad.getText().toString());*/
                    //Como es valor numerico se usara un tryc-ath
                    try {
                        edad = Integer.parseInt(txtEdad.getText().toString());
                    } catch (Exception e) {
                        txtEdad.setError("INGEESA LA EDAD");
                    }

                }else{
                    Toast.makeText(getApplicationContext(),
                            "HOLA", Toast.LENGTH_SHORT).show();
                }
            }
        });


        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Toast.makeText(getApplicationContext(),
                        "HOLA", Toast.LENGTH_SHORT).show();*/
            }
        });


        ButtonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
           /*     Toast.makeText(getApplicationContext(),
                        "HOLA", Toast.LENGTH_SHORT).show();*/
            }
        });

    }
}