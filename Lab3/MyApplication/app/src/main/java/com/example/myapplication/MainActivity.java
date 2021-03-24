package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
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
        textView.setText(Integer.toString(++count_num));
        System.out.println(textView.toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}