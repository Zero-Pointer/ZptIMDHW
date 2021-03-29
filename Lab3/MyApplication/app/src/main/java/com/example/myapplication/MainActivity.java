package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Console;

public class MainActivity extends AppCompatActivity {
    static int count_num = 0;
    public void showToast(View view) {
        String msg = "Hello Toast!";
        Toast toast = Toast.makeText(
                this, msg, (int) 1.5);
        toast.show();
    }
    public void countAdd(View view) {
        System.out.println("Tap!");
        TextView textView = (TextView) findViewById(R.id.textView);
        Button countButton = findViewById(R.id.count_button);
        Button zeroButton = findViewById(R.id.zero_button);
        textView.setText(Integer.toString(++count_num));
        if(count_num % 2 == 0){
            countButton.setBackgroundColor(Color.parseColor("#2196F3"));
        }else{
            countButton.setBackgroundColor(Color.GREEN);
        }
        zeroButton.setBackgroundColor(Color.parseColor("#009688"));
        System.out.println(textView.toString());
    }
    public void zeroFunc(View view){
        TextView textView = findViewById(R.id.textView);
        textView.setText(Integer.toString(0));
        Button countButton = findViewById(R.id.count_button);
        Button zeroButton = findViewById(R.id.zero_button);
        zeroButton.setBackgroundColor(Color.parseColor("#808080"));
        countButton.setBackgroundColor(Color.parseColor("#2196F3"));
        count_num = 0;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}