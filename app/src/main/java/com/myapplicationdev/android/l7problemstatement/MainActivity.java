package com.myapplicationdev.android.l7problemstatement;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
Button btnAdd,btnClear;
EditText et;
ListView lvTasks;
ArrayList<String> tasks;
ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et = findViewById(R.id.editText);
        btnAdd = findViewById(R.id.buttonAdd);
        btnClear = findViewById(R.id.buttonClear);
        lvTasks = findViewById(R.id.ListView);
        tasks = new ArrayList<String>();
        adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,tasks);


        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String tasksAdded = et.getText().toString();
                tasks.add(tasksAdded);
                lvTasks.setAdapter(adapter);
                adapter.notifyDataSetChanged();
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adapter.clear();
            }
        });
    }
}
