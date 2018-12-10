package com.example.liadrosenberg.application;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class login extends AppCompatActivity implements View.OnClickListener {
EditText edmail,edpassword;
Button btnlogin;
TextView tvReg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edmail=(EditText)findViewById(R.id.email);
        edpassword=(EditText)findViewById(R.id.password);
        btnlogin=(Button)findViewById(R.id.btn_login);
        tvReg=(TextView)findViewById(R.id.link_signup);

        tvReg.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent= new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
