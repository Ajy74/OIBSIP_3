package com.example.unitify.Activities.Common;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

import com.example.unitify.Activities.Conversion.ResultActivity;
import com.example.unitify.R;

public class TemperatureListActivity extends AppCompatActivity {

    TextView bn1,bn2,bn3,bn4,bn5,bn6,bn7;
    CardView celsius,fahrenheit,kelvin,rankine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature_list);


        getSupportActionBar().hide();

        bn1 = findViewById(R.id.bn1);
        bn2 = findViewById(R.id.bn2);
        bn3 = findViewById(R.id.bn3);
        bn4 = findViewById(R.id.bn4);
        bn5 = findViewById(R.id.bn5);
        bn6 = findViewById(R.id.bn6);
        bn7 = findViewById(R.id.bn7);

        celsius = findViewById(R.id.celsius);
        fahrenheit = findViewById(R.id.fahrenheit);
        kelvin = findViewById(R.id.kelvin);
        rankine = findViewById(R.id.rankine);




//        setting brand name //
        setBrand("U");
//        setting brand name //

        liteners();
        
    }

    private void liteners() {

        Intent intent = getIntent();
        String type1 = intent.getStringExtra("from");
        String type2 = intent.getStringExtra("to");


        SharedPreferences sp = getSharedPreferences("conversion", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();

        celsius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(type1.equals("true") ){
                    editor.putString("from", "celsius" );
                }
                if(type2.equals("true") )
                    editor.putString("to", "celsius" );

                editor.commit();
                Intent intent = new Intent(getApplicationContext(), ResultActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });

        fahrenheit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(type1.equals("true") ) {
                    editor.putString("from", "fahrenheit" );
                }
                if(type2.equals("true") )
                    editor.putString("to", "fahrenheit" );

                editor.commit();
                startActivity(new Intent(getApplicationContext(),ResultActivity.class));
            }
        });
        kelvin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(type1.equals("true") ) {
                    editor.putString("from", "kelvin" );
                }
                if(type2.equals("true") )
                    editor.putString("to", "kelvin" );

                editor.commit();
                startActivity(new Intent(getApplicationContext(),ResultActivity.class));
            }
        });
        rankine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(type1.equals("true") ) {
                    editor.putString("from", "rankine" );
                }
                if(type2.equals("true") )
                    editor.putString("to", "rankine" );

                editor.commit();
                startActivity(new Intent(getApplicationContext(),ResultActivity.class));
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