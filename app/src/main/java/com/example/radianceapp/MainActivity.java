package com.example.radianceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    CheckBox checkbox1,checkBox2;
    RadioGroup radioGroup1,radioGroup2;
    RadioButton radio1,radio2,radio3,radio4;
    EditText editText2,editText3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkbox1 = findViewById(R.id.check1);
        checkBox2 = findViewById(R.id.check2);
        editText2 = findViewById(R.id.name2);
        editText3 = findViewById(R.id.name3);
        radioGroup1 = findViewById(R.id.rg1);
        radioGroup2 = findViewById(R.id.rg2);
        radio1 = findViewById(R.id.ind1);
        radio2 = findViewById(R.id.ind2);
        radio3 = findViewById(R.id.ind3);
        radio4 = findViewById(R.id.ind4);

        checkbox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                if(b)
                {
                    radioGroup1.setVisibility(View.VISIBLE);
                    radio2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(CompoundButton compoundButton, boolean b) {

                            if(b)
                            {
                                editText2.setVisibility(View.VISIBLE);
                            }
                            else
                            {
                                editText2.setVisibility(View.INVISIBLE);
                            }
                        }
                    });
                }
                else
                {
                    radioGroup1.setVisibility(View.INVISIBLE);
                    editText2.setVisibility(View.INVISIBLE);
                }
            }
        });

        checkBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b)
                {
                    radioGroup2.setVisibility(View.VISIBLE);
                    radio4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                            if(b)
                            {
                                editText3.setVisibility(View.VISIBLE);
                            }
                            else
                            {
                                editText3.setVisibility(View.INVISIBLE);
                            }
                        }
                    });
                }
                else
                {
                    radioGroup2.setVisibility(View.INVISIBLE);
                    editText3.setVisibility(View.INVISIBLE);
                }
            }
        });



    }
}
