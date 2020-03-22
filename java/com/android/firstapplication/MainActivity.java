package com.android.firstapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void SendMessage(View view){
        EditText InText = findViewById(R.id.in_text);
        String Message = InText.getText().toString();
        Intent intent = new Intent(this,SecondActivity.class);
        intent.putExtra("message", Message);
        startActivity(intent);
    }
}
