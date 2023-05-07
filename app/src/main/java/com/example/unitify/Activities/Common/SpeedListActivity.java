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

public class SpeedListActivity extends AppCompatActivity {

    TextView bn1,bn2,bn3,bn4,bn5,bn6,bn7;
    CardView meters_per_second,kilometers_per_hour,miles_per_hour,knots,feet_per_second;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speed_list);

        getSupportActionBar().hide();

        bn1 = findViewById(R.id.bn1);
        bn2 = findViewById(R.id.bn2);
        bn3 = findViewById(R.id.bn3);
        bn4 = findViewById(R.id.bn4);
        bn5 = findViewById(R.id.bn5);
        bn6 = findViewById(R.id.bn6);
        bn7 = findViewById(R.id.bn7);

        meters_per_second = findViewById(R.id.meters_per_second);
        kilometers_per_hour = findViewById(R.id.kilometers_per_hour);
        miles_per_hour = findViewById(R.id.miles_per_hour);
        knots = findViewById(R.id.knots);
        feet_per_second = findViewById(R.id.feet_per_second);



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

        meters_per_second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(type1.equals("true") ){
                    editor.putString("from", "meters_per_second" );
                }
                if(type2.equals("true") )
                    editor.putString("to", "meters_per_second" );

                editor.commit();
                Intent intent = new Intent(getApplicationContext(), ResultActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });

        kilometers_per_hour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(type1.equals("true") ) {
                    editor.putString("from", "kilometers_per_hour" );
                }
                if(type2.equals("true") )
                    editor.putString("to", "kilometers_per_hour" );

                editor.commit();
                startActivity(new Intent(getApplicationContext(),ResultActivity.class));
            }
        });
        miles_per_hour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(type1.equals("true") ) {
                    editor.putString("from", "miles_per_hour" );
                }
                if(type2.equals("true") )
                    editor.putString("to", "miles_per_hour" );

                editor.commit();
                startActivity(new Intent(getApplicationContext(),ResultActivity.class));
            }
        });
        knots.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(type1.equals("true") ) {
                    editor.putString("from", "knots" );
                }
                if(type2.equals("true") )
                    editor.putString("to", "knots" );

                editor.commit();
                startActivity(new Intent(getApplicationContext(),ResultActivity.class));
            }
        });
        feet_per_second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(type1.equals("true") ) {
                    editor.putString("from", "feet_per_second" );
                }
                if(type2.equals("true") )
                    editor.putString("to", "feet_per_second" );

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