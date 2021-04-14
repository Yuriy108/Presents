package com.example.presents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.RadioButton;
import android.widget.Spinner;

public class OderActivity extends AppCompatActivity {
    Spinner spinnerAge;
    Spinner spinnerMoney;
    RadioButton radioButtonMan;
    RadioButton radioButtonFamale;
    int sex;
    int age;
    int money;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oder);
        spinnerAge=findViewById(R.id.spinnerAge);
        spinnerMoney=findViewById(R.id.spinnerMoney);
        radioButtonMan=findViewById(R.id.radioButtonMen);
        radioButtonFamale=findViewById(R.id.radioButtonFemale);
        spinnerAge.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0: age=2;
                    break;
                    case 1: age=5;
                        break;
                    case 2: age=8;
                        break;
                    case 3: age=11;
                        break;
                    case 4: age=15;
                        break;
                    case 5: age=18;
                        break;
                    case 6: age=23;
                        break;
                    case 7: age=30;
                        break;
                    case 8: age=45;
                        break;
                    case 9: age=55;
                        break;
                    case 10: age=65;
                        break;
                    case 11: age=75;
                        break;


                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        spinnerMoney.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0: money=0;
                    break;
                    case 1: money=300;
                        break;
                    case 2: money=500;
                        break;
                    case 3: money=700;
                        break;



                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    public void start(View view) {
       if (radioButtonMan.isChecked()){
           sex=1;
       }else if(radioButtonFamale.isChecked()){
           sex=2;
       }



    }
}