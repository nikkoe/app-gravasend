package com.example.gravasend;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    private TextInputLayout unameInput;
    private TextInputLayout passInput;
    private TextInputEditText accountNumberEditText;
    private TextInputEditText passwordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        // Initialize views
        unameInput = findViewById(R.id.unameInput);
        passInput = findViewById(R.id.passInput);
        accountNumberEditText = findViewById(R.id.accountNumberEditText);
        passwordEditText = findViewById(R.id.passwordEditText);

        // Initialize the SignInButton and set an OnClickListener
        findViewById(R.id.SignInButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle the SignInButton click event here
                // You can add your logic for signing in and authentication here
                // For demonstration purposes, we'll start the HomeActivity
                startHomeActivity();
            }
        });
    }

    private void startHomeActivity() {
        // Create an Intent to start the HomeActivity
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }
}
