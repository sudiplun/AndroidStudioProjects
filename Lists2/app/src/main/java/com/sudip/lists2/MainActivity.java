package com.sudip.lists2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
public class MainActivity extends AppCompatActivity {
   private ListView citiesList;
    private Spinner studentsSpinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        citiesList = findViewById(R.id.citiesList);
        studentsSpinner =findViewById(R.id.studentsSpinner);
         ArrayList<String> students = new ArrayList<>();
        students.add("Sudip");
        students.add("Ram");
        students.add("Hari");
        students.add("Jonny");
        ArrayAdapter<String> studentsAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                students
        );
        studentsSpinner.setAdapter(studentsAdapter);
        studentsSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, students.get(position) + " Selected", Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        final ArrayList<String> cities = new ArrayList<>();
        cities.add("Kathmandu");
        cities.add("Dehli");
        cities.add("Sinapoure");
        cities.add("Moscow");
        cities.add("Berlin");

        ArrayAdapter<String> citiesAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                cities
        );
        citiesList.setAdapter(citiesAdapter);
    }
}