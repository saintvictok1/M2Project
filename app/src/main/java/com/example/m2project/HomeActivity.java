package com.example.m2project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    //declare variables
    EditText username, password;
    Button loginbutton, homeregisterbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        // Link android fields and buttons
        username = (EditText) findViewById(R.id.editTextTextEmailAddress);
        password = (EditText) findViewById(R.id.editTextTextPassword);
        homeregisterbutton = (Button) findViewById(R.id.register_button);
        loginbutton = (Button) findViewById(R.id.login_button);


        //OnClick listener for Register Button to navigate to Registration Page
        homeregisterbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startRegister = new Intent(view.getContext(), RegistrationPage.class);
                startActivity(startRegister);
            }
        });

        //Onclick listener for Login Button to start Login process
        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login();
            }
        });

    }//end of OnCreate

    public void login() {
        //Store input variables from login home screen
        isEmpty();
        String user = username.getText().toString().trim();
        String pass = password.getText().toString().trim();


    }

    public void isEmpty() {
        if (username.getText().toString().equals("") | password.getText().toString().equals("")) {
            Toast.makeText(this, "Fields cannot be empty!", Toast.LENGTH_LONG).show();
        }

    }
}

