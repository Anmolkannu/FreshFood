package com.example.freshfood;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.freshfood.Database.Accounts;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

public class CustomerRegistration extends AppCompatActivity {
    TextView t1,t2,t3,t4,t5;
    EditText Username,Password,Email,Phone;
    Button b;
    FirebaseFirestore db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_registration);
        t1 = findViewById(R.id.text1);
        t2 = findViewById(R.id.text2);
        t3 = findViewById(R.id.text3);
        t4 = findViewById(R.id.text4);
        t5 = findViewById(R.id.text5);
        Username = findViewById(R.id.edit1);
        Password = findViewById(R.id.edit2);
        Email = findViewById(R.id.edit3);
        Phone = findViewById(R.id.edit4);
        b = findViewById(R.id.btn);
        db = FirebaseFirestore.getInstance();
        b.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String username = Username.getText().toString();
                String password = Password.getText().toString();
                String email = Email.getText().toString();
                String phone = Phone.getText().toString();
                addData(username, password, email, phone);
            }
        });
    }

            private void addData(String Username, String Password, String Email, String Phone) {
                Accounts a = new Accounts(Username, Password, Email, Phone);
                db.collection("CustomerAccounts")
                        .add(a)
                        .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                            @Override
                            public void onSuccess(DocumentReference documentReference) {
                                Toast.makeText(getApplicationContext(), "Account Created!", Toast.LENGTH_LONG).show();
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Toast.makeText(getApplicationContext(), "Error :" + e.getMessage(), Toast.LENGTH_LONG).show();
                            }
                        });
            }}



