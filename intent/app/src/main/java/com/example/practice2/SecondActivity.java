package com.example.practice2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity implements SecondActivitys, FirstActivity {
    private TextView receivedData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        receivedData = findViewById(R.id.received_data);
        Intent intent = getIntent();
        String data = intent.getStringExtra("data");
        receivedData.setText(data);
    }
}
