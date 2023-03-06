package com.sudip.uibasicsection3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private CheckBox checkboxJAVA, checkboxKotlin, checkboxC;
private RadioGroup levelStudy;
private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        checkboxJAVA = findViewById(R.id.checkboxJAVA);
        checkboxKotlin = findViewById(R.id.checkboxKotin);
        checkboxC = findViewById(R.id.checkboxC);

        levelStudy = findViewById(R.id.levelStudy);
        progressBar = findViewById(R.id.progressBar);

       Thread thread = new Thread(new Runnable() {
           @Override
           public void run() {
               for (int i =0; i<10; i++) {
                   progressBar.incrementProgressBy(10);
                   SystemClock.sleep(500);
               }
           }
       });
       thread.start();

        levelStudy.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
            switch (checkedId) {
                case R.id.radioBachelor:
                    Toast.makeText(MainActivity.this, "you are at Bachelor", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.radioPlusTwo:
                    Toast.makeText(MainActivity.this, "You're at +2", Toast.LENGTH_SHORT).show();
                
                    break;
                case R.id.radioSchool:
                    Toast.makeText(MainActivity.this, "You're at School", Toast.LENGTH_SHORT).show();
                    break;
                default:
                    break;
}
            }
        });


        checkboxJAVA.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Toast.makeText(MainActivity.this, "You know JAVA", Toast.LENGTH_LONG).show();
                }else {
                    Toast.makeText(MainActivity.this, "You need to know JAVA", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}