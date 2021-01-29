package com.example.comp_2160_lab_02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;



public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    //For testing purpose
/**
    private AdapterView.OnItemSelectedListener spnOnItemSelected
            = new AdapterView.OnItemSelectedListener() {
        public void onItemSelected(AdapterView<?> parent, View view,
                                   int pos, long id) {
            String sPos=String.valueOf(pos);
            String sInfo=parent.getItemAtPosition(pos).toString();
            tv_result_unit = (TextView) findViewById(R.id.tv_result_unit);
            tv_result_unit.setText(sPos);

            switch (sPos)
            {
                case("0"):
                    tv_result_unit.setText("°C");
                    break;
                case("1"):
                    tv_result_unit.setText("°F");
                    break;
                default:
                    break;
            }


        }
        public void onNothingSelected(AdapterView<?> parent) {
            //
        }
    };

**/



    public void calculate(View view)
    {
        EditText et_userInput = (EditText) findViewById(R.id.et_temperature);
        Spinner spn_unitType = (Spinner) findViewById(R.id.spn_unit);
        TextView tv_result = (TextView) findViewById(R.id.tv_result);

            switch (spn_unitType.getSelectedItemPosition())
            {
                case (0):
                    tv_result.setText("It's " + String.format("%.1f", (Double.parseDouble(et_userInput.getText().toString()) * (9.0 / 5.0) + 32)) + "°F");
                    break;
                case (1):
                    tv_result.setText("It's " + String.format("%.1f", (Double.parseDouble(et_userInput.getText().toString()) - 32) * (5.0 / 9.0)) + "°C");
                    break;
                default:
                    tv_result.setText("Select unit first");
                    break;
            }





    }
}