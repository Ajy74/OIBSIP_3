package com.example.unitify.Activities.Conversion;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.unitify.Activities.Common.LengthListActivity;
import com.example.unitify.Activities.Common.MassListActivity;
import com.example.unitify.Activities.Common.SpeedListActivity;
import com.example.unitify.Activities.Common.TemperatureListActivity;
import com.example.unitify.Activities.Common.TimeListActivity;
import com.example.unitify.Activities.MainActivity;
import com.example.unitify.Converter.LengthConverter;
import com.example.unitify.Converter.MassConverter;
import com.example.unitify.Converter.SpeedConverter;
import com.example.unitify.Converter.TemperatureConverter;
import com.example.unitify.Converter.TimeConverter;
import com.example.unitify.R;
import com.google.android.material.button.MaterialButton;

public class ResultActivity extends AppCompatActivity {

    TextView bn1,bn2,bn3,bn4,bn5,bn6,bn7,result,slectFrom,slectTo,typeTxt;
    EditText valueEdt;
    MaterialButton convertBtn,resetBtn;
    AppCompatImageView backImg;
    ImageView swapImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        getSupportActionBar().hide();

//        bn1 = findViewById(R.id.bn1);
//        bn2 = findViewById(R.id.bn2);
//        bn3 = findViewById(R.id.bn3);
//        bn4 = findViewById(R.id.bn4);
//        bn5 = findViewById(R.id.bn5);
//        bn6 = findViewById(R.id.bn6);
//        bn7 = findViewById(R.id.bn7);

        result = findViewById(R.id.result);
        slectFrom = findViewById(R.id.slectFrom);
        slectTo = findViewById(R.id.slectTo);
        typeTxt = findViewById(R.id.typeTxt);
        valueEdt = findViewById(R.id.valueEdt);
        convertBtn = findViewById(R.id.convertBtn);
        resetBtn = findViewById(R.id.resetBtn);
        backImg = findViewById(R.id.backImg);
        swapImg = findViewById(R.id.swapImg);

        SharedPreferences sp = getSharedPreferences("conversion", Context.MODE_PRIVATE);
        if(sp.contains("type")){

            typeTxt.setText(sp.getString("type","").toString());
            if(sp.contains("from"))
                slectFrom.setText(sp.getString("from","").toString());
            if(sp.contains("to"))
                slectTo.setText(sp.getString("to","").toString());
        }
        else{
            typeTxt.setText("Conversion");
            slectFrom.setText("Select");
            slectTo.setText("Select");
        }

//        setting brand name //
       // setBrand("U");
//        setting brand name //

       // convertMass();
//        convertLength();

