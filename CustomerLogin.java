package com.example.freshfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class CustomerLogin extends AppCompatActivity {
    TextView t1;
    EditText e1,e2;
    Button b1,b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_login);
        t1=findViewById(R.id.text1);
        e1=findViewById(R.id.edit1);
        e2=findViewById(R.id.edit2);
        b1=findViewById(R.id.btn1);
        b2=findViewById(R.id.btn2);
        b3=findViewById(R.id.btn3);
        b3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                openCustomerRegistration();
            }
        });

    }
    private void openCustomerRegistration()
    {
        Intent i=new Intent(this,CustomerRegistration.class);
        startActivity(i);
    }
}
