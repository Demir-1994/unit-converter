package com.example.unitconverter;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.text.DecimalFormat;

public class inchesToCmActivity extends AppCompatActivity {
    EditText editText;
    TextView resultTextView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inches_to_cm);

        //ActionBar
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("Inches to cm convert");

        //
        resultTextView = findViewById(R.id.resultTextView);
        editText = findViewById(R.id.inchesToCmEditText);
        button = findViewById(R.id.convertButton);

        //adding a click event for button
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //calling convert from inches to cm
                convertFromInchesToCm();
            }

            private void convertFromInchesToCm() {
                //This method will convert the values entered in editText
                //from inches to cm
                String valueEnteredinInches = editText.getText().toString();

                //converting string to number
                double inches = Double.parseDouble(valueEnteredinInches);

                //converting inches to cm
                double miles = inches * 2.54;
                DecimalFormat df = new DecimalFormat("###.##");

                //Displaying the value of resulted in textView
                resultTextView.setText("Result is: " + df.format(miles));
            }
        });
    }
}