package com.example.getsource;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private static String protocol = "http://";
    private TextView codeText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = findViewById(R.id.label_spinner);
        codeText = findViewById(R.id.codeText);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.labels_array, R.layout.support_simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        if(spinner != null){
            spinner.setOnItemSelectedListener(this);
            spinner.setAdapter(adapter);
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String spinnerLabel = adapterView.getItemAtPosition(i).toString();
//        Log.d("lable", spinnerLabel);
        protocol = spinnerLabel;
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    public void getSource(View view) {
        TextView netText = findViewById(R.id.netText);
        String address = protocol + netText.getText().toString();
        new FetchSource(codeText).execute(address);

    }
}