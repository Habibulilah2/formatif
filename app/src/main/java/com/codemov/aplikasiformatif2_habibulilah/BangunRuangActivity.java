package com.codemov.aplikasiformatif2_habibulilah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import BangunRuang.BalokActivity;
import BangunRuang.BolaActivity;
import BangunRuang.KerucutActivity;
import BangunRuang.KubusActivity;
import BangunRuang.TabungActivity;

public class BangunRuangActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnBalok, btnKubus, btnKerucut, btnTabung, btnBola;
    ImageView imgBackspace;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangun_ruang);

        btnBalok = findViewById(R.id.btn_balok);
        btnKubus = findViewById(R.id.btn_kubus);
        btnKerucut = findViewById(R.id.btn_kerucut);
        btnTabung = findViewById(R.id.btn_tabung);
        btnBola = findViewById(R.id.btn_bola);
        imgBackspace = findViewById(R.id.backspace);

        btnBalok.setOnClickListener(this);
        btnKubus.setOnClickListener(this);
        btnKerucut.setOnClickListener(this);
        btnTabung.setOnClickListener(this);
        btnBola.setOnClickListener(this);
        imgBackspace.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_balok:
                Intent balok = new Intent(BangunRuangActivity.this, BalokActivity.class);
                startActivityForResult(balok, 2);
                break;
            case R.id.btn_kubus:
                Intent kubus = new Intent(BangunRuangActivity.this, KubusActivity.class);
                startActivityForResult(kubus, 2);
                break;
            case R.id.btn_kerucut:
                Intent kerucut = new Intent(BangunRuangActivity.this, KerucutActivity.class);
                startActivityForResult(kerucut, 2);
                break;
            case R.id.btn_tabung:
                Intent tabung = new Intent(BangunRuangActivity.this, TabungActivity.class);
                startActivityForResult(tabung, 2);
                break;
            case R.id.btn_bola:
                Intent bola = new Intent(BangunRuangActivity.this, BolaActivity.class);
                startActivityForResult(bola, 2);
                break;
            case R.id.backspace:
                Intent back = new Intent(BangunRuangActivity.this, AritmatikaActivity.class);
                startActivityForResult(back, 2);
        }
    }
}