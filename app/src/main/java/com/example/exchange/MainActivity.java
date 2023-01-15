package com.example.exchange;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText numberInput;
    TextView resultView1;
    TextView resultView2;
    TextView resultView3;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numberInput = findViewById(R.id.number_input);
        resultView1 = findViewById(R.id.result_view1);
        resultView2 = findViewById(R.id.result_view2);
        resultView3 = findViewById(R.id.result_view3);
    }

    @SuppressLint("SetTextI18n")
    public void convertNumber(View view) {
        int originalNumber = Integer.parseInt(numberInput.getText().toString());
        double convertedNumber1 = originalNumber * (1/7.53);
        double convertedNumber2 = originalNumber * (1/6.95);
        double convertedNumber3 = originalNumber * (1/7.50);

        resultView1.setText("Vrijednost Eura: " + convertedNumber1);
        resultView2.setText("Vrijednost Dolara: " + convertedNumber2);
        resultView3.setText("Vrijednost Franaka: " + convertedNumber3);
    }
}