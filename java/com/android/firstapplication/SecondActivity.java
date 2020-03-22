package com.android.firstapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.widget.TextView;
import android.os.Bundle;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        String Message = intent.getStringExtra("message");
        TextView OutText = findViewById(R.id.out_text);

        OutText.setText(Message);
    }
}
