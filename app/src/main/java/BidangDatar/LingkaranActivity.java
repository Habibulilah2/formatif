package BidangDatar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.codemov.aplikasiformatif2_habibulilah.BidangDatarActivity;
import com.codemov.aplikasiformatif2_habibulilah.R;

public class LingkaranActivity extends AppCompatActivity implements View.OnClickListener{

    TextView luasLingkaran, kelilingLingkaran;
    EditText jarijari;
    ImageView imgBackspace;
    Button btnHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);

        jarijari = findViewById(R.id.edt_jari_jari);
        luasLingkaran = findViewById(R.id.txt_luas);
        kelilingLingkaran = findViewById(R.id.txt_keliling);
        btnHitung = findViewById(R.id.btn_hitung);
        imgBackspace = findViewById(R.id.backspace);

        imgBackspace.setOnClickListener(this);

        btnHitung.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                double edt_jari_jari = Double.parseDouble(jarijari.getText().toString());

                double lingkaranluas = (3.14 * edt_jari_jari * edt_jari_jari);
                double lingkarankeliling = 2 * (3.14 * edt_jari_jari);

                luasLingkaran.setText(String.valueOf(lingkaranluas));
                kelilingLingkaran.setText(String.valueOf(lingkarankeliling));
            }
        });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.backspace:
                Intent back = new Intent(LingkaranActivity.this, BidangDatarActivity.class);
                startActivityForResult(back, 2);
                break;
        }
    }
}