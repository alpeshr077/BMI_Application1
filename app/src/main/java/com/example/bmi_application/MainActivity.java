package com.example.bmi_application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

   EditText txt11,txt12;
    Button btnsubmit;
    TextView txt1, txtanswer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txt11 = findViewById(R.id.txt11);
        txt12 = findViewById(R.id.txt12);
        btnsubmit = findViewById(R.id.btnsubmit);
        txt1 = findViewById(R.id.txt1);
        txtanswer = findViewById(R.id.txtanswer);

        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double weight = Integer.parseInt(txt11.getText().toString());
                double height = Integer.parseInt(txt12.getText().toString());
                double answer;

                answer = weight / ((height / 100) + (height / 100));

                txtanswer.setText(new DecimalFormat("##.##").format(answer));


            }
        });


    }
}