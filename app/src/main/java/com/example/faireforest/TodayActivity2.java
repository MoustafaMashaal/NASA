package com.example.faireforest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TodayActivity2 extends AppCompatActivity
{
    EditText wind , humidity , tem ;
    Button checkk,drougtMap,wildFire,surface;
    TextView waarning , near , safe ;


    String get_wind , get_humidity , get_temp ;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_today2);

        wind = findViewById(R.id.wind_percentage);
        humidity = findViewById(R.id.rain_percentage);
        tem = findViewById(R.id.temp_percentage);


        checkk = findViewById(R.id.check);
        waarning = findViewById(R.id.warning);
        near = findViewById(R.id.nearRisk);
        safe = findViewById(R.id.safe);
        wildFire = findViewById(R.id.wildfire);
        drougtMap = findViewById(R.id.droughtMap);
             surface=findViewById(R.id.surface);




        checkk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                near.setVisibility(View.GONE);
                waarning.setVisibility(View.GONE);
                safe.setVisibility(View.GONE);

                get_wind = wind.getText().toString();
                get_humidity = humidity.getText().toString();
                get_temp = tem.getText().toString();

                float humidity_per = Float.parseFloat(get_humidity);
                float wind_per = Float.parseFloat(get_wind);
                float temp_per = Float.parseFloat(get_temp);



                if ( wind_per >= 0 && wind_per <= 29 && humidity_per >15 && temp_per >=0&& temp_per <=39 )
                {
                    safe.setVisibility(View.VISIBLE);

                }
                else if (wind_per >= 30 && wind_per <= 39 && humidity_per >10 &&humidity_per <15 && temp_per >=40&& temp_per <=45)
                {
                    near.setVisibility(View.VISIBLE);

                }
                else
                {
                    waarning.setVisibility(View.VISIBLE);
                }
            }
        });
        wildFire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(TodayActivity2.this,WiredFaireActivity.class);
                startActivity(intent);

            }
        });
        drougtMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(TodayActivity2.this,DroughtActivity2.class);
                startActivity(intent);
            }
        });
surface.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent=new Intent(TodayActivity2.this,SurfaceActivity.class);
        startActivity(intent);

    }
});


    }
}