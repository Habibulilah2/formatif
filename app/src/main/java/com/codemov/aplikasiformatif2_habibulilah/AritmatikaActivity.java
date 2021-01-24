package com.codemov.aplikasiformatif2_habibulilah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class AritmatikaActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnBidangDatar, btnBangunRuang;
    ImageView imgBackspace;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aritmatika);

        btnBidangDatar = findViewById(R.id.btn_bidang_datar);
        btnBangunRuang = findViewById(R.id.btn_bangun_ruang);
        imgBackspace = findViewById(R.id.backspace);

        btnBidangDatar.setOnClickListener(this);
        btnBangunRuang.setOnClickListener(this);
        imgBackspace.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_bidang_datar:
                Intent bidangdatar = new Intent(AritmatikaActivity.this, BidangDatarActivity.class);
                startActivityForResult(bidangdatar, 2);
                break;
            case R.id.btn_bangun_ruang:
                Intent bangunruang = new Intent(AritmatikaActivity.this, BangunRuangActivity.class);
                startActivityForResult(bangunruang, 2);
                break;
            case R.id.backspace:
                Intent back = new Intent(AritmatikaActivity.this, HomeActivity.class);
                startActivityForResult(back, 2);
        }
    }
}