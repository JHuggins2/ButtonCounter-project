package com.example.button_counter_huggins;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String TAG="MainActivity";
    private Button upButton;
    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        upButton = findViewById(R.id.increment);
        upButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                upButton.setText("Count: " + ++count);
                Toast.makeText(getApplicationContext(), "Testing", Toast.LENGTH_SHORT).show();
                Log.i(TAG, "Test Message");
            }
        });
    }
}