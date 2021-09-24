package com.example.faireforest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    Button sBtn ;
    Spinner dropdown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dropdown = findViewById(R.id.spinner1);

        sBtn = findViewById(R.id.strat);
        sBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,HomeActivity2.class);
                startActivity(intent);
            }
        });



        String[] items = new String[]{"North America", "Australia", "Europe"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);

        dropdown.setAdapter(adapter);

    }
}