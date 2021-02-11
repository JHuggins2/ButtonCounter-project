package com.example.button_counter_huggins;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String TAG="MainActivity";

    private Button upButton;
    private Button downButton;
    private Button resetButton;
    private TextView counterText;
    private int count = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        counterText = findViewById(R.id.countTextId);
        upButton = findViewById(R.id.incrementButtonId);
        upButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counterText.setText(String.valueOf(++count));
                //Toast.makeText(getApplicationContext(), "Testing", Toast.LENGTH_SHORT).show();
                //Log.i(TAG, "Test Message");
            }
        });

        downButton = findViewById(R.id.decrementButtonId);
        downButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counterText.setText(String.valueOf(--count));
            }
        });

        resetButton = findViewById(R.id.resetButton);
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count = 0;
                counterText.setText(String.valueOf(count));
            }
        });
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putInt("countVal", count);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        count = savedInstanceState.getInt("countVal");
        counterText.setText(String.valueOf(count));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}