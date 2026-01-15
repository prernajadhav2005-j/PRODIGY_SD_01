package com.example.student;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class TempratureConvertar extends AppCompatActivity {
    EditText temp;
    Button ck, cf, kc, kf, fc, fk;
    TextView ans;
    double cal, t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temprature_convertar);
        temp = (EditText) findViewById(R.id.temp);
        ck = (Button) findViewById(R.id.ck);
        cf = (Button) findViewById(R.id.cf);
        kc = (Button) findViewById(R.id.kc);
        kf = (Button) findViewById(R.id.kf);
        fc = (Button) findViewById(R.id.fc);
        fk = (Button) findViewById(R.id.fk);
        ans = (TextView) findViewById(R.id.ans);
        ck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t = Double.parseDouble(temp.getText().toString());
                cal = (t + 273.15);
                //Toast.makeText(TempratureConvertar.this,"temperature="+cal,Toast.LENGTH_LONG).show();
                ans.setText("Temperature in Celsius -> Kelvin is "+ cal);


            }
        });
        cf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t = Double.parseDouble(temp.getText().toString());
                cal = (t * 9 / 5) + 32;
               // Toast.makeText(TempratureConvertar.this,"temperature="+cal,Toast.LENGTH_LONG).show();
                ans.setText("Temperature in Celsius -> Fahrenheit is "+ cal);

            }
        });
        kc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t = Double.parseDouble(temp.getText().toString());
                cal = (t - 273.15);
              //  Toast.makeText(TempratureConvertar.this,"temperature="+cal,Toast.LENGTH_LONG).show();
                ans.setText("Temperature in Kelvin -> Celsius is "+ cal);

            }
        });

        kf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t = Double.parseDouble(temp.getText().toString());
                cal = (t - 273.15) * 5 / 9 + 273.15;
                //Toast.makeText(TempratureConvertar.this,"temperature="+cal,Toast.LENGTH_LONG).show();
                ans.setText("Temperature in Kelvin -> Fahrenheit is "+ cal);

            }
        });
        fc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t = Double.parseDouble(temp.getText().toString());
                cal = (t - 32) * 5 / 9;
                //Toast.makeText(TempratureConvertar.this,"temperature"+cal,Toast.LENGTH_LONG).show();
                ans.setText("Temperature in Fahrenheit -> Celsius is "+ cal);

            }
        });

        fk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                t = Double.parseDouble(temp.getText().toString());
                cal = (t - 32) * 5 / 9 + 273.15;
                //Toast.makeText(TempratureConvertar.this,"temperature="+cal,Toast.LENGTH_LONG).show();
                ans.setText("Temperature in Fahrenheit -> Kelvin is "+ cal);

            }
        });

    }
}