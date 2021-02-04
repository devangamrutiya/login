package com.dev.rlogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    database db;
     EditText eName;
     EditText ePassword;
     Button   Login;
     TextView Info;
     
     String Username = "Admin";
     String Password = "123456";

    boolean isValid = false;
    private  int counter = 5;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = new database(this);
        eName = findViewById(R.id.txtUsername);
        ePassword = findViewById(R.id.etPassword);
        Login = findViewById(R.id.btnLogin);
        Info = findViewById(R.id.tvInfo);

        Login.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                String inputName = eName.getText().toString();
                String inputPassword = ePassword.getText().toString();

                if(inputName.isEmpty() || inputPassword.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "please enter all details" , Toast.LENGTH_SHORT).show();

                }else {

                    isValid = validate(inputName , inputPassword);

                    if (!isValid){
                        counter--;
                        Toast.makeText(MainActivity.this, "incorrect password " , Toast.LENGTH_SHORT).show();


                        if (counter == 0);{

                            Login.setEnabled(false);

                        }



                    }else{

                        Toast.makeText(MainActivity.this, "Login done" , Toast.LENGTH_SHORT).show();

                        //Add the code to new activity

                    }

                }
            }
        });

    }
    private boolean validate(String name, String password){

        if (name.equals
                (Username) && password.equals(Password))
        {


            return true;
        }

         return false;
    }


}
