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

public class KerucutActivity extends AppCompatActivity implements View.OnClickListener{

    TextView luasKerucut, volumeKerucut;
    EditText jarijari, tinggi, s;
    ImageView imgBackspace;
    Button btnHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kerucut);

        jarijari = findViewById(R.id.edt_jari_jari);
        tinggi = findViewById(R.id.edt_tinggi);
        s = findViewById(R.id.edt_garis_pelukis);
        luasKerucut = findViewById(R.id.txt_luas);
        volumeKerucut = findViewById(R.id.txt_volume);
        btnHitung = findViewById(R.id.btn_hitung);
        imgBackspace = findViewById(R.id.backspace);

        imgBackspace.setOnClickListener(this);

        btnHitung.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                double edt_jari_jari = Double.parseDouble(jarijari.getText().toString());
                int edt_tinggi = Integer.valueOf(tinggi.getText().toString());
                int edt_garis_pelukis = Integer.valueOf(s.getText().toString());

                double kerucutluas = 3.14 * edt_jari_jari * (edt_jari_jari + edt_garis_pelukis);
                double kerucutvolume = 3.14 * edt_jari_jari * edt_jari_jari * edt_tinggi / 3;

                luasKerucut.setText(String.valueOf(kerucutluas));
                volumeKerucut.setText(String.valueOf(kerucutvolume));
            }
        });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.backspace:
                Intent back = new Intent(KerucutActivity.this, BangunRuangActivity.class);
                startActivityForResult(back, 2);
                break;
        }
    }
}