package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    private EditText etPassword, etLogin;
    private Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etLogin=findViewById(R.id.etLogin);
        etPassword=findViewById(R.id.etLogin);
        btnLogin=findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userName=etLogin.getText().toString();
                String password=etPassword.getText().toString();
                if(userName.equals("admin")&&password.equals("admin"))
                {
                    Intent intent=new Intent(LoginActivity.this,MenuActivity.class);
                    startActivity(intent);
                }
            }
        });
    }


}