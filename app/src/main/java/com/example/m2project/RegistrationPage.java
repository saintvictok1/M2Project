package com.example.m2project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.Calendar;

public class RegistrationPage extends AppCompatActivity {

EditText firstname, lastname, dob, email, password;
Button confirmregistrationbutton;
boolean allfieldschecked = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_page);

        //Link variables to android fields and buttons
         firstname = (EditText) findViewById(R.id.editTextFirstName);
         lastname = (EditText) findViewById(R.id.editTextLastName);
         dob = (EditText) findViewById(R.id.editTextDob);
         email = (EditText) findViewById(R.id.editTextEmailAddress);
         password = (EditText) findViewById(R.id.editTextPassword);
         confirmregistrationbutton = (Button) findViewById(R.id.fin_registrationButton);

         //Register button Action
         confirmregistrationbutton.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 allfieldschecked = CheckFields();
                 if (allfieldschecked) {
                     //Toast.makeText(this, "REGISTERED!", Toast.LENGTH_LONG).show();
                     //Intent goHome = new Intent(this, HomeActivity.class);
                     //startActivity(goHome);
                 }
             }
         });


    }//End OnCreate
    private boolean CheckFields(){
        if(firstname.length() == 0){
            firstname.setError("First Name is required");
            return false;
        }
        if(lastname.length() == 0){
            lastname.setError("Last Name is required");
            return false;
        }
        if(dob.length() == 0 ){
            dob.setError("Date of Birth is required");
        }
        if(email.length() == 0) {
            email.setError("Email is required");
            return false;
        }else if (!email.getText().toString().contains("@")){
            email.setError("This is not a valid Email Address");
                    return false;
        }
        if(password.length() == 0){
            password.setError("Password is required");
            return false;
        }
            return true;

    }
}