package com.example.ahmedraza.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class existinguser extends AppCompatActivity implements View.OnClickListener {

    EditText email,pass;
    Button forget,signup;
    String editemail,editpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_existinguser);

        email = (EditText) findViewById(R.id.email);
        pass = (EditText) findViewById(R.id.pass);
        forget=(Button) findViewById(R.id.forget);
        signup=(Button) findViewById(R.id.signup);

        forget.setOnClickListener(this);
        signup.setOnClickListener(this);






    }

    @Override
    public void onClick(View v) {

        editemail = email.getText().toString();
        editpass = pass.getText().toString();

        if (editemail.equals("abc")  && editpass.equals("123"))

        {
            Toast.makeText(existinguser.this, "confirm ", Toast.LENGTH_SHORT).show();

         /*   switch (v.getId()) {

                case R.id.forget:
                    break;
                case R.id.signup:
                    startActivity(new Intent(this, newuser.class));
                    break;


            }
*/
        }

        else {

            Toast.makeText(existinguser.this, "invalid", Toast.LENGTH_SHORT).show();
        }
     /*   switch (v.getId()) {

            case R.id.forget:
                break;
            case R.id.signup:
                startActivity(new Intent(this, newuser.class));
                break;


        }

*/
    }}

