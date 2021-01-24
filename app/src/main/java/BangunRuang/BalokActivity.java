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

public class BalokActivity extends AppCompatActivity implements View.OnClickListener{

    TextView luasBalok, volumeBalok;
    EditText panjang, lebar, tinggi;
    ImageView imgBackspace;
    Button btnHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balok);

        panjang = findViewById(R.id.edt_panjang);
        lebar = findViewById(R.id.edt_lebar);
        tinggi = findViewById(R.id.edt_tinggi);
        luasBalok = findViewById(R.id.txt_luas);
        volumeBalok = findViewById(R.id.txt_volume);
        btnHitung = findViewById(R.id.btn_hitung);
        imgBackspace = findViewById(R.id.backspace);

        imgBackspace.setOnClickListener(this);

        btnHitung.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                int edt_panjang = Integer.valueOf(panjang.getText().toString());
                int edt_lebar = Integer.valueOf(lebar.getText().toString());
                int edt_tinggi = Integer.valueOf(tinggi.getText().toString());

                int balokluas = 2 * (edt_panjang * edt_lebar + edt_panjang * edt_tinggi + edt_lebar * edt_tinggi);
                int balokvolume = edt_panjang * edt_lebar * edt_tinggi;

                luasBalok.setText(String.valueOf(balokluas));
                volumeBalok.setText(String.valueOf(balokvolume));
            }
        });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.backspace:
                Intent back = new Intent(BalokActivity.this, BangunRuangActivity.class);
                startActivityForResult(back, 2);
                break;
        }
    }
}