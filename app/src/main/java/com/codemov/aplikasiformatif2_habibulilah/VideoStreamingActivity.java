package com.codemov.aplikasiformatif2_habibulilah;

import android.app.ProgressDialog;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class VideoStreamingActivity extends AppCompatActivity implements View.OnClickListener{

    ImageView imgBackspace;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_streaming);

        imgBackspace = findViewById(R.id.backspace);

        imgBackspace.setOnClickListener(this);

        //Initialize And Assign Variable
        BottomNavigationView bottomNavigationView = findViewById(R.id.navigation_bottom);

        //Set Audio Streaming
        bottomNavigationView.setSelectedItemId(R.id.nav_video_streaming);

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
                        startActivity(new Intent(getApplicationContext()
                                ,VideoSederhanaActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.nav_video_streaming:
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
                Intent back = new Intent(VideoStreamingActivity.this, HomeActivity.class);
                startActivityForResult(back, 2);
        }
    }
}