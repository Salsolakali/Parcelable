package com.example.fernana6.pacelable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.fernana6.pacelable.Persona.Persona;

public class MostrarActivity extends AppCompatActivity {

    TextView tvName, tvSurname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar);

        tvName = findViewById(R.id.tvName);
        tvSurname = findViewById(R.id.tvSurname);

        Intent intent = this.getIntent();
        Persona persona = intent.getParcelableExtra("señor");

        tvName.setText(persona.getNombre());
        tvSurname.setText(persona.getApellido());
    }
}
