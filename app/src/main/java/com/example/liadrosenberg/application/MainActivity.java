package com.example.liadrosenberg.application;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnlogin;
    EditText etpass,etmail;
    TextView tvsignup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     btnlogin=(Button)findViewById(R.id.btn_login);
     etpass=(EditText)findViewById(R.id.password);
     etmail=(EditText)findViewById(R.id.email);
     tvsignup=(TextView)findViewById(R.id.link_signup);


     tvsignup.setOnClickListener((View.OnClickListener) this);


    }

    @Override
    public void onClick(View v) {
        Intent intent= new Intent(this,RegActivity.class);
        startActivity(intent);
    }
}
