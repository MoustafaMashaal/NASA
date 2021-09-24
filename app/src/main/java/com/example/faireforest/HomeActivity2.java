package com.example.faireforest;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class HomeActivity2 extends AppCompatActivity {
ImageView imageView;
Button bt1 ,bt2,bt3 ,bt4;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);
        imageView=(ImageView)findViewById(R.id.image_location1);
        bt1=findViewById(R.id.history);
        bt2=findViewById(R.id.today);
        bt3=findViewById(R.id.exten);
        bt4=findViewById(R.id.emper);



        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeActivity2.this,MapActivity2.class);
                startActivity(intent);
            }
        });

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeActivity2.this,HistoryActivity2.class);
                startActivity(intent);
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeActivity2.this,TodayActivity2.class);
                startActivity(intent);
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeActivity2.this,ExtanstionActivity.class);
                startActivity(intent);
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(HomeActivity2.this,EmaprgenActivity.class);
                startActivity(intent);
            }
        });

    }

    }