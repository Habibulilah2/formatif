package com.codemov.aplikasiformatif2_habibulilah;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class VideoSederhanaActivity extends AppCompatActivity implements View.OnClickListener{

    ImageView imgBackspace;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_sederhana);

        imgBackspace = findViewById(R.id.backspace);

        imgBackspace.setOnClickListener(this);

        //Initialize And Assign Variable
        BottomNavigationView bottomNavigationView = findViewById(R.id.navigation_bottom);

        //Set Audio Streaming
        bottomNavigationView.setSelectedItemId(R.id.nav_video_sederhana);

        //Perform itemSelectedListener
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.nav_audio_sederhana:
                        startActivity(new Intent(getApplicationContext()
                                ,AudioSederhanaActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.nav_audio_streaming:
                        startActivity(new Intent(getApplicationContext()
                                ,AudioStreamingActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.nav_video_sederhana:
                        return true;
                    case R.id.nav_video_streaming:
                        startActivity(new Intent(getApplicationContext()
                                ,VideoStreamingActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.backspace:
                Intent back = new Intent(VideoSederhanaActivity.this, HomeActivity.class);
                startActivityForResult(back, 2);
        }
    }
}