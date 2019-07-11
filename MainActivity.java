package com.gohool.meterstoinches.meterstoinches;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    /*
        1m = 39.3701in
     */

    private EditText enterMeters;
    private Button convertButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        enterMeters = (EditText) findViewById(R.id.metersEditText);
        resultTextView = (TextView) findViewById(R.id.resultId);

        convertButton = (Button) findViewById(R.id.convertButtonID);

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Conversion logic
                double multipler = 39.37;
                double result = 0.0;


                if (enterMeters.getText().toString().equals("")) {

                    resultTextView.setText(R.string.error_message);
                    resultTextView.setTextColor(Color.RED);

                }else {
                    double meterValue = Double.parseDouble(enterMeters.getText().toString());
                    result = meterValue*multipler;

                    resultTextView.setTextColor(Color.DKGRAY);
                    resultTextView.setText(String.format("%.2f", result) + " inches ");


                }



            }
        });



    }
}
