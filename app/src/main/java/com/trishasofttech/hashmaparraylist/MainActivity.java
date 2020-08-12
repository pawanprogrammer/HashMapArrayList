package com.trishasofttech.hashmaparraylist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    /*declare the java objects*/
    private Button save, view;
    private EditText username, email, password;
    private TextView msg;
    /*delcare to store the Data into HashMap*/
    HashMap<String, String> hashMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*intialize the java objects from xml widgets*/
        save = findViewById(R.id.save);
        view = findViewById(R.id.view);
        username = findViewById(R.id.username);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        msg = findViewById(R.id.msg);

        /*to intialize the HashMap for store the key value data*/
        hashMap = new HashMap<>();
        /*to click the save button for store the data into HashMap*/
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*to put the data into hashmap object in key value pair*/
                hashMap.put("usernamekey", username.getText().toString());
                hashMap.put("emailkey", email.getText().toString());
                hashMap.put("passwordkey", password.getText().toString());
                Toast.makeText(MainActivity.this, "Data store Successfully", Toast.LENGTH_LONG).show();
                /*to clear the form*/
                username.setText("");
                email.setText("");
                password.setText("");
            }
        });
        
        /*to click on the view button for display the data from HashMap*/
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 String susername, semail, spassword;
                 susername = hashMap.get("usernamekey");
                 semail = hashMap.get("emailkey");
                 spassword = hashMap.get("passwordkey");
                /*to display the data into textview msg*/
                msg.setText(susername +"\n"+ semail + "\n" + spassword);
            }
        });
    }
}