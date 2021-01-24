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

public class LayangLayangActivity extends AppCompatActivity implements View.OnClickListener{

    TextView luasLayangLayang;
    EditText d1, d2;
    ImageView imgBackspace;
    Button btnHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layang_layang);

        d1 = findViewById(R.id.edt_d1);
        d2 = findViewById(R.id.edt_d2);
        luasLayangLayang = findViewById(R.id.txt_luas);
        btnHitung = findViewById(R.id.btn_hitung);
        imgBackspace = findViewById(R.id.backspace);

        imgBackspace.setOnClickListener(this);

        btnHitung.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                int edt_d1 = Integer.valueOf(d1.getText().toString());
                int edt_d2 = Integer.valueOf(d2.getText().toString());

                int layanglayangluas = edt_d1 * edt_d2 / 2;

                luasLayangLayang.setText(String.valueOf(layanglayangluas));
            }
        });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.backspace:
                Intent back = new Intent(LayangLayangActivity.this, BidangDatarActivity.class);
                startActivityForResult(back, 2);
                break;
        }
    }
}