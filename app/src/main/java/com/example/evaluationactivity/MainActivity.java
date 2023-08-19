package com.example.evaluationactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = findViewById(R.id.question_list);

        ArrayList<question_list> question_listArrayList = new ArrayList<>();
        question_listArrayList.add(new question_list("Buthaina","md0008","What is your opinion about course period?",2,"So interrest"));
        question_listArrayList.add(new question_list("Buthaina","md0008","What is your opinion about course period?",4,"So interrest"));
        question_listArrayList.add(new question_list("Buthaina","md0008","What is your opinion about course period?",3,"So interrest"));

        question_adapter adapter = new question_adapter(this,question_listArrayList);
        list.setAdapter(adapter);
    }
}