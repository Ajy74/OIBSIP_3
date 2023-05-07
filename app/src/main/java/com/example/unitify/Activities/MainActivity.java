package com.example.unitify.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.unitify.Activities.Conversion.ResultActivity;
import com.example.unitify.R;

public class MainActivity extends AppCompatActivity {

    TextView bn1,bn2,bn3,bn4,bn5,bn6,bn7,weight;
    CardView weightCard,LengthCard,TempCard,speedCard,timeCard,currencyCard,angleCard,areaCard,volumeCard,storageCard,resolutionCard,transferRateCard,binaryCard,hexrgbCard,rgbhexCard,frequencyCard,resistanceCard,capacitanceCard,voltageCard,currentCard,inductanceCard,pressureCard,energyCard,powerCard,forceCard,magneticCard,radiationCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        bn1 = findViewById(R.id.bn1);
        bn2 = findViewById(R.id.bn2);
        bn3 = findViewById(R.id.bn3);
        bn4 = findViewById(R.id.bn4);
        bn5 = findViewById(R.id.bn5);
        bn6 = findViewById(R.id.bn6);
        bn7 = findViewById(R.id.bn7);

        weightCard = findViewById(R.id.weightCard);
        LengthCard = findViewById(R.id.LengthCard);
        TempCard = findViewById(R.id.TempCard);
        speedCard = findViewById(R.id.speedCard);
        timeCard = findViewById(R.id.timeCard);
        currencyCard = findViewById(R.id.currencyCard);
        angleCard = findViewById(R.id.angleCard);
        areaCard = findViewById(R.id.areaCard);
        volumeCard = findViewById(R.id.volumeCard);

        weight = findViewById(R.id.weight);



//        setting brand name //
        setBrand("U");
//        setting brand name //

        SharedPreferences sp = getSharedPreferences("conversion", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        editor.clear();
        editor.commit();
        liteners();


    }

    private void liteners() {

        weightCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ResultActivity.class);
                SharedPreferences sp = getSharedPreferences("conversion", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sp.edit();
                editor.putString("type", "Weight" );
                editor.commit();
                startActivity(intent);
            }
        });

        LengthCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ResultActivity.class);
                SharedPreferences sp = getSharedPreferences("conversion", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sp.edit();
                editor.putString("type", "Length" );
                editor.commit();
                startActivity(intent);
            }
        });

        TempCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ResultActivity.class);
                SharedPreferences sp = getSharedPreferences("conversion", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sp.edit();
                editor.putString("type", "Temperature" );
                editor.commit();
                startActivity(intent);
            }
        });

        speedCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ResultActivity.class);
                SharedPreferences sp = getSharedPreferences("conversion", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sp.edit();
                editor.putString("type", "Speed" );
                editor.commit();
                startActivity(intent);
            }
        });

        timeCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ResultActivity.class);
                SharedPreferences sp = getSharedPreferences("conversion", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sp.edit();
                editor.putString("type", "Time" );
                editor.commit();
                startActivity(intent);
            }
        });

        currencyCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Comming Soon !", Toast.LENGTH_SHORT).show();
            }
        });

        angleCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Comming Soon !", Toast.LENGTH_SHORT).show();
            }
        });

        areaCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Comming Soon !", Toast.LENGTH_SHORT).show();
            }
        });

        volumeCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Comming Soon !", Toast.LENGTH_SHORT).show();
            }
        });



    }

    private void setBrand(String n) {
       if(n=="U"){
           new Handler().postDelayed(new Runnable() {
               @Override
               public void run() {
                   bn1.setText("U");
                   setBrand("n");
               }
           },300);
       }

        if(n=="n"){
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    bn2.setText("n");
                    setBrand("i");
                }
            },300);
        }

        if(n=="i"){
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    bn3.setText("i");
                    setBrand("t");
                }
            },300);
        }

        if(n=="t"){
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    bn4.setText("t");
                    setBrand("I");
                }
            },300);
        }

        if(n=="I"){
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    bn5.setText("i");
                    setBrand("f");
                }
            },200);
        }

        if(n=="f"){
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    bn6.setText("f");
                    setBrand("y");
                }
            },200);
        }

        if(n=="y"){
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    bn7.setText("y");
                }
            },200);
        }


    }



}