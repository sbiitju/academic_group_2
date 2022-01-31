package com.shahinbashar.group_02;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LogInActivity extends AppCompatActivity {
    EditText email,password;
    String e,p;
    FirebaseAuth firebaseAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        email=findViewById(R.id.email);
        password=findViewById(R.id.password);

        firebaseAuth=FirebaseAuth.getInstance();
    }

    public void SignIn(View view) {
        e=email.getText().toString();
        p=password.getText().toString();
       firebaseAuth.signInWithEmailAndPassword(e,p).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
           @Override
           public void onComplete(@NonNull Task<AuthResult> task) {
          if(task.isSuccessful()){
              Toast.makeText(LogInActivity.this, "Success", Toast.LENGTH_SHORT).show();
              startActivity(new Intent(LogInActivity.this,MainActivity.class));
              finish();
          }else {
              Toast.makeText(LogInActivity.this, "Failed", Toast.LENGTH_SHORT).show();
          }
           }
       });

    }

    public void Registration(View view) {
        e=email.getText().toString();
        p=password.getText().toString();
        firebaseAuth.createUserWithEmailAndPassword(e,p).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful()){
                    Toast.makeText(LogInActivity.this, "Success", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(LogInActivity.this,MainActivity.class));
                    finish();
                }else {
                    Toast.makeText(LogInActivity.this, "Failed", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}