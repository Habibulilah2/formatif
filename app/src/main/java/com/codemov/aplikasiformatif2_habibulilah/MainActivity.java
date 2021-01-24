package com.codemov.aplikasiformatif2_habibulilah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button masuk_akun, masuk_akun_baru;
    EditText user,pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        masuk_akun = findViewById(R.id.btn_login);
        pass = findViewById(R.id.edt_pass);
        user = findViewById(R.id.edt_user);
        masuk_akun_baru = findViewById(R.id.btn_signup);

        masuk_akun.setOnClickListener(this);
        masuk_akun_baru.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_login:
                String username = user.getText().toString();
                String password = pass.getText().toString();
                if(username.length() < 6){
                    user.setError("Username Harus Lebih Dari 6 Karakter");
                } else if(password.length() < 8){
                    pass.setError("Password Harus Lebih Dari 8 Karakter");
                } else {
                    Intent home = new Intent(MainActivity.this, HomeActivity.class);
                    startActivityForResult(home, 2);
                }
                break;
            case  R.id.btn_signup:
                Intent signup = new Intent(MainActivity.this, SignUpActivity.class);
                startActivityForResult(signup, 2);
                break;
        }
    }
}