        listeners();

    }

    private void listeners() {



        backImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });

        swapImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               if(!slectFrom.getText().toString().equals("Select") || !slectTo.getText().toString().equals("Select")){
                   String temp = slectFrom.getText().toString();
                   slectFrom.setText( slectTo.getText().toString() );
                   slectTo.setText(temp);
               }
            }
        });

        slectFrom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(typeTxt.getText().toString().toLowerCase().equals("weight") ){
                    Intent intent = new Intent(getApplicationContext(), MassListActivity.class);
                    intent.putExtra("from","true");
                    intent.putExtra("to","false");
                    startActivity(intent);
                }

                if(typeTxt.getText().toString().toLowerCase().equals("length") ){
                    Intent intent = new Intent(getApplicationContext(), LengthListActivity.class);
                    intent.putExtra("from","true");
                    intent.putExtra("to","false");
                    startActivity(intent);
                }

                if(typeTxt.getText().toString().toLowerCase().equals("temperature") ){
                    Intent intent = new Intent(getApplicationContext(), TemperatureListActivity.class);
                    intent.putExtra("from","true");
                    intent.putExtra("to","false");
                    startActivity(intent);
                }

                if(typeTxt.getText().toString().toLowerCase().equals("speed") ){
                    Intent intent = new Intent(getApplicationContext(), SpeedListActivity.class);
                    intent.putExtra("from","true");
                    intent.putExtra("to","false");
                    startActivity(intent);
                }

                if(typeTxt.getText().toString().toLowerCase().equals("time") ){
                    Intent intent = new Intent(getApplicationContext(), TimeListActivity.class);
                    intent.putExtra("from","true");
                    intent.putExtra("to","false");
                    startActivity(intent);
                }

            }
        });

        slectTo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(typeTxt.getText().toString().toLowerCase().equals("weight") ){
                    Intent intent = new Intent(getApplicationContext(), MassListActivity.class);
                    intent.putExtra("from","false");
                    intent.putExtra("to","true");
                    startActivity(intent);
                }

                if(typeTxt.getText().toString().toLowerCase().equals("length") ){
                    Intent intent = new Intent(getApplicationContext(), LengthListActivity.class);
                    intent.putExtra("from","false");
                    intent.putExtra("to","true");
                    startActivity(intent);
                }

                if(typeTxt.getText().toString().toLowerCase().equals("temperature") ){
                    Intent intent = new Intent(getApplicationContext(), TemperatureListActivity.class);
                    intent.putExtra("from","false");
                    intent.putExtra("to","true");
                    startActivity(intent);
                }

                if(typeTxt.getText().toString().toLowerCase().equals("speed") ){
                    Intent intent = new Intent(getApplicationContext(), SpeedListActivity.class);
                    intent.putExtra("from","false");
                    intent.putExtra("to","true");
                    startActivity(intent);
                }

                if(typeTxt.getText().toString().toLowerCase().equals("time") ){
                    Intent intent = new Intent(getApplicationContext(), TimeListActivity.class);
                    intent.putExtra("from","false");
                    intent.putExtra("to","true");
                    startActivity(intent);
                }

            }
        });

        convertBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(!slectFrom.getText().toString().equals("Select") && !slectTo.getText().toString().equals("Select") && !valueEdt.getText().toString().equals("") ){

                    double val = Double.parseDouble(valueEdt.getText().toString());

                    if(typeTxt.getText().toString().toLowerCase().equals("weight") ){
                        MassConverter massConverter = new MassConverter(val,slectFrom.getText().toString(),slectTo.getText().toString());
                        double res = massConverter.convert();
                        result.setText(String.valueOf(res) );
                    }

                    if(typeTxt.getText().toString().toLowerCase().equals("length") ){
                        LengthConverter lengthConverter = new LengthConverter(val,slectFrom.getText().toString(),slectTo.getText().toString());
                        double res = lengthConverter.convert();
                        result.setText(String.valueOf(res) );
                    }

                    if(typeTxt.getText().toString().toLowerCase().equals("temperature") ){
                        TemperatureConverter temperatureConverter = new TemperatureConverter(val,slectFrom.getText().toString(),slectTo.getText().toString());
                        double res = temperatureConverter.convert();
                        result.setText(String.valueOf(res) );
                    }

                    if(typeTxt.getText().toString().toLowerCase().equals("speed") ){
                        SpeedConverter speedConverter = new SpeedConverter(val,slectFrom.getText().toString(),slectTo.getText().toString());
                        double res = speedConverter.convert();
                        result.setText(String.valueOf(res) );
                    }

                    if(typeTxt.getText().toString().toLowerCase().equals("time") ){
                        TimeConverter timeConverter = new TimeConverter(val,slectFrom.getText().toString(),slectTo.getText().toString());
                        double res = timeConverter.convert();
                        result.setText(String.valueOf(res) );
                    }


                }
                else{
                    Toast.makeText(ResultActivity.this, "Field cannot be empty !", Toast.LENGTH_SHORT).show();
                }

            }
        });

        resetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SharedPreferences sp = getSharedPreferences("conversion", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sp.edit();
                editor.remove("from");
                editor.remove("to");
                editor.commit();

                slectFrom.setText("Select");
                slectTo.setText("Select");
                valueEdt.setText("");
                result.setText("");

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

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }
}