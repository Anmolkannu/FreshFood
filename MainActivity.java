package com.example.freshfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView t1;
    Button b1;
    Button b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=findViewById(R.id.text1);
        b1=findViewById(R.id.btn1);
        b2=findViewById(R.id.btn2);
        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v1) {
                openCustomerLogin();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v2) {
                openVendorLogin();
            }
        });
    }
    private void openVendorLogin()
    {
        Intent i=new Intent(this,VendorLogin.class);
        startActivity(i);
    }
    private void openCustomerLogin()
    {
        Intent i=new Intent(this,CustomerLogin.class);
        startActivity(i);
    }
}

