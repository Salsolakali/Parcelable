package com.example.fernana6.pacelable;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.fernana6.pacelable.Persona.Persona;

public class MainActivity extends AppCompatActivity {

    EditText name, surname;
    Button btnShow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        surname =findViewById(R.id.surname);
        btnShow = findViewById(R.id.btnShow);

        btnShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Persona persona = new Persona(name.getText().toString(), surname.getText().toString());

                Intent intent = new Intent(MainActivity.this, MostrarActivity.class);
                intent.putExtra("señor", (Parcelable) persona);
                startActivity(intent);
            }
        });
    }
}
