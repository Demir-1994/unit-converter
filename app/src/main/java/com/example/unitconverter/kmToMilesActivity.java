package com.example.unitconverter;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.text.DecimalFormat;

public class kmToMilesActivity extends AppCompatActivity {
    EditText editText;
    TextView resultTextView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_km_to_miles);

        //ActionBar
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle("KM to Miles convert");

        //
        resultTextView = findViewById(R.id.resultTextView);
        editText = findViewById(R.id.kmToMileEditText);
        button = findViewById(R.id.convertButton);

        //adding a click event for button
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //calling convert from km to miles
                convertFromKmToMiles();
            }

            private void convertFromKmToMiles() {
                //This method will convert the values entered in editText
                //from km to miles
                String valueEnteredinKM = editText.getText().toString();

                //converting string to number
                double km = Double.parseDouble(valueEnteredinKM);

                //converting km to miles
                double miles = km * 0.6214;
                DecimalFormat df = new DecimalFormat("###.##");

                //Displaying the value of resulted in textView
                resultTextView.setText("Result is: " + df.format(miles));
            }
        });
    }
}