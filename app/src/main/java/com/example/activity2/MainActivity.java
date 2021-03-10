package com.example.activity2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btlogin;
    EditText edemail, edpassword;
    String nama, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btlogin = findViewById(R.id.btLogin);
        edemail = findViewById(R.id.edEmail);
        edpassword = findViewById(R.id.edPassword);

     btlogin.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             nama = edemail.getText().toString();
             password = edpassword.getText().toString();

             String email = "user123@mail.com";
             String pass = "user";

             if (nama.equals(email) && password.equals(pass))
             {
                 Toast ss = Toast.makeText(getApplicationContext(),
                          "Login Sukses", Toast.LENGTH_LONG);
                 ss.show();
             }
             else if (nama.equals(email) || pass.equals(password))
             {
                 if(nama.equals(email))
                 {
                     Toast ps = Toast.makeText(getApplicationContext(),
                             "Password SALAH", Toast.LENGTH_LONG);
                     ps.show();
                 }
                 else
                 {
                     Toast es = Toast.makeText(getApplicationContext(),
                             "Email SALAH", Toast.LENGTH_LONG);
                     es.show();
                 }
             }
             else
             {
                 Toast ss2 = Toast.makeText(getApplicationContext(),
                          "Email dan Password SALAH",Toast.LENGTH_LONG);
                 ss2.show();
             }
         }
     });
    }

}