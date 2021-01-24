package com.codemov.aplikasiformatif2_habibulilah;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MenuItem;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class AudioSederhanaActivity extends AppCompatActivity implements View.OnClickListener{

    ImageView imgBackspace;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio_sederhana);
        mediaPlayer = null;

        imgBackspace = findViewById(R.id.backspace);

        imgBackspace.setOnClickListener(this);

        //Initialize And Assign Variable
        BottomNavigationView bottomNavigationView = findViewById(R.id.navigation_bottom);

        //Set Audio Streaming
        bottomNavigationView.setSelectedItemId(R.id.nav_audio_sederhana);

        //Perform itemSelectedListener
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.nav_audio_sederhana:
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
                        startActivity(new Intent(getApplicationContext()
                                ,VideoStreamingActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });
    }

    public void music(View view) {
        switch (view.getId()){
            case R.id.btnPlay:
                if(mediaPlayer == null){
                    mediaPlayer = MediaPlayer.create( this, R.raw.music);
                }
                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        stopMusic();
                    }
                });
                mediaPlayer.start();
                break;
            case R.id.btnPause:
                if(mediaPlayer != null)
                    mediaPlayer.pause();
                break;
            case R.id.btnResume:
                if(mediaPlayer != null)
                    mediaPlayer.start();
                break;
            case R.id.btnStop:
                if(mediaPlayer != null){
                    mediaPlayer.stop();
                    stopMusic();
                }
                break;
        }
    }

    private void stopMusic() {
        mediaPlayer.release();
        mediaPlayer = null;
    }

    @Override
    protected void onStop(){
        super.onStop();
        stopMusic();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.backspace:
                Intent back = new Intent(AudioSederhanaActivity.this, HomeActivity.class);
                startActivityForResult(back, 2);
        }
    }
}