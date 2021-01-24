package com.codemov.aplikasiformatif2_habibulilah;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnAritmatika, btnMultimedia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnAritmatika = findViewById(R.id.btn_aritmatika);
        btnMultimedia = findViewById(R.id.btn_multimedia);

        btnAritmatika.setOnClickListener(this);
        btnMultimedia.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.btn_aritmatika){
            startActivity(new Intent(HomeActivity.this, AritmatikaActivity.class));
        }else if(view.getId() == R.id.btn_multimedia){
            startActivity(new Intent(HomeActivity.this, AudioStreamingActivity.class));
        }
    }
}