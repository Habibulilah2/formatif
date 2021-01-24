package com.codemov.aplikasiformatif2_habibulilah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_daftar_akun;
    EditText edtfirstname, edtlastname, edtemail, edtpass;
    TextView tvloginnow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        //Inialisasi variable dengan id yang ada di activity_sign_up
        btn_daftar_akun = findViewById(R.id.btn_daftar_akun);
        edtfirstname = findViewById(R.id.edt_firstname);
        edtlastname = findViewById(R.id.edt_lastname);
        edtemail = findViewById(R.id.edt_email);
        edtpass = findViewById(R.id.edt_pass);
        tvloginnow = findViewById(R.id.loginnow);

        //Handling Halaman
        btn_daftar_akun.setOnClickListener(this);
        tvloginnow.setOnClickListener(this);
    }

        @Override
        public void onClick(View view){
            switch (view.getId()) {
                case R.id.btn_daftar_akun:
                    //handling login
                    String firstname = edtfirstname.getText().toString();
                    String lastname = edtlastname.getText().toString();
                    String email = edtemail.getText().toString();
                    String password = edtpass.getText().toString();
                    //kondisi error
                    if (firstname.length() < 6) {
                        edtfirstname.setError("Nama Awal harus lebih dari 6 karakter");
                    } else if (lastname.length() < 6) {
                        edtlastname.setError("Nama Belakang harus lebih dari 6 karakter");
                    } else if (email.length() < 15) {
                        edtemail.setError("Email harus lebih dari 15 karakter");
                    } else if (password.length() < 6) {
                        edtpass.setError("Password harus lebih dari 6 karakter");
                    } else {
                        //jika data sudah terpenuhi
                        Intent login = new Intent(SignUpActivity.this, MainActivity.class);
                        startActivityForResult(login, 2);
                    }
                    break;
                case R.id.loginnow:
                    Intent signin = new Intent(SignUpActivity.this, MainActivity.class);
                    startActivityForResult(signin, 2);
            }
        }
}