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

public class TimeListActivity extends AppCompatActivity {

    TextView bn1,bn2,bn3,bn4,bn5,bn6,bn7;
    CardView seconds,minutes,hours,days,weeks,months,years;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_list);


        getSupportActionBar().hide();

        bn1 = findViewById(R.id.bn1);
        bn2 = findViewById(R.id.bn2);
        bn3 = findViewById(R.id.bn3);
        bn4 = findViewById(R.id.bn4);
        bn5 = findViewById(R.id.bn5);
        bn6 = findViewById(R.id.bn6);
        bn7 = findViewById(R.id.bn7);

        seconds = findViewById(R.id.seconds);
        minutes = findViewById(R.id.minutes);
        hours = findViewById(R.id.hours);
        days = findViewById(R.id.days);
        weeks = findViewById(R.id.weeks);
        months = findViewById(R.id.months);
        years = findViewById(R.id.years);




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

        seconds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(type1.equals("true") ){
                    editor.putString("from", "seconds" );
                }
                if(type2.equals("true") )
                    editor.putString("to", "seconds" );

                editor.commit();
                Intent intent = new Intent(getApplicationContext(), ResultActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });

        minutes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(type1.equals("true") ) {
                    editor.putString("from", "minutes" );
                }
                if(type2.equals("true") )
                    editor.putString("to", "minutes" );

                editor.commit();
                startActivity(new Intent(getApplicationContext(),ResultActivity.class));
            }
        });
        hours.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(type1.equals("true") ) {
                    editor.putString("from", "hours" );
                }
                if(type2.equals("true") )
                    editor.putString("to", "hours" );

                editor.commit();
                startActivity(new Intent(getApplicationContext(),ResultActivity.class));
            }
        });
        days.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(type1.equals("true") ) {
                    editor.putString("from", "days" );
                }
                if(type2.equals("true") )
                    editor.putString("to", "days" );

                editor.commit();
                startActivity(new Intent(getApplicationContext(),ResultActivity.class));
            }
        });

        weeks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(type1.equals("true") ) {
                    editor.putString("from", "weeks" );
                }
                if(type2.equals("true") )
                    editor.putString("to", "weeks" );

                editor.commit();
                startActivity(new Intent(getApplicationContext(),ResultActivity.class));
            }
        });

        months.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(type1.equals("true") ) {
                    editor.putString("from", "months" );
                }
                if(type2.equals("true") )
                    editor.putString("to", "months" );

                editor.commit();
                startActivity(new Intent(getApplicationContext(),ResultActivity.class));
            }
        });

        years.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(type1.equals("true") ) {
                    editor.putString("from", "years" );
                }
                if(type2.equals("true") )
                    editor.putString("to", "years" );

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