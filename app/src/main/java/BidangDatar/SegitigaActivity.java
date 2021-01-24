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

public class SegitigaActivity extends AppCompatActivity implements View.OnClickListener{

    TextView luasSegitiga, kelilingSegitiga;
    EditText sisiA, sisiB, sisiC;
    ImageView imgBackspace;
    Button btnHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        sisiA = findViewById(R.id.edt_sisiA);
        sisiB = findViewById(R.id.edt_sisiB);
        sisiC = findViewById(R.id.edt_sisiC);
        luasSegitiga = findViewById(R.id.txt_luas);
        kelilingSegitiga = findViewById(R.id.txt_keliling);
        btnHitung = findViewById(R.id.btn_hitung);
        imgBackspace = findViewById(R.id.backspace);

        imgBackspace.setOnClickListener(this);

        btnHitung.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                int edt_sisiA = Integer.valueOf(sisiA.getText().toString());
                int edt_sisiB = Integer.valueOf(sisiB.getText().toString());
                int edt_sisiC = Integer.valueOf(sisiC.getText().toString());

                int segitgaluas = edt_sisiA * edt_sisiB / 2;
                int segitigakeliling = edt_sisiA + edt_sisiB + edt_sisiC;

                luasSegitiga.setText(String.valueOf(segitgaluas));
                kelilingSegitiga.setText(String.valueOf(segitigakeliling));
            }
        });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.backspace:
                Intent back = new Intent(SegitigaActivity.this, BidangDatarActivity.class);
                startActivityForResult(back, 2);
                break;
        }
    }
}