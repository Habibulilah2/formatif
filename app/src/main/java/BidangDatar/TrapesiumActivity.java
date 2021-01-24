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

public class TrapesiumActivity extends AppCompatActivity implements View.OnClickListener{

    TextView luasTrapesium;
    EditText a, b, tinggi;
    ImageView imgBackspace;
    Button btnHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trapesium);

        a = findViewById(R.id.edt_a);
        b = findViewById(R.id.edt_b);
        tinggi = findViewById(R.id.edt_tinggi);
        luasTrapesium = findViewById(R.id.txt_luas);
        btnHitung = findViewById(R.id.btn_hitung);
        imgBackspace = findViewById(R.id.backspace);

        imgBackspace.setOnClickListener(this);

        btnHitung.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                int edt_a = Integer.valueOf(a.getText().toString());
                int edt_b = Integer.valueOf(b.getText().toString());
                int edt_tinggi = Integer.valueOf(tinggi.getText().toString());

                int trapesiumluas = ((edt_a + edt_b) * edt_tinggi) / 2;

                luasTrapesium.setText(String.valueOf(trapesiumluas));
            }
        });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.backspace:
                Intent back = new Intent(TrapesiumActivity.this, BidangDatarActivity.class);
                startActivityForResult(back, 2);
                break;
        }
    }
}