package com.example.tecnologia;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    private EditText inputUsername;
    private EditText inputPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        inputUsername = findViewById(R.id.inputUsername);
        inputPassword = findViewById(R.id.inputPassword);
        Button loginButton = findViewById(R.id.loginButton);
        TextView demoCredentials = findViewById(R.id.demoCredentials);

        demoCredentials.setText("Acceso de estudiante • Tecnología");

        loginButton.setOnClickListener(v -> attemptLogin());
    }

    private void attemptLogin() {
        String username = inputUsername.getText().toString().trim();
        String password = inputPassword.getText().toString();

        if (TextUtils.isEmpty(username)) {
            inputUsername.setError("Escribe tu usuario");
            inputUsername.requestFocus();
            return;
        }

        if (TextUtils.isEmpty(password)) {
            inputPassword.setError("Escribe tu contraseña");
            inputPassword.requestFocus();
            return;
        }

        if (username.equalsIgnoreCase("Alejandro") && password.equals("12345678")) {
            Intent intent = new Intent(LoginActivity.this, MainActivity.class);
            intent.putExtra(MainActivity.EXTRA_USERNAME, "Alejandro");
            startActivity(intent);
            finish();
        } else {
            Toast.makeText(this, "Usuario o contraseña incorrectos", Toast.LENGTH_SHORT).show();
            inputPassword.setText("");
            inputPassword.requestFocus();
        }
    }
}
