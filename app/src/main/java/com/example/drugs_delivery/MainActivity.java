package com.example.drugs_delivery;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

import com.example.drugs_delivery.database.DBHandler;

public class MainActivity extends AppCompatActivity {
     EditText cname,cnumber,caddress;
     DBHandler dbHandler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cname =findViewById(R.id.cname);
        cnumber=findViewById(R.id.cnumber);
        caddress=findViewById(R.id.caddress);
         dbHandler =new DBHandler();
    }
}