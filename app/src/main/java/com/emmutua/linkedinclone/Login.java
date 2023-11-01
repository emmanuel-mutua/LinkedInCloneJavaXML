package com.emmutua.linkedinclone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class Login extends AppCompatActivity {
    MaterialButton loginButton;
    EditText email, password;
    TextView signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        signUp = findViewById(R.id.sign_up_button);
        loginButton = findViewById(R.id.login_button);
        loginButton.setOnClickListener(v -> {
            if (email.getText().toString().isEmpty() && password.getText().toString().isEmpty()) {
                Toast.makeText(this, "Input Email and Password", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(Login.this, "Success", Toast.LENGTH_SHORT).show();
            }
        });
        signUp.setOnClickListener(v -> {
            startActivity(new Intent(Login.this, SignUp.class));
            finish();
        });
    }
}