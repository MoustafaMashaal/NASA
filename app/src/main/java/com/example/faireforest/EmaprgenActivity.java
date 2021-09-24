package com.example.faireforest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EmaprgenActivity extends AppCompatActivity {

    Button ampulance , fire , degreeBurn ,bt5,safe ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emaprgen);

        ampulance = findViewById(R.id.call_Ambulance);
        fire = findViewById(R.id.call_Fire_fighting);

        bt5=findViewById(R.id.check);
        safe=findViewById(R.id.safe);

        ampulance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "1 877-703-6411"));
                startActivity(intent);
            }
        });

        fire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + "1 877-703-6411"));
                startActivity(intent);
            }
        });

        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                startActivity(intent);

            }
        });

        safe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                startActivity(intent);

            }
        });


    }
}