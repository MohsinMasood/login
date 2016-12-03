package com.example.ahmedraza.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener{

    Button newuser;
    Button existinguser;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        newuser=(Button)findViewById(R.id.newuser);

        existinguser=(Button)findViewById(R.id.existinguser);

        newuser.setOnClickListener(this);

        existinguser.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.newuser:
                startActivity(new Intent(this, newuser.class));
                break;
            case R.id.existinguser:
                startActivity(new Intent(this,existinguser.class));
                break;

    }



}
}
