package com.codewithsoumik.farmeasyapp;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class LoginActivity extends AppCompatActivity {

    ImageView img;
    Button SignIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        img = findViewById(R.id.GoBackIcon);
        SignIn = findViewById(R.id.SignIn);

        SignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browerIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://austinkuriakose.github.io/FarmEasy/"));
                startActivity(browerIntent);
            }
        });
    }

    public void goback(View view) {
        Intent ic = new Intent(LoginActivity.this,MainActivity.class);
        startActivity(ic);
    }
}
