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
import com.codemov.aplikasiformatif2_habibulilah.R;

public class BolaActivity extends AppCompatActivity implements View.OnClickListener{

    TextView luasBola, volumeBola;
    EditText jarijari;
    ImageView imgBackspace;
    Button btnHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bola);

        jarijari = findViewById(R.id.edt_jari_jari);
        luasBola = findViewById(R.id.txt_luas);
        volumeBola = findViewById(R.id.txt_volume);
        btnHitung = findViewById(R.id.btn_hitung);
        imgBackspace = findViewById(R.id.backspace);

        imgBackspace.setOnClickListener(this);

        btnHitung.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                double edt_jari_jari = Integer.valueOf(jarijari.getText().toString());

                double bolaluas = 4 * 3.14 * edt_jari_jari * edt_jari_jari;
                double bolavolume = 3.14 * edt_jari_jari * edt_jari_jari * edt_jari_jari * 4 / 3;

                luasBola.setText(String.valueOf(bolaluas));
                volumeBola.setText(String.valueOf(bolavolume));
            }
        });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.backspace:
                Intent back = new Intent(BolaActivity.this, BangunRuangActivity.class);
                startActivityForResult(back, 2);
                break;
        }
    }
}