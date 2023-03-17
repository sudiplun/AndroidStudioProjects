package com.sudiplun.weightconvert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private EditText edtTxtEnterUnit;
private TextView txtViewResult;
private Button btnResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtTxtEnterUnit = findViewById(R.id.edtTxtEnterUnit);
        txtViewResult = findViewById(R.id.txtViewResult);
        btnResult = findViewById(R.id.btnResult);
        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "submited", Toast.LENGTH_SHORT).show();
                String s = edtTxtEnterUnit.getText().toString();
                int kg = Integer.parseInt(s);
                double pound = 2.205*kg;
                txtViewResult.setText("The corresponding value of Pound is " + pound);
            }
        });
    }
}