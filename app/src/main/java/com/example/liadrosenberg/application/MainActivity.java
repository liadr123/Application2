package com.example.liadrosenberg.application;

import android.content.Intent;
import android.nfc.Tag;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private FirebaseAuth mAuth;
    Button btnreg;
    EditText edpass,edmail,edname;
    TextView tvsignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     btnreg=(Button)findViewById(R.id.btn_reg);
     edpass=(EditText)findViewById(R.id.password);
     edmail=(EditText)findViewById(R.id.email);
     tvsignup=(TextView)findViewById(R.id.link_signup);

     tvsignup.setOnClickListener(this);
     btnreg.setOnClickListener(this);

        mAuth = FirebaseAuth.getInstance();



    }

    public   void  Register()
    {
        mAuth.createUserWithEmailAndPassword(edmail.getText().toString(),edpass.getText().toString())
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                           ;
                            Toast.makeText(MainActivity.this,"Registered successfully",Toast.LENGTH_SHORT).show();
                            ToLogin();

                        } else {
                            // If sign in fails, display a message to the user.

                            Toast.makeText(MainActivity.this, "Register failed.",
                                    Toast.LENGTH_SHORT).show();

                        }

                        // ...
                    }
                });
    }

   public void ToLogin()
   {
       Intent intent= new Intent(this,login.class);   //move to login screen
       startActivity(intent);
   }
    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        //updateUI(currentUser);
    }


    @Override
    public void onClick(View v) {
        if(v==tvsignup) {
            Intent intent = new Intent(this, login.class);  //if user already registered-move him to login screen
            startActivity(intent);
        }
        if (v==btnreg)
        {
            Register();
        }
    }
}
