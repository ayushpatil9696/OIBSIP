package com.example.unitconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView output;
    EditText EnterNum;
    Button miles;
    Button meters;
    Button kilometers;
    Button centimeter;








    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        output = findViewById(R.id.Output);
        EnterNum = findViewById(R.id.editTextNumberDecimal2);
        miles = findViewById(R.id.Miles);
        meters = findViewById(R.id.Meter);
        kilometers = findViewById(R.id.Kilometer);
        centimeter = findViewById(R.id.Centimeter);

        meters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = EnterNum.getText().toString();
                int number = Integer.parseInt(num);
                float meters = (number * 1000);
                output.setText("value in meters : " + meters);
            }
        });

        meters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = EnterNum.getText().toString();
                int number = Integer.parseInt(num);
                float meters = (number * 1000);
                output.setText("value in meters : " + meters);
            }
        });

        centimeter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = EnterNum.getText().toString();
                int number = Integer.parseInt(num);
                float centimeter = (number * 100);
                output.setText("value in meters : " + centimeter);
            }
        });

        miles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = EnterNum.getText().toString();
                int number = Integer.parseInt(num);
                double miles = (number / 1.609);
                output.setText("value in meters : " + miles);
            }
        });

        kilometers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num = EnterNum.getText().toString();
                int number = Integer.parseInt(num);
                float kilometers = (number / 1000);
                output.setText("value in Kilometers : " + kilometers);
            }
        });



}
}