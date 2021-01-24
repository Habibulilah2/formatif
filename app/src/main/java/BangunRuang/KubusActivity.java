package BangunRuang;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.codemov.aplikasiformatif2_habibulilah.BangunRuangActivity;
import com.codemov.aplikasiformatif2_habibulilah.BidangDatarActivity;
import com.codemov.aplikasiformatif2_habibulilah.R;

import BidangDatar.LayangLayangActivity;

public class KubusActivity extends AppCompatActivity implements View.OnClickListener{

    TextView luasKubus, volumeKubus;
    EditText sisi;
    ImageView imgBackspace;
    Button btnHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kubus);

        sisi = findViewById(R.id.edt_sisi);
        luasKubus = findViewById(R.id.txt_luas);
        volumeKubus = findViewById(R.id.txt_volume);
        btnHitung = findViewById(R.id.btn_hitung);
        imgBackspace = findViewById(R.id.backspace);

        imgBackspace.setOnClickListener(this);

        btnHitung.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                int edt_sisi = Integer.valueOf(sisi.getText().toString());

                int kubusluas = 6 * edt_sisi * edt_sisi;
                int kubusvolume = edt_sisi * edt_sisi * edt_sisi;

                luasKubus.setText(String.valueOf(kubusluas));
                volumeKubus.setText(String.valueOf(kubusvolume));
            }
        });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.backspace:
                Intent back = new Intent(KubusActivity.this, BangunRuangActivity.class);
                startActivityForResult(back, 2);
                break;
        }
    }
}