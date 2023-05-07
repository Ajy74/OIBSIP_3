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

public class LengthListActivity extends AppCompatActivity {

    TextView bn1,bn2,bn3,bn4,bn5,bn6,bn7;
    CardView meters,feet,inches,yards,kilometers,miles,centimeters,millimeters,micrometers,nanometers,angstroms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length_list);

        getSupportActionBar().hide();

        bn1 = findViewById(R.id.bn1);
        bn2 = findViewById(R.id.bn2);
        bn3 = findViewById(R.id.bn3);
        bn4 = findViewById(R.id.bn4);
        bn5 = findViewById(R.id.bn5);
        bn6 = findViewById(R.id.bn6);
        bn7 = findViewById(R.id.bn7);

        meters = findViewById(R.id.meters);
        feet = findViewById(R.id.feet);
        inches = findViewById(R.id.inches);
        yards = findViewById(R.id.yards);
        kilometers = findViewById(R.id.kilometers);
        miles = findViewById(R.id.miles);
        centimeters = findViewById(R.id.centimeters);
        millimeters = findViewById(R.id.millimeters);
        micrometers = findViewById(R.id.micrometers);
        nanometers = findViewById(R.id.nanometers);
        angstroms = findViewById(R.id.angstroms);


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

        meters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(type1.equals("true") ){
                    editor.putString("from", "meters" );
                }
                if(type2.equals("true") )
                    editor.putString("to", "meters" );

                editor.commit();
                Intent intent = new Intent(getApplicationContext(), ResultActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });

        feet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(type1.equals("true") ) {
                    editor.putString("from", "feet" );
                }
                if(type2.equals("true") )
                    editor.putString("to", "feet" );

                editor.commit();
                startActivity(new Intent(getApplicationContext(),ResultActivity.class));
            }
        });
        inches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(type1.equals("true") ) {
                    editor.putString("from", "inches" );
                }
                if(type2.equals("true") )
                    editor.putString("to", "inches" );

                editor.commit();
                startActivity(new Intent(getApplicationContext(),ResultActivity.class));
            }
        });
        yards.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(type1.equals("true") ) {
                    editor.putString("from", "yards" );
                }
                if(type2.equals("true") )
                    editor.putString("to", "yards" );

                editor.commit();
                startActivity(new Intent(getApplicationContext(),ResultActivity.class));
            }
        });
        kilometers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(type1.equals("true") ) {
                    editor.putString("from", "kilometers" );
                }
                if(type2.equals("true") )
                    editor.putString("to", "kilometers" );

                editor.commit();
                startActivity(new Intent(getApplicationContext(),ResultActivity.class));
            }
        });
        miles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(type1.equals("true") ) {
                    editor.putString("from", "miles" );
                }
                if(type2.equals("true") )
                    editor.putString("to", "miles" );

                editor.commit();
                startActivity(new Intent(getApplicationContext(),ResultActivity.class));
            }
        });
        centimeters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(type1.equals("true") ) {
                    editor.putString("from", "centimeters" );
                }
                if(type2.equals("true") )
                    editor.putString("to", "centimeters" );

                editor.commit();
                startActivity(new Intent(getApplicationContext(),ResultActivity.class));
            }
        });
        millimeters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(type1.equals("true") ) {
                    editor.putString("from", "millimeters" );
                }
                if(type2.equals("true") )
                    editor.putString("to", "millimeters" );

                editor.commit();
                startActivity(new Intent(getApplicationContext(),ResultActivity.class));
            }
        });
        micrometers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(type1.equals("true") ) {
                    editor.putString("from", "micrometers" );
                }
                if(type2.equals("true") )
                    editor.putString("to", "micrometers" );

                editor.commit();
                startActivity(new Intent(getApplicationContext(),ResultActivity.class));
            }
        });
        nanometers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(type1.equals("true") ) {
                    editor.putString("from", "nanometers" );
                }
                if(type2.equals("true") )
                    editor.putString("to", "nanometers" );

                editor.commit();
                startActivity(new Intent(getApplicationContext(),ResultActivity.class));
            }
        });
        angstroms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(type1.equals("true") ) {
                    editor.putString("from", "angstroms" );
                }
                if(type2.equals("true") )
                    editor.putString("to", "angstroms" );

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