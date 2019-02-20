package com.example.parul.expensemanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.UUID;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        String uniqueID = UUID.randomUUID().toString();
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference(uniqueID);
        super.onCreate(savedInstanceState);
        List obj=new List("Pav","154shjh",5,25);
        myRef.setValue(obj);

     }
    public void grocery(View view)
    {
        Intent i=new Intent(this,Grocery.class);
        startActivity(i);
    }
    public void employee(View view)
    {
        Intent i=new Intent(this,Employee.class);
        startActivity(i);
    }
}
