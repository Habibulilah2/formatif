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

public class TabungActivity extends AppCompatActivity implements View.OnClickListener{

    TextView luasTabung, volumeTabung;
    EditText jarijari, tinggi;
    ImageView imgBackspace;
    Button btnHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabung);

        jarijari = findViewById(R.id.edt_jari_jari);
        tinggi = findViewById(R.id.edt_tinggi);
        luasTabung = findViewById(R.id.txt_luas);
        volumeTabung = findViewById(R.id.txt_volume);
        btnHitung = findViewById(R.id.btn_hitung);
        imgBackspace = findViewById(R.id.backspace);

        imgBackspace.setOnClickListener(this);

        btnHitung.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                double edt_jari_jari = Double.parseDouble(jarijari.getText().toString());
                int edt_tinggi = Integer.valueOf(tinggi.getText().toString());

                double tabungluas = 2 * 3.14 * edt_jari_jari * (edt_jari_jari + edt_tinggi);
                double tabungvolume = 3.14 * edt_jari_jari * edt_jari_jari * edt_jari_jari;

                luasTabung.setText(String.valueOf(tabungluas));
                volumeTabung.setText(String.valueOf(tabungvolume));
            }
        });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.backspace:
                Intent back = new Intent(TabungActivity.this, BangunRuangActivity.class);
                startActivityForResult(back, 2);
                break;
        }
    }
}