package com.example.liadrosenberg.application;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class RegActivity extends AppCompatActivity implements View.OnClickListener {
    Spinner spinner;
    EditText etname,etmail,etpass;
    TextView tvTologin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg);





        etmail=(EditText)findViewById(R.id.email);
        etpass=(EditText)findViewById(R.id.password);
        etname=(EditText)findViewById(R.id.input_name);
        tvTologin=(TextView)findViewById(R.id.Reglogin);

        tvTologin.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        Intent intent= new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
