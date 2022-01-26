package com.example.a52finaluri;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {

    private EditText editTextTextUserName, editTextTextPersonName3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_notifications);

        editTextTextUserName = (EditText) findViewById(R.id.editTextTextUserName);
        editTextTextPersonName3 = (EditText) findViewById(R.id.editTextTextPersonName3);


    }

}
