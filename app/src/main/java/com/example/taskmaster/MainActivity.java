package com.example.taskmaster;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToProjectsPage(View v) {
        Intent ProjectPageIntent = new Intent(this, project_page.class);
        startActivity(ProjectPageIntent);
    }
}
