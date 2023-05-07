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
import android.widget.Toast;

import com.example.unitify.Activities.Conversion.ResultActivity;
import com.example.unitify.R;

public class MassListActivity extends AppCompatActivity {

    TextView bn1,bn2,bn3,bn4,bn5,bn6,bn7;
    CardView grams,ounces,pounds,kilograms,metric_tons,short_tons,long_tons,carats;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mass_list);
        getSupportActionBar().hide();

        bn1 = findViewById(R.id.bn1);
        bn2 = findViewById(R.id.bn2);
        bn3 = findViewById(R.id.bn3);
        bn4 = findViewById(R.id.bn4);
        bn5 = findViewById(R.id.bn5);
        bn6 = findViewById(R.id.bn6);
        bn7 = findViewById(R.id.bn7);

        grams = findViewById(R.id.grams);
        ounces = findViewById(R.id.ounces);
        pounds = findViewById(R.id.pounds);
        kilograms = findViewById(R.id.kilograms);
        metric_tons = findViewById(R.id.metric_ton);
        short_tons = findViewById(R.id.short_tons);
        long_tons = findViewById(R.id.long_tons);
        carats = findViewById(R.id.carats);



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

        grams.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(type1.equals("true") ){
                    editor.putString("from", "grams" );
                }
                if(type2.equals("true") )
                    editor.putString("to", "grams" );

                editor.commit();
                Intent intent = new Intent(getApplicationContext(),ResultActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });

        ounces.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 if(type1.equals("true") ) {
                    editor.putString("from", "ounces" );
                }
                 if(type2.equals("true") )
                    editor.putString("to", "ounces" );

                editor.commit();
                startActivity(new Intent(getApplicationContext(),ResultActivity.class));
            }
        });
        pounds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 if(type1.equals("true") ) {
                    editor.putString("from", "pounds" );
                }
                 if(type2.equals("true") )
                    editor.putString("to", "pounds" );

                editor.commit();
                startActivity(new Intent(getApplicationContext(),ResultActivity.class));
            }
        });
        kilograms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 if(type1.equals("true") ) {
                    editor.putString("from", "kilograms" );
                }
                 if(type2.equals("true") )
                    editor.putString("to", "kilograms" );

                editor.commit();
                startActivity(new Intent(getApplicationContext(),ResultActivity.class));
            }
        });
        metric_tons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 if(type1.equals("true") ) {
                    editor.putString("from", "metric_tons" );
                }
                 if(type2.equals("true") )
                    editor.putString("to", "metric_tons" );

                editor.commit();
                startActivity(new Intent(getApplicationContext(),ResultActivity.class));
            }
        });
        short_tons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 if(type1.equals("true") ) {
                    editor.putString("from", "short_tons" );
                }
                 if(type2.equals("true") )
                    editor.putString("to", "short_tons" );

                editor.commit();
                startActivity(new Intent(getApplicationContext(),ResultActivity.class));
            }
        });
        long_tons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 if(type1.equals("true") ) {
                    editor.putString("from", "long_tons" );
                }
                 if(type2.equals("true") )
                    editor.putString("to", "long_tons" );

                editor.commit();
                startActivity(new Intent(getApplicationContext(),ResultActivity.class));
            }
        });
        carats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 if(type1.equals("true") ) {
                    editor.putString("from", "carats" );
                }
                 if(type2.equals("true") )
                    editor.putString("to", "carats" );

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