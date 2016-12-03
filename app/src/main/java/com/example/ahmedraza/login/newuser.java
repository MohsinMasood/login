package com.example.ahmedraza.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class newuser extends AppCompatActivity implements View.OnClickListener {
EditText username,email,pass,confirm;
    Button signup;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newuser);

        username=(EditText) findViewById(R.id.username);
        email=(EditText) findViewById(R.id.email);
        pass=(EditText) findViewById(R.id.pass);
        confirm=(EditText) findViewById(R.id.confirm);
        signup=(Button)findViewById(R.id.signup);

        signup.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {

        switch (v.getId()){
         case R.id.signup:
            break;




        }

    }
}
