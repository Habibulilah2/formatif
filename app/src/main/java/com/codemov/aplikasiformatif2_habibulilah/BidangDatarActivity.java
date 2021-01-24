package com.codemov.aplikasiformatif2_habibulilah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import BidangDatar.JajarGenjangActivity;
import BidangDatar.LayangLayangActivity;
import BidangDatar.LingkaranActivity;
import BidangDatar.SegitigaActivity;
import BidangDatar.TrapesiumActivity;

public class BidangDatarActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnTrapesium, btnSegitiga, btnJajarGenjang, btnLingkaran, btnLayangLayang;
    ImageView imgBackspace;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bidang_datar);

        btnTrapesium = findViewById(R.id.btn_trapesium);
        btnSegitiga = findViewById(R.id.btn_segitiga);
        btnJajarGenjang = findViewById(R.id.btn_jajar_genjang);
        btnLingkaran = findViewById(R.id.btn_lingkaran);
        btnLayangLayang = findViewById(R.id.btn_layang_layang);
        imgBackspace = findViewById(R.id.backspace);

        btnTrapesium.setOnClickListener(this);
        btnSegitiga.setOnClickListener(this);
        btnJajarGenjang.setOnClickListener(this);
        btnLingkaran.setOnClickListener(this);
        btnLayangLayang.setOnClickListener(this);
        imgBackspace.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_trapesium:
                Intent trapesium = new Intent(BidangDatarActivity.this, TrapesiumActivity.class);
                startActivityForResult(trapesium, 2);
                break;
            case R.id.btn_segitiga:
                Intent segitiga = new Intent(BidangDatarActivity.this, SegitigaActivity.class);
                startActivityForResult(segitiga, 2);
                break;
            case R.id.btn_jajar_genjang:
                Intent jajargenjang = new Intent(BidangDatarActivity.this, JajarGenjangActivity.class);
                startActivityForResult(jajargenjang, 2);
                break;
            case R.id.btn_lingkaran:
                Intent lingkaran = new Intent(BidangDatarActivity.this, LingkaranActivity.class);
                startActivityForResult(lingkaran, 2);
                break;
            case R.id.btn_layang_layang:
                Intent layanglayang = new Intent(BidangDatarActivity.this, LayangLayangActivity.class);
                startActivityForResult(layanglayang, 2);
                break;
            case R.id.backspace:
                Intent back = new Intent(BidangDatarActivity.this, AritmatikaActivity.class);
                startActivityForResult(back, 2);
        }
    }
}