package com.example.hw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    static int count = 0;
    TextView textView;
    public static final String EXTRA_MESSAGE =
            "com.example.hw.extra.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        textView.setText(Integer.toString(count));
    }

    public void countNumber(View view) {
        count++;
        textView.setText(Integer.toString(count));
    }

    public void sayHello(View view) {
        Intent intent = new Intent(this, MainActivity2.class);
        String message = textView.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}