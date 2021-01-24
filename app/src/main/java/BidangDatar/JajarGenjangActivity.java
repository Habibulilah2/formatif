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

public class JajarGenjangActivity extends AppCompatActivity implements View.OnClickListener{

    TextView luasJajarGenjang, kelilingJajarGenjang;
    EditText alas, tinggi;
    ImageView imgBackspace;
    Button btnHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jajar_genjang);

        alas = findViewById(R.id.edt_alas);
        tinggi = findViewById(R.id.edt_tinggi);
        luasJajarGenjang = findViewById(R.id.txt_luas);
        kelilingJajarGenjang = findViewById(R.id.txt_keliling);
        btnHitung = findViewById(R.id.btn_hitung);
        imgBackspace = findViewById(R.id.backspace);

        imgBackspace.setOnClickListener(this);

        btnHitung.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                int edt_alas = Integer.valueOf(alas.getText().toString());
                int edt_tinggi = Integer.valueOf(tinggi.getText().toString());

                int jajargenjangluas = edt_alas * edt_tinggi;
                int jajargenjangkeliling = 2 * (edt_alas + edt_tinggi);

                luasJajarGenjang.setText(String.valueOf(jajargenjangluas));
                kelilingJajarGenjang.setText(String.valueOf(jajargenjangkeliling));
            }
        });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.backspace:
                Intent back = new Intent(JajarGenjangActivity.this, BidangDatarActivity.class);
                startActivityForResult(back, 2);
                break;
        }
    }
